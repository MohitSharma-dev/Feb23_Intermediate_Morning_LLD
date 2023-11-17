package Generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair<Integer , Integer > p = new Pair<Integer, Integer>();
        p.setSecond(5);
        // This will throw compile time error
//        String s = p.getFirst();
        int x = p.getFirst();
        Pair<Integer , String> y = new Pair<>();
        List<Pair<String, Integer>> p1 = new ArrayList<>();

        Pair p2 = new Pair();
        p2.setSecond(new Object());
        String temp = (String) p2.getSecond();

        List<Pair> p4 = new ArrayList<>();

        Integer x4 = Pair.doSomething("Mohit", 5);

        double x10 = p.addition(5.0 , 6);
    }
}

