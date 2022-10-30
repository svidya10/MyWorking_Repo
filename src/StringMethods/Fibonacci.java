package StringMethods;

public class Fibonacci {
    void printFiboSeries(int size){

        int previous=0;
        int currentNumber=1;
        int nextNum=0;
        System.out.println(previous);
        System.out.println(currentNumber);
        for(int i=0; i<size;i++) {
            nextNum=previous+currentNumber;
            System.out.println(nextNum);
            previous=currentNumber;
            currentNumber=nextNum;
        }
    }

    public static void main(String[] args) {
        Fibonacci obj=new Fibonacci(); // Creating an object of the class
        obj.printFiboSeries(5); // this is how we execute the logic present inside the method
        obj.printFiboSeries(10);
    }
}
