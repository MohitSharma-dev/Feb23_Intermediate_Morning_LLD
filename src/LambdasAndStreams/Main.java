package LambdasAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // way - 1
        SomethingDoer x = new SomethingDoer();
        Thread t = new Thread(x);
        t.start();

        // Default and static methods allowed in interfaces
        // need not to be implemented
        // EX : Comparator Interface

        // way - 2
        Runnable r = () -> {
            System.out.println("hey there");
        };
        Thread t1 = new Thread(r);
        t1.start();

        System.out.println("TEMP");

        // way - 3

        Thread t2 = new Thread(() -> {
            System.out.println("hey there");
        });

        Thread t3 = new Thread(() -> System.out.println("Hi"));

        List<Integer> list_x = new ArrayList<>();
        list_x.add(11);
        list_x.add(24);
        list_x.add(12);
        list_x.add(4);
        list_x.add(5);

        Stream<Integer> s = list_x.stream();
        s.forEach((elem) -> System.out.println(elem));

        // Intermediate and Terminal methods

        // forEach : terminal
        // filter : intermediate
        // collect : terminal
        // Once a terminal operation is done on a stream, it is closed
        // you have to open a new stream to work on data source
//        s = s.filter((elem) -> elem % 2 == 0);
        Stream<Integer> s1 = list_x.stream();
                        s1
                        .filter((elem) -> {
                            System.out.println("Filtering " + elem);
                            return elem % 2 == 0;
                        })
                        .forEach((elem) -> {
                            System.out.println("My element " + elem);
                        });

                        // filter
        //for(){}
        // for each loop

        Stream<Integer> s2 = list_x.stream();
        List<String> temp = s2
                .filter((elem) -> {
                    System.out.println("Filtering " + elem);
                    return elem % 2 == 0;
                })
                .sorted()
                .map((elem) -> "Hi " + elem)
                .collect(Collectors.toList());

        for(String x1 : temp){
            System.out.println(x1);
        }

        for(Integer x2 : list_x){
            System.out.println(x2);
        }

        //filtering
//        for(Integer x3 : list_x){
//            if(x3 % 2 == 0){
//                new_list.add(x);
//            }
//        }

        Optional<String> s5 = list_x.stream()
                .sorted((o1 , o2) -> {
                    System.out.println("Sorting " + o1 + " " + o2);
                    return o1-o2;
                })
                .filter((elem) -> {
                    System.out.println("Filtering " + elem);
                    return elem % 2 == 0;
                })
                .map((elem) -> {
                    System.out.println("Mapping " + elem);
                    return "Hi " + elem;
                })
                .findFirst();

        if(s5.isPresent()){
            System.out.println(s5.get());
        }

        // read about reduce() operation
    }
}
