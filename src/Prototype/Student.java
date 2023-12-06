package Prototype;

public class Student implements Prototype<Student>{
    private int id;
    String name;
    String batch;
    double psp;
    Student(){

    }
    Student(Student other){
        this.id = other.id;
        this.name = other.name;
        this.batch = other.batch;
        this.psp = other.psp;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    @Override
    public Student clone() {
       return new Student(this);
    }
}
