package HWStringMethods;

import com.sun.jdi.connect.IllegalConnectorArgumentsException;
//Create a method that will take 2 parameters as a numbers and prints which number is larger.
public class LargeNum {
     int large (int num1, int num2) {
         if (num1 > num2) {
             return num1;
         } else {
             return num2;
         }
     }
        public static void main (String[] args){
            LargeNum obj = new LargeNum();
            int largestNum = obj.large(99,98);
            System.out.println("Large number is "+largestNum);
         }
    }
