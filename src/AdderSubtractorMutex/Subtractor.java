package AdderSubtractorMutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value v;
    private Lock lock;
    Subtractor(Value x, Lock lock){
        v = x;
        this.lock = lock;
    }

    public Void call (){

        for(int i = 1;i <=10000; i++){
//            if(i == 100){
//                System.out.println("Adasd");
//            }
            lock.lock();
            if(i == 5000)
            {
                System.out.println("hi");
            }
            System.out.println("Lock acquired from Subtractor : " + i);
            this.v.value -= i;
            lock.unlock();

        }
//        lock.unlock();
        return null;
    }
}
