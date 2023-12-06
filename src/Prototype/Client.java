package Prototype;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry){
        Student apr21BatchStudent = new Student();
        apr21BatchStudent.setBatch("Apr21Batch");
        apr21BatchStudent.setPsp(100.0);

        studentRegistry.register("Apr21BatchStudent" , apr21BatchStudent);

    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student std = studentRegistry.get("Apr21BatchStudent");
    }
}
