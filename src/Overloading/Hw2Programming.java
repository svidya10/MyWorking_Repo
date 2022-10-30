package Overloading;

public class Hw2Programming {
    //Create a class named 'Programming'.
    // While creating an object of the class, if nothing is passed to it,
    // then the message "I love programming languages" should be printed.
    // If some String is passed to it, then in place of "programming languages" the value variable should be printed.
    // Example, if we pass "Java", then "I love Java" should be printed.

    Hw2Programming(){
        System.out.println("I love programming languages");
    }
    Hw2Programming(String s){
        System.out.println("I love "+s);
    }
}
class Test{
    public static void main(String[] args){
        new Hw2Programming();
        new Hw2Programming("Java");
    }
}
