package Iterator_Collections;
import java.util.ArrayList;
import java.util.Iterator;
//Create an arrayList of even numbers from 1 to 500. Remove any number that is divisible by 5 from that arrayList.
public class Hw3_EvenNum {
    public static void main(String[] args){
        ArrayList<Integer> evenNum = new ArrayList<>();
        for (int i=0;i<=500;i++){
            if(i%2==0){
                evenNum.add(i);
            }
        } System.out.println(evenNum);

        Iterator<Integer> even = evenNum.iterator();
        while(even.hasNext()){
            if(even.next()%5==0){
                even.remove();
            }
        }
        System.out.println(evenNum);

        ArrayList<Integer> num = new ArrayList<>();
        for(int i=2; i<=500; i+=2){
            num.add(i);
        }
        System.out.println(num);
        var it = num.iterator();
        while(it.hasNext()){
            if(it.next()%5 ==0){
                it.remove();
            }
        }
        System.out.println(num);
    }
}
