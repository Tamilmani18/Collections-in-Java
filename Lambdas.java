
// An interface with single abstract method ( functional interface ) can be implemented using lambda expressions..

public class Tester implements Runnable {

    // By implementing the runnable interface and overriding(implementing) the abstract run method
    public void run(){
        System.out.println("Hello from Tamil " + Thread.currentThread().getName());
    }

    
    public static void main(String[] args) {
        // Passing an instance of class to thread constructor
        Thread thread = new Thread( new Tester() );
        thread.start();
    }
}


public class Tester2 {

    // Without implementing the runnable interface passing the lambda expression to thread constructor 
    public static void main(String[] args) {
        Thread thread = new Thread( () -> System.out.println("Hello from Tamil " + Thread.currentThread().getName() ) );
        thread.start();
    }
}

