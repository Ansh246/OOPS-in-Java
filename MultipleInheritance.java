// Using Interface 
 

interface A {
    public void a();
}
interface B {
    public void b();
}
class C implements A , B {
    public void a() {
        System.out.println("Welcome");
    }
    public void b() {
        System.out.println("Hello");
    }
}

public class MultipleInheritance { 
    public static void main(String[] args) {
        C obj = new C();
        obj.a();
        obj.b();

    }
    
}
