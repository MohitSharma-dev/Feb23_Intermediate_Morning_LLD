package IntroToThreads;

public class Client {
    public static void main(String[] args) {
        Runnable x = new HelloWorldPrinter();
//        x.run();
        Thread t = new Thread(x);
        t.start();
        System.out.println("Current Thread : " + Thread.currentThread().getName());
    }
}