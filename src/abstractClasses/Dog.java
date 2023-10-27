package abstractClasses;

public class Dog extends Animal{
    Dog(){
        super("Dog");
    }

    @Override
    void move() {
        System.out.println("Dog is running");
    }
}
