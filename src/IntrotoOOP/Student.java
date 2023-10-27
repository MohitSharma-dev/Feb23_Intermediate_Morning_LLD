package IntrotoOOP;

public class Student {
    public int age;
    private int id;
    protected String name;
    String batch;
    double psp;

    void attendClass(){
        System.out.println("Attending class");
    }

    String getBatch(){
        return batch;
    }
    // getter
    int getId(){
        return id;
    }

    void setId(int new_id){
        id = new_id;
    }
}
