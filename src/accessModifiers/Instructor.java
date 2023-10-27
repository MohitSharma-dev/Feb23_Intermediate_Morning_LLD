package accessModifiers;

import Inheritance.User;

public class Instructor extends User {
    int instructor_id;

    void doSomething(User x){
        instructor_id = 20;
        // can't access default outside the package
//        user_id = 40;
        age = 24;
        user_name = "Mohit";
        // protected members can only be access via child class objects within the childclass outside the package
//        x.user_name = "";
//        token = "";
    }
}
