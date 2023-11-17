package Collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>();
        List<Integer> newList1 = new LinkedList<>();
        List<Integer> newList2 = new Vector<>();
        List<Integer> newList3 = new Stack<>();


        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(1);
        s1.add(4);
        s1.add(15);
        s1.add(-1);
        for(Integer x : s1){
            System.out.println(x);
        }
        Set<Integer> s2 = new LinkedHashSet<>();
        s2.add(10);
        s2.add(1);
        s2.add(4);
        s2.add(15);
        s2.add(-1);
        for(Integer x : s2){
            System.out.println(x);
        }

        Payment p = new Payment();
        // Link below will not work
        // p.status = " MUjhe nahi pata";
        p.status = PaymentStatus.SUCCESS;

        Set<PaymentStatus> paymentStatuses = EnumSet.allOf(PaymentStatus.class);
        for(PaymentStatus p1 : paymentStatuses){
            System.out.println(p1);
        }

        Queue<String> queue = new PriorityQueue<>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");
        while(!queue.isEmpty())
        {
            System.out.println(queue.peek());
            queue.poll();
        }

        List<Student> students = new ArrayList<>(List.of(
                new Student(1 , "Mohit", 25 , 50.0),
                new Student(3 , "Ayushi", 27 , 90.0),
                new Student(2 , "Himanshu", 30 , 25.0)
        ));
        // We need to give a natural ordering - Comparable
        Collections.sort(students, new StudentPSPComparator());
        Collections.sort(students, (o1 , o2) -> {
            if(o1.age == o2.age){
                return 0;
            } else if (o1.age < o2.age){
                return -1;
            }
            return 1;
        });
        System.out.println("Hey!");
    }
}
