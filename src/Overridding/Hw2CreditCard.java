package Overridding;

public class Hw2CreditCard {
    //Create a class CreditCard and define variable balance and interest.    // Create an instance method that will calculate interest based on the given balance.    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.    //Call the method by creating an object of each of the three classes.
    double balance;
    double interest;
    void calInterest(double balance){
        interest = 4.5/100;
        System.out.println("Interest amount is "+balance*interest);
    }
}
class Visa extends Hw2CreditCard{
}
class AX extends Hw2CreditCard{
    void calInterest(double balance){
        interest = 3.5/100;
        System.out.println("AX Interest amount is "+balance*interest);
    }
}
class MainInterest {
    public static void main(String[] args){
        new AX().calInterest(1000);
        new Visa().calInterest(2000);
        new Hw2CreditCard().calInterest(8000);
    }
}