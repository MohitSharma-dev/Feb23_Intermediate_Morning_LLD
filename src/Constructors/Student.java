package Constructors;

public class Student {
    int id;
    String name;
    double psp;
    Exam exam;
    public Student(){
        this.psp = 100.0;
        this.name = "Some student";
    }

    Student(int id , String name, double psp) {
        this.id = id;
        this.name = name;
        this.psp = psp;
        this.exam = new Exam();
    }

    Student(Student other){
        this.id = other.id;
        this.psp = other.psp;
        this.name = other.name;
        // this is just copying the value of references
        // it is not creating a new object of exam
        //this.exam = other.exam;
        this.exam = new Exam(other.exam);
    }
}
