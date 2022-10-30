package Overload_Repls;

public class Parent {
    void method(){
        System.out.println("parent");
    }
}
class Child extends Parent{
    void method(){
        System.out.println("child");
    }
}
class MainTest{
    public static void main(String[] args){
        Child c = new Child();
        c.method();
        Parent p = new Parent();
        p.method();
    }
}