package VariablesRepl;

public class StaticMethod {
    void print1() {
        System.out.println("Programming is amazing.");
    }
    static void print2() {
        System.out.println("Java is awesome.");
    }
    public static void main(String[] args){
        StaticMethod obj = new StaticMethod();
        obj.print1();
        StaticMethod.print2();
    }
}
