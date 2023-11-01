package ThreadNumberPrinter;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool();
        for(int i = 1; i <=100; i = i + 1){
            if(i == 80){
                System.out.println("Anything");
            }
            NumberPrinter x = new NumberPrinter(i);
//            x.run();
//            Thread t = new Thread(x);
//            t.start();
            es.execute(x);
        }
    }
}
