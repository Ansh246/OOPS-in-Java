class A {
    void input(){
        System.out.println("Hello I am Class A");
    }
}
class B extends A {
     void get() {
        System.out.println("Hello I am Class B");
     }
}
class C extends B {
    void put() {
    System.out.println("Hello I am Class C");
    }
}


public class MultiLevelInheritance {
    public static void main(String[] args) {
        C obj = new C();
        obj.put();
        obj.get();
        obj.input();
        
    }
    
}
