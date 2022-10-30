package AccessModifiers;

public class Hw1 {
    //Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    // Method should be visibly only within same package and accessible by the creating an instance of the class.
    int sumOfElements (int[] n) {
        int sum=0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }
        public static void main (String[] args) {
            Hw1 obj = new Hw1();
            System.out.println(obj.sumOfElements(new int[]{1, 2, 3, 4, 5}));
        }
}

