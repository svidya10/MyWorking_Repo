package Inheritance;
class Hw1ClassB extends Hw1ClassA {
    String product;
    int size;
    Hw1ClassB(){
    }
    Hw1ClassB (String name, String address, int phoneNo,String product, int size){
        super(name,address,phoneNo);
       this.product = "iPhone";
       this.size = 20;
    }
    Hw1ClassB(String a){
        super("20");

    }
}
