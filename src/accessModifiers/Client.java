package accessModifiers;

import IntrotoOOP.Student;

public class Client{
    public static void main(String[] args) {
        Student x = new Student();
        // age is public : can be accessed in diff package
        x.age = 45;
        // protected members can only be accessed through child classes in diff packages
//        x.name = "Mohit";
        // default members can't be access outside the package
//        x.batch = "Feb23";
//        x.psp = 10.0;
        // private can't be accessed outside the class
//        x.id = 1;

        Instructor i = new Instructor();
//        i.user_name = "";
        System.out.println(x);

    }

    void doSomething(){
//        this.name = "Mohit sharma";
    }
}

// x is just a variable -> address of where the object is lying
// created a house
// address of the house
