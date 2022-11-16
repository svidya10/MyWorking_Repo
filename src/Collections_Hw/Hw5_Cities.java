package Collections_Hw;

import java.util.LinkedHashSet;

public class Hw4_Cities {
    public static void main(String[] args){
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Seattle");
        cities.add("Arizona");
        cities.add("Austin");
        cities.add("San Fransisco");

        var it = cities.iterator();
        while(it.hasNext()){
           if(it.next().startsWith("A")){
               it.remove();
            }
        }            System.out.println(cities);

        for (String c:cities) {
            if(c.startsWith("A")){
                cities.remove(c);
            }
        }
        System.out.println(cities);
    }
}
