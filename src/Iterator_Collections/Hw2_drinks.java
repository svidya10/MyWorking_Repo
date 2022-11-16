package Iterator_Collections;
import java.util.ArrayList;
import java.util.Iterator;
//Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
public class Hw2_drinks {
    public static void main(String args[]){
        ArrayList<String> drinks= new ArrayList<>(4);
        drinks.add("Orange");
        drinks.add("soda");
        drinks.add("Grape");
        drinks.add("Coke");
        drinks.add("Kiwi");

        //Inefficient way
        Iterator<String> d = drinks.iterator();
        int count=0;
        while (d.hasNext()){
            String dr = d.next();
            if (dr.contains("a")||dr.contains("e")){
               // dr.toString().replaceAll(drinks.toString(),"water");
                drinks.set(count,"water");
            }
            count++;
        }System.out.println(drinks);

        //Effective way
        for(int i=0; i<drinks.size(); i++){
            if(drinks.get(i).contains("a")||drinks.get(i).contains("e")){
                drinks.set(i,"Water");
            }
        }
        // Lambda way

    }
}
