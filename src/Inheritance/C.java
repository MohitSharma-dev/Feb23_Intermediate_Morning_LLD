package Inheritance;

public class C extends B{
    C(){
        System.out.println("Constructor of C is called");
    }

    C(String something){
        this();
        System.out.println(something);
    }

    void bark(){

    }

    private void walk(String s){

    }
}
