package Overridding;

public class Hw1Degree {
    //Create a class 'Degree' having a method 'getPrerequisite' that prints ""To get a degree you need high school diploma"".    //Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters’. In Masters class override method 'getPrerequisite'.//Call the method by creating an object of each of the three classes.
    void getPrerequisite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Hw1Degree{
    Bachelors (int a){
        System.out.println("c1");
    }
    Bachelors(String s){
        this(1);
        System.out.println("c2");
    }
    @Override
    void getPrerequisite(){

    }
    void getPr() {
        super.getPrerequisite();
    }


}
class Masters extends Hw1Degree{
    void getPrerequisite(){
        System.out.println("To get a Masters you need Bachelors Degree");
    }
}
class Tester{
   public static void main(String[] args){
    new Hw1Degree().getPrerequisite();
    new Bachelors("");
    new Masters().getPrerequisite();
   }
}
