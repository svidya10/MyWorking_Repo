package ArrayList;

import java.util.ArrayList;

public class Hw_ArrayList {
    public static void main(String[] args){
        ArrayList<String> names = new ArrayList<>();
        names.add("Sun");
        names.add("Moon");
        names.add("Star");
        names.add("Planet");
        names.add("Comet");
        var number = 10;
        names.removeIf(item->item.startsWith("B"));
        var iterator = names.iterator();
        while(iterator.hasNext()){
            var item = iterator.next();
            if(item.startsWith("S") || item.endsWith("t")){
                iterator.remove();
            }
        }
        System.out.println(names);


        if(names.isEmpty()){
            System.out.println("Array is Empty");
        }else {
            System.out.println("Array is not Empty");
        }
        if(names.contains("Moon")){
            System.out.println("Name is present in the Array List");
        }else {
            System.out.println("Name is not present in the Array List");
        }
        System.out.println("Size of the Array List is "+names.size());
        System.out.println(names);
        for (String n:names) {
            System.out.println(n);
        }
    }
}
