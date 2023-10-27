package Inheritance;

public class Student extends User{
    int student_id;

    void doSomething(){
        student_id = 45;
        user_name = "Mohit";
        user_id = 90;
        age = 56;
        // can't access the private members of the parent class
        // outside the parent class
//        token = "ada";
    }

}
