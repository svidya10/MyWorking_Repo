package Inheritance;

public class Hw5Circle extends Hw5Shape {
//    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
//    In circle class create a method to calculate the area of circle. Test your code
    Hw5Circle(double radius) {
        super(radius);
    }
    public double calArea(){
        double area;
        area = 3.14*radius*radius;
        return area;
    }
    public static void main(String[] args){
        Hw5Circle obj = new Hw5Circle(10);
        System.out.println("Area of Circle with radius "+ obj.radius+" is "+obj.calArea());
    }
}
