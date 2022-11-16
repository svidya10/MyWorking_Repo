package Iterator_Collections;
import java.util.ArrayList;
import java.util.Iterator;
//Create an arrayList of words. Remove every word that ends with “e”.
public class Hw1_words {
    public static void main(String args[]){
        ArrayList<String> words = new ArrayList<>(3);
        words.add("Zombie");
        words.add("Ghost");
        words.add("Police");
        words.add("Firemen");
        words.add("Vampire");
        words.add("Demogorgon");

        Iterator<String> w =  words.iterator();
        while(w.hasNext()){
            String wz = w.next();
            if(w.next().endsWith("e")){
                w.remove();
            }
        }
        System.out.println("Using iterator class "+words);

        words.removeIf(x -> x.endsWith("e"));
        System.out.println("Using lambda "+words);
    }
}
