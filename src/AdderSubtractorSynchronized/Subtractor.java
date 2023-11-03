package AdderSubtractorSynchronized;

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

        for(int i = 1;i <=50000; i++){
//            if(i == 100){
//                System.out.println("Adasd");
//            }

//            synchronized (v){
//                this.v.value -= i;
//            }
            this.v.decrementBy(i);
        }
//        lock.unlock();
        return null;
    }
}
