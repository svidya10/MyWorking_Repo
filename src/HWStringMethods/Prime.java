package HWStringMethods;

public class Prime {
    //Write a method to return whether given number is prime or not?
    boolean checkPrime (int n) {
        boolean isPrime = true;
        if (n> 1) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
        } else {
            isPrime = false;
        }
        return isPrime;
    }
        public static void main(String[] args) {
            Prime num = new Prime();
            int a = 29;
            if(num.checkPrime(a)) {
                System.out.println(a + " is a prime number");
            }
            else {
                System.out.println(a+" is not a prime number");
            }
        }
}
