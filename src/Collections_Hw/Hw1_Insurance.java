package Collections_Hw;

import java.util.ArrayList;

public abstract class Hw1_Insurance {
    String insuranceName;

    abstract void getQuote();
    abstract void cancelInsurance();
}
class Car extends Hw1_Insurance{
    public void carModel(){
        System.out.println("carModel method from Car class");
    }

    @Override
    void getQuote() {
        System.out.println("getQuote method from Car class");
    }

    @Override
    void cancelInsurance() {
        System.out.println("cancelInsurance method from Car class");
    }
}
class Pet extends Hw1_Insurance{
    void petType(){
        System.out.println("petType method from Pet class");
    }

    @Override
    void getQuote() {
        System.out.println("getQuote method from Pet class");
    }

    @Override
    void cancelInsurance() {
        System.out.println("cancelInsurance method from Pet class");
    }
}
class Health extends Hw1_Insurance{

    @Override
    void getQuote() {
        System.out.println("getQuote method from Health class");
    }

    @Override
    void cancelInsurance() {
        System.out.println("cancelInsurance method from Health class");
    }

    @Override
    public String toString() {
        return this.getClass().getName().toString();
    }
}
class InsuranceTester{
    public static void main(String args[]){

        ArrayList<Hw1_Insurance> obj = new ArrayList<>();
        obj.add(new Car());
        obj.add(new Pet());
        obj.add(new Health());

        for (var o : obj) {
            o.getQuote();
            o.cancelInsurance();
        }

        var it = obj.iterator();
        while(it.hasNext()){
             it.next().cancelInsurance();
             it.next().getQuote();
        }
        for (int i=0;i<=obj.size();i++){
            obj.get(i).getQuote();
            obj.get(i).cancelInsurance();

        }

    }
}