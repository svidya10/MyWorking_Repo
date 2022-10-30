package HWStringMethods;
//Create a method that will take a number and prints whether the number is even or odd.
public class EvenOdd {
     void eo (int num) {
         if(num%2==0) {
             System.out.println(num+" is Even");
         }
         else {
             System.out.println(num+" is Odd");
         }
    }
    public static void main(String[] args) {
        EvenOdd object = new EvenOdd();
        object.eo(8);
    }
}
