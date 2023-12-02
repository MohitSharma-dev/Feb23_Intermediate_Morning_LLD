package Builder;

public class Client {
    public static void main(String[] args) {
        // Student s = new Student(1 , "Mohit" , 83.0 ...)

//        Builder builder  = Student.getBuilder();
//        builder.setName("Mohit");
//        builder.setPsp(80.0);
//        builder.setGradYear(2023);
//
//        Student s = builder.build();


        Student s1 = Student.getBuilder()
                .setName("Mohit")
                .setPsp(80)
                .setGradYear(2023)
                .build();
//      Student s =  new Student(builder);
        System.out.println(s1);
    }
}
