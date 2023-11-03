package AdderSubtractorSynchronized;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    private Lock lock;

    Adder(Value x, Lock lock){
        v = x;
        this.lock = lock;
    }
    public Void call (){
//        lock.lock();
        for(int i = 1;i <=50000; i++){
//            System.out.println("Lock acquired from Adder : " + i);
//            synchronized (v){
//                this.v.value += i;
//            }
            this.v.incrementBy(i);

        }
//        lock.unlock();
        return null;
    }
}


// int -> Integer
// void -> Void
