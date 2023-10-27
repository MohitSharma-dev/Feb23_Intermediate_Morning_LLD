package abstractClasses;

public class Dog extends Animal{
    static int something = 5;
    final int y = 10;
    Dog(){
        super("Dog");
        something += 1;
        // can't reassigned the final variable once assigned
        // y = 5;
    }

    @Override
    void move() {
        System.out.println("Dog is running");
    }

    final void finalMethod(){
        System.out.println("My life my rules!");
    }
    static void doSomething(){
        System.out.println("I am a general dog");
    }
}
