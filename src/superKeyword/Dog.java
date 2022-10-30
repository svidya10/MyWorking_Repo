package superKeyword;

public class Dog extends Animal {
    public Dog(String name, String breed, String color) {
        super(name, breed, color);
    }
}
    class Cat extends Animal {
        public Cat (String name, String breed, String color){
            super(name,breed,color);
        }
    }
    class TestAnimal{
        public static void main(String[] args){
        Dog dog = new Dog("Jimmy","Dalmation","White");
        dog.printInfo();
        Cat cat = new Cat("Jimmy","Dalmation","White");
        cat.printInfo();
        }
    }