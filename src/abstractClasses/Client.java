package abstractClasses;

public class Client {
    public static void main(String[] args) {
        // We can't create the object of the abstract class
        // Animal x = new Animal();
        Animal x = new Dog();
        x.move();
        x.printName();
        System.out.println(Dog.something);
        Dog d = new Dog();
        d.printName();
        Dog d1 = new Dog();
        System.out.println(Dog.something);
        System.out.println(d1.something);
        System.out.println(d.something);
//        Dog.doSomething();
        System.out.println("");

        Dog d5 = new BullDog();
        d5.doSomething();
        BullDog bd = new BullDog();
        bd.doSomething();
        System.out.println(BullDog.something);
        System.out.println(Dog.something);
    }
}
