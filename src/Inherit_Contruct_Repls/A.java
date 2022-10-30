package Inherit_Contruct_Repls;

public class A {
    A(){
        System.out.println("I");
    }
}
class B extends A {
    B(){
        System.out.println("am");
    }
}
class C extends B {
    C(){
        System.out.println("a tester");
    }
}
class Test{
    public static void main(String[] args){
        C obj = new C();
    }
}
