package Inheritance;

public class Hw4UserInfo extends Hw4User {
    private String address;
    Hw4UserInfo(String name, int phoneNo,String address) {
        super(name, phoneNo);
        this.address = address;
    }
        void userDetails () {
            System.out.println("User name: " +name+"\n" + "User phone: " +phoneNo+"\n"+"User address: " + address);
        }
    public static void main (String[] args){
        Hw4UserInfo obj = new Hw4UserInfo("Mario",123456789,"10,Disney World,CA");
        obj.userDetails();
    }
}
