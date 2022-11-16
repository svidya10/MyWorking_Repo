package HW_Maps;

import java.util.ArrayList;

public class Hw7_SumofIntegers {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(30);
        num.add(30);
        num.add(30);
        num.add(40);
        int s =0;
        for (Integer sum:num){
            s+=sum;
        }
        System.out.println(s);
    }
}
