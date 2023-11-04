package ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Store store;
    public Semaphore prodSema;
    public Semaphore consSema;

    Consumer(Store st, Semaphore prodSema , Semaphore consSema){
       this.store = st;
       this.consSema = consSema;
       this.prodSema = prodSema;
    }
    @Override
    public void run() {
        while(true){
            try {
                consSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItem();
            prodSema.release();
        }
    }
}
