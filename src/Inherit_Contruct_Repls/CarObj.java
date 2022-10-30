package Inherit_Contruct_Repls;

public class CarObj {
    public static void main(String[] args){
        CarObjects obj1 = new CarObjects("Toyota 2019",100000.0,25);
        System.out.println(obj1.model+" Stock Value "+obj1.calStockValue());
        CarObjects obj2 = new CarObjects("Toyota 2019",100000.0,25);
        System.out.println(obj2.model+" Stock Value "+obj2.calStockValue());
    }
}
class CarObjects{
    String model;
    double price;
    int quantity;
    CarObjects(String model, double price, int quantity){
        this.model = model;
        this.price = price;
        this.quantity = quantity;
    }
    double calStockValue (){
        double stockValue;
        stockValue = price*quantity;
        return stockValue;
    }
}
