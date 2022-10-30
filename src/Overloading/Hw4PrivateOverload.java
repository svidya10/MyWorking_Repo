package Overloading;

public class Hw4PrivateOverload {

        private void printInfo (){
            System.out.println("I don't have any info");
        }
        static void printInfo (String s){
            System.out.println(s);
        }
        private void printInfo (String s, int n){
            System.out.println(s+" "+n);
        }
        public static void main(String[] args){
            Hw4PrivateOverload obj = new Hw4PrivateOverload();
            obj.printInfo();
            printInfo("I have a String");
            obj.printInfo("I have a String and int "+ 10);
        }
    }
