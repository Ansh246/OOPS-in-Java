class Grandfather {

    void a() {
        System.out.println("I am Grandfather");
    }
}
class Father extends Grandfather {
    void b() {
        System.out.println("I am Father");
    }
}
class Son extends Father {
    void c() {
        System.out.println("I am Son");
    }
}
class Daughter extends Father {
    void d() {
        System.out.println("I am Daughter");
    }
}

public class HybridInheritance {
        public static void main(String[] args) {
            Son obj1 = new Son();
            obj1.c();
            obj1.b();
            obj1.a();

            Daughter obj2 = new Daughter();
            obj2.d();
            obj2.b();
            obj2.a();
            
        }
    
}
