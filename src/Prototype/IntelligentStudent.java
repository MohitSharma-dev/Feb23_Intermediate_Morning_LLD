package Prototype;

public class IntelligentStudent extends Student{
    int iq;
    IntelligentStudent(IntelligentStudent other){
        super(other);
        this.iq = other.iq;
    }
    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}

// client
// Mohit.clone();
// return new IntelligentStudent(Mohit);
// Manoj.IntelligentStudent(Mohit)
// Manoj.IntelligentStudent(Mohit)
// Manoj.super(Mohit) => Manoj.Student(Mohit)
    // Manoj.name = Mohit.name
    // ...
// Manoj.iq = Mohit.iq;
