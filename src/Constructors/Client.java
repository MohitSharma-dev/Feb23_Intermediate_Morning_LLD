package Constructors;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        Student y = new Student(1 , "Mohit", 90.0);
        Student z = new Student(y);
        z.id = 10;
        z.name = "XYZ";
        z.exam.exam_id = 5;
        System.out.println("Something is !");

//        Student st1 = st2;
    }
}
