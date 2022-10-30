package Inheritance;

public class Hw4User {
//    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
//    Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
//    Print users name, mobile number and address in userDetails method. Test your code.
    String name;
    int phoneNo;
    Hw4User(String name, int phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }
}
