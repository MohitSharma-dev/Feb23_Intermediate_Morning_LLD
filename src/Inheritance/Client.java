package Inheritance;

public class Client {
    public static void doSomething(int x , int y){
//        a.walk();
    }

    public static void doSomething(double y , int x){
//        a.walk();
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.age = 20;
        s.user_name = "Mohit";
        s.user_id = 4;
//        s.token = "adad";

//        D d = new D();
        D d1 = new D("Parameter hu main!");

        C x = new D();
        A a = new D();
        // A a = new B();
//        a.walk();
//        x.walk();
        x.bark();
        doSomething(1 , 2);
        Runner x1 = new D();
//        x1.walk();
        System.out.println("Somethinbg");
    }


}

//D() -> constructor of d -> constructor of C -> Constructor of B -> constructor of A