class A{

    public  void input(){
        System.out.println("Hello I am Class A");

    }}
    class B extends A
    {
       public void get(){
        System.out.println("Hello I am Class B");
    }}
    public class SimpleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.get();
        obj.input();

        
    }
}