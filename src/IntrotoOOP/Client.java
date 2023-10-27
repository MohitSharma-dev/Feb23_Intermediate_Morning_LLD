package IntrotoOOP;

//import Constructor.Cat;

public class Client {
    public static void main(String[] args) {
        Student x = new Student();
        x.age = 45;
        x.name = "Mohit";
        x.batch = "Feb23";
        x.psp = 10.0;
        // private member : can't be accessed outside the class
//        x.id = 1;

        System.out.println(x.getId());
        Constructors.Student x1 = new Constructors.Student();

    }
}

// x is just a variable -> address of where the object is lying
// created a house
// address of the house
