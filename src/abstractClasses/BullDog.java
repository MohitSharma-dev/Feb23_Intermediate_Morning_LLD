package abstractClasses;

public class BullDog extends Dog{
    // static methods can't be overriden
    static int something = 1;
    int id = 0;
    static void doSomething(){
        System.out.println("I am a bulldog!");
        // can't access the instance variable from a static method
        //        System.out.println(id);
    }

    void doAnotherThing(){
        System.out.println(something);
    }

    // can't override the final method
//    void finalMethod(){
//
//    }

    // Non static member have access static ones
    // Read about static blocks

    // final
        // final data member
            // one initialised , you can't change these
        // final method
            // final method can't be overriden by the child class
        // final class
            // can't extend the final class

}
