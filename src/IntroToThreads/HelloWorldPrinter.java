package IntroToThreads;

import Inheritance.Runner;

import java.util.Random;

public class HelloWorldPrinter implements Runnable {
    void doSomething(){
        System.out.println("I am doing something in " + Thread.currentThread().getName());
    }
    @Override
    public void run() {
        System.out.println("Hello world from " + Thread.currentThread().getName());
        doSomething();
    }
}
