package HW_Maps;

import java.util.HashMap;

public class Hw1_MapBuilding {
    public static void main(String[] args) {
        HashMap<Integer,String> building = new HashMap<>();
        building.put(1,"Google");
        building.put(3,"Syntax");
        building.put(3,"Facebook");
        building.put(4,"Apple");
        building.put(3,"Microsoft");
        building.put(6,"Apple");
        building.put(7,"Amazon");

        int noOfEntries = building.size();
        System.out.println(noOfEntries);
        building.replace(4,"Samsung");
        building.remove(7);
        //building.entrySet().removeIf(build-> build.getKey().equals(7));
        System.out.println(building);
    }
}
