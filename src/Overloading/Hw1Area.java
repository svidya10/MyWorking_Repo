package Overloading;

public class Hw1Area {
    //Create 1 class in which create a methods that will calculate the area (volume in case of box) of  Rectangle Square Box
    public double calculate(double l, double w){
        System.out.println("Method for calculating Area of Rectangle");
        double area;
        area = l*w;
        return area;
    }
    public double calculate(double s){
        System.out.println("Method for calculating Area of Square");
        double area;
        area = s*s;
        return area;
    }
    public double calculate(double l, double w, double h){
        System.out.println("Method for calculating Volume of Box");
        double volume;
        volume = l*w*h;
        return volume;
    }
}
class TestArea{
    public static void main(String[] args){
        Hw1Area obj = new Hw1Area();
        System.out.println(obj.calculate(2));
        System.out.println(obj.calculate(3,2));
        System.out.println(obj.calculate(3,4,6));
    }
}
