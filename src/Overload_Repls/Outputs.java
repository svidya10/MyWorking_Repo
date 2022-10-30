package Overload_Repls;

public interface Outputs {
        void display(double result);
    }
    interface Functions extends Outputs {
        double adding(double firstNumber, double secondNumber);
        double subtracting(double firstNumber, double secondNumber);
        double multiply(double firstNumber, double secondNumber);
        double dividing(double firstNumber, double secondNumber);
    }
class Main implements Functions{
    static double firstNumber = 100.00;
    static double secondNumber = 20.00;

    public double adding(double firstNumber, double secondNumber){
        double result =0.0;
        result = firstNumber+secondNumber;
        return result;
    }
    public double subtracting (double f, double s){
        double result =0.0;
        result = firstNumber-secondNumber;
        return result;
    }
    public double multiply (double f, double s){
        double result =0.0;
        result = firstNumber*secondNumber;
        return result;
    }
    public double dividing (double f, double s){
        double result =0.0;
        result = firstNumber/secondNumber;
        return result;
    }
    public void display(double r){
        System.out.println("Result is ::: "+r);
    }
    public static void main(String[] args){
        Main m = new Main();
        m.display(m.adding(firstNumber, secondNumber));
        m.display(m.subtracting(firstNumber, secondNumber));
        m.display(m.multiply(firstNumber, secondNumber));
        m.display(m.dividing(firstNumber, secondNumber));
    }
}

