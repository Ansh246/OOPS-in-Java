/* In Hierarchical Inheritance,When two or more class can inherit single class  */

class A {
    void input() {
        System.out.println("Hello I am Class A");
    }
}
class B extends A {
    void get() {
        System.out.println("Hello I am Class B");
    }
}
class C extends A {
    void run() {
        System.out.println("Hello I am Class C");
    }
}


public class HierarchicalInheritance {
public static void main(String[] args) {
    C obj = new C();
    obj.run();
    obj.input();
    
}    
}
