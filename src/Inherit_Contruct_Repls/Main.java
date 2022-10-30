package Inherit_Contruct_Repls;
class Main {
    public static void main(String[] args) {
        Child obj = new Child("Fairfax");
        obj.printCity();
    }
}
class Parent{
    String city;
    Parent(String city){
        this.city = city;
    }
    public void printCity(){
        System.out.println("City name "+city);
    }
}
class Child extends Parent{
    Child (String city){
        super(city);
    }
}
