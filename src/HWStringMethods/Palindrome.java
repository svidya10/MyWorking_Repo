package HWStringMethods;

public class Palindrome {
    boolean palindrome (String word) {
       String rev ="";
        for (int i=word.length()-1; i>=0; i--) {
           rev+=word.charAt(i);
        }
        if(rev.equalsIgnoreCase(word)) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        Palindrome obj = new Palindrome();
        String str = "BAab";
        if(obj.palindrome(str)) {
            System.out.println(str+ " is a palindrome");
        }
        else {
            System.out.println(str+ " is not a palindrome");
        }
    }
}
