package Inherit_Contruct_Repls;

public class DogRepl {
        String dogName;
        double dogWeight;
        static String dogBreed= "Mutt";

        DogRepl (String dogName, double dogWeight){
            this.dogName = dogName;
            this.dogWeight = dogWeight;
        }
        void printDetails(){
            System.out.println(dogName+" "+dogBreed+" "+dogWeight);
        }
    }
    class Tester {
        public static void main(String[] args) {
            DogRepl obj1 = new DogRepl("Tarzan", 50.0);
            obj1.printDetails();
            DogRepl obj2 = new DogRepl("Lucy", 10.0);
            obj2.printDetails();
        }
    }


