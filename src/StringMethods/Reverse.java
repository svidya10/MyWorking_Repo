package StringMethods;

public class Reverse {
    public static void main(String[] args) {
        String s = "Java Class";
        String rev="";
        char[] c =s.toCharArray();
        for(int i=s.length()-1; i>=0; i--){
            System.out.print(c[i]);
        }
        for(int i=s.length()-1; i>=0; i--){
            System.out.print(s.charAt(i));
           rev+=s.charAt(i);
        }
        System.out.println(rev);

        StringBuilder sB = new StringBuilder(s);
        System.out.print(sB.reverse());

        String[] sA = s.split("");
        for(int i=s.length()-1; i>=0; i--) {
            System.out.print(sA[i]);
        }
    }
}
