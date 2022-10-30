package AccessModifiers;

public class Hw3 {
    //Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    //Method should be available inside the class only where it was declared and executed by calling it is name.
   private String vowels(String s) {
        String vowels ="";
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowels += s.charAt(i);
            }
        }
        return vowels;
    }
    public static void main(String[] args){
        Hw3 obj = new Hw3();
        System.out.println(obj.vowels("I am learning Java from Syntax"));
            String s1 = new String("TEST LEAF");
            String s2 = new String("TEST LEAF");
            String s3 = new String("Java");
            System.out.println(s1 == s2);
            System.out.println(s1.equals(s2));
    }

}
