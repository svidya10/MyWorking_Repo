package Collections_Hw;

import java.util.TreeSet;

public class Hw4_Countries {
    public static void main(String[] args){
        TreeSet<String> countries = new TreeSet<>();
        countries.add("Canada");
        countries.add("America");
        countries.add("Denmark");
        countries.add("Brazil");
        countries.add("England");

        var it = countries.iterator();
        while(it.hasNext())
            System.out.println(it.next());
        System.out.println("**********************************");

        for (String c:countries) {
            System.out.println(c);
        }
    }
}
