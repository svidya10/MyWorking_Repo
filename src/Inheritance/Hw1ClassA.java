package Inheritance;
public class Hw1ClassA {
    /*Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A */
    String name;
    String address;
    int phoneNo;
    Hw1ClassA() {
    }
     Hw1ClassA(String name, String address, int phoneNo) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }
    Hw1ClassA(String address){
        this.address = address;
    }
}
