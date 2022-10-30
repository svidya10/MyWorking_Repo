package ReplTest;

public class intArray {
        public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }
        static int maxValue (int[] n){
            int max = Integer.MIN_VALUE;
        for(int i=0; i<n.length; i++){
            if(n[i] >max) {
                max =n[i];
            }
        }
        return max;
    }

}
