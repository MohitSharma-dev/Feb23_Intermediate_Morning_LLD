package Collections;

public class Student implements Comparable<Student>{
    int id;
    String name;
    double psp;
    int age;

    Student(int id, String name , int age, double psp){
        this.id = id;
        this.name = name;
        this.age = age;
        this.psp = psp;
    }

    @Override
    public int compareTo(Student other) {
        // compareTo will compare this object and the other object
        // equal , return 0
        // this object should come first -> return -1
        // other object => return 1
        if(this.id == other.id){
            return 0;
        } else if(this.id < other.id)
            return -1;
        return 1;
    }
}
