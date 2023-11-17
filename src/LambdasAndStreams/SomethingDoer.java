package LambdasAndStreams;

public class SomethingDoer implements Runnable{
    @Override
    public void run() {
        System.out.println("Hey there!");
    }
}
