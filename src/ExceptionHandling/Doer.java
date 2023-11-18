package ExceptionHandling;

public class Doer {
    public int doSomething(){
        return 1/ 0;
    }

    public void findStudentByRollNo(int rollNo) throws Exception {
        if(rollNo < 30){
            if(rollNo % 2 == 0){
                throw new EvenNumberException("Even Number can't be handled");
            }
        } else {
            // unhandled exception
            throw new ClassNotFoundException();
//            throw new IndexOutOfBoundsException();
//            throw new NullPointerException();
        }
    }

    void something(int a ){
        something(a * a);
    }
}


// ArithmeticException : Runtime Exception
//