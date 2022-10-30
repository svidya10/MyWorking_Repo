package StringBuilder;

public class StrBuilder {
    public static void main(String[] args) {
        String s = "Vidya";
        StringBuilder sB = new StringBuilder(s);
        sB.reverse();
        System.out.println(sB);

        String s1 = new String(s);
        s1.toLowerCase();
        System.out.println(s1.toLowerCase());



        String country = "USA";
        String home = "USA";
        StringBuilder state1 = new StringBuilder("New York");
        StringBuilder state2 = new StringBuilder("New York");
    }
}
