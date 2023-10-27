package Inheritance;

public class D extends C implements Runner{

    D(){
        System.out.println("Constructor of D is called");
    }

    D(String something){
        super("C ka parameter hu main");
        System.out.println(something);
    }

    void walk(){
        System.out.println("Walking");
    }

//   void walk(String) will be inherited
    // this is not allowed
    String walk(String s) {
        return "Mohit";
    }

//    void walk(String s){
//
//    }


    @Override
    public void run() {

    }
}
