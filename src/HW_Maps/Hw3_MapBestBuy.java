package HW_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hw3_MapBestBuy {
    public static void main(String[] args) {
        HashMap<Integer,String> bB = new HashMap<>();
        bB.put(9897890,"Samsung TV");
        bB.put(7675456,"Nintendo Switch");
        bB.put(6789098,"Electric Grill");
        bB.put(9088791,"Coffee Machine");

        Set<Map.Entry<Integer, String>> bestEntry = bB.entrySet();
        System.out.println(bestEntry);

    }
}
