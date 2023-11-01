package ThreadNumberPrinter;

public class NumberPrinter implements Runnable{
    private int noToPrint;
    @Override
    public void run() {
        System.out.println("Number : " + noToPrint + " Thread : " + Thread.currentThread().getName());
    }

    NumberPrinter(int x){
        this.noToPrint = x;
    }
}
