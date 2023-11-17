package ProducerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    private Store store;
    public Semaphore prodSema;
    public Semaphore consSema;
    Producer(Store st, Semaphore prodSema, Semaphore consSema) {
        this.store = st;
        this.consSema = consSema;
        this.prodSema = prodSema;
    }
    @Override
    public void run() {
        while(true){
//                    System.out.println("Cleared production check");
            try {
                prodSema.acquire();
//                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItem();
            consSema.release();
        }
    }
}
