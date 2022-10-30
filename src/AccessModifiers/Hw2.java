package AccessModifiers;

public class Hw2 {
    //Create a method that will take a String as a parameter and returns reversed String.
    //Method should be available to all classes within your project and accessible by class name.
    public String reverse (String s){
        String rev="";
        for(int i=s.length()-1; i>=0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args){
        Hw2 strRev = new Hw2();
        System.out.println(strRev.reverse("java"));
    }
}
