package HW_Maps;

import java.util.ArrayList;

public class Hw6_ConcatString {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        input.add("J");
        input.add("A");
        input.add("V");
        input.add("A");
        String str="";
        for (String s:input) {
            str+=s;
        }
        System.out.println(str);

        for (String in:input) {

            System.out.print(in+"");
        }
    }
}
