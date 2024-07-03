/*  Abstraction can be achieved by both abstract class and interface.
But,Here is a Simple program for Abstraction using Abstract Class. */


abstract class A {
    abstract void run();

    
}
class B extends A {
    void run() {
        System.out.println("I am Class B");
    }
}


public class AbstractionProgram {
    public static void main(String[] args) {
        A obj = new  B();
        obj.run();
        
    }
    
}
