package HWStringMethods;

public class Email {
    //Create a method createEmail(). Based on values of users name, lastName and email type,
    // your method should return complete email Address.
    // Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com or
    void getEmail (String fname, String lname, String mail) {
        System.out.println(fname+lname+"@"+mail+".com");
    }
    public static void main (String[] args){
        Email obj = new Email();
        obj.getEmail("vidya","srinivasan","gmail");
    }

}
