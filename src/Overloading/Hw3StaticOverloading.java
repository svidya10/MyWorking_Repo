package Overloading;

public class Hw3StaticOverloading {
    static void printInfo() {
        System.out.println("I don't have any info");
    }

    static void printInfo(String s) {
        System.out.println(s);
    }
    static void printInfo(String s, int n) {
        System.out.println(s + " " + n);
    }

    public static void main(String[] args) {
        printInfo();
        printInfo("I have a String");
        printInfo("I have a String and number ", 1);
    }
}