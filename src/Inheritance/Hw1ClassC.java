package Inheritance;
public class Hw1ClassC extends Hw1ClassB {
   int orderNo;
   Hw1ClassC(String name, String address, int phoneNo, String product, int size, int orderNo){
      super(name,address,phoneNo,product, size);
      this.orderNo = orderNo;
   }
   void displayInfo() {
      System.out.println("Name: " + name+"\n"+"Address: " + address+"\n"+ "Phone No:" + phoneNo+"\n"
              +"Product: "+product+"\n"+"Size: in"+size+"\n"+"Order No: #"+orderNo);
   }
   public static void main (String[] args) {
      Hw1ClassC obj = new Hw1ClassC("Vidya", "Whitworth Drive", 123456789,"iPhone", 10,15);
      obj.displayInfo();
   }
}
