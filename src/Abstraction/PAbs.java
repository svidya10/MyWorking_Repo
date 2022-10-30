package Abstraction;

public abstract class PAbs {
    abstract void m1();
    abstract void m1(String s);
}
class CAbs extends PAbs {

    @Override
    void m1() {
        System.out.println("m1()");
    }

    @Override
    void m1(String s) {
        System.out.println("m1(s)");
    }

    public static void main(String[] args) {
        PAbs t = new CAbs();
        t.m1();
        t.m1("s");
    }
}
/*
class Test{
    public static void main(String[] args){
        PAbs t = new CAbs();
        t.m1();
        t.m1();
    }
}*/
