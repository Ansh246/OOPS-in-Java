 // Method overloading example 
 /* public class Polymorphism {

    static int sum(int a,int b) {
     return a + b;
    }
    static int sum(int a,int b,int c) {
        return a + b + c;
    }
    public static void main(String[] args) {

        System.out.println(sum(5, 5));
        System.out.println(sum(5,5,5));
        
    }
    
}*/
 

// Method overriding 

class A {
    void run() {
        System.out.println("Hello");

    }
}
class B extends A {
    public class Polymorphism {
        
    public static void main(String[] args) {
        B obj = new B();
        obj.run();
        
    }
}
}