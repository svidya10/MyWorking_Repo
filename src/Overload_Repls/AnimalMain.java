package Overload_Repls;

public class AnimalMain {
        public static void main(String[] arg){
           Animal[] kc = { new Cat("",1),new kitten1("",1), new kitten2("",1), new kitten3("",1)};
            for(Animal kitcat: kc){
                kitcat.eat();
                kitcat.sleep();
            }
        }
    }
    class Animal{
        String breed;
        int age;
        Animal(String breed, int age){
            this.breed = breed;
            this.age = age;
        }
        public void eat(){
            System.out.println("Animal eats");
        }
        void sleep(){
            System.out.println("Animal sleeps");
        }
    }
    class Cat extends Animal{
        Cat(String breed, int age) {
            super(breed, age);
        }
        public void eat(){
            System.out.println("Cat eats");
        }
        public void sleep(){
            System.out.println("Cat sleeps");
        }
    }
    class kitten1 extends Cat{
        kitten1(String breed, int age) {
            super(breed, age);
        }

        public void eat(){
            System.out.println("kitten1 eats milk");
        }
        public void sleep(){
            System.out.println("kitten1 sleeps a lot");
        }
    }
    class kitten2 extends Cat{
        kitten2(String breed, int age) {
            super(breed, age);
        }

        public void eat(){
            System.out.println("kitten2 eats snack");
        }
        public void sleep(){
            System.out.println("kitten2 sleeps a lot");
        }
    }
    class kitten3 extends Cat{
        kitten3(String breed, int age) {
            super(breed, age);
        }

        public void eat(){
            System.out.println("kitten3 everything");
        }
        public void sleep(){
            System.out.println("kitten3 sleeps a lot");
        }
    }
