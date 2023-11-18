package ExceptionHandling;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, Exception{
        Doer doer = new Doer();
//        doer.doSomething();
        try{
            // SUCCESS BLOCK
            doer.findStudentByRollNo(31);
            // close db connection
        } catch (ClassNotFoundException exec){
            System.out.println("Class Not Found exception thrown");
            // close db connection
            throw new ClassNotFoundException();
        } catch (EvenNumberException exec){
            // close db connection
            System.out.println("Even Number exception thrown");
        } finally {
            System.out.println("Db connection closed");
        }
        System.out.println("Db connection closed 2");
        // close db connection
        // If you are catching and not throwing again , no need of mentioning in throws
        // Error -> serious issues which should not be caught/handled
//        doer.something(5);
    }
}

// Animal a = new Dog();
// A -> B -> C -> D
// catch D
// catch C
// catch B
// catch A