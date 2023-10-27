package abstractClasses;

public class Client {
    public static void main(String[] args) {
        // We can't create the object of the abstract class
        // Animal x = new Animal();
        Animal x = new Dog();
        x.move();
        System.out.println("");
    }
}
