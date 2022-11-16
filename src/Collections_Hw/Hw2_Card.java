package Collections_Hw;

import java.util.LinkedList;

public abstract class Hw2_Card {
    abstract void cc_new(double salary);
    void cc_upgrade(double salary){
        if(salary>70000) {
            System.out.println(cardType+" is upgraded");
        }else System.out.println(cardType+" cannot be upgraded");
    }

    @Override
    public String toString() {
        return "Hw2_Card{" +
                "cardType='" + cardType + '\'' +
                '}';
    }

    private String cardType;
    String getCard(){
        return cardType;
    }

    Hw2_Card(String cardType){
        this.cardType = cardType;
    }
}
class Visa extends Hw2_Card{
    Visa(String cardType) {
        super(cardType);
    }

    @Override
    void cc_new(double salary) {
        if(salary>=50000){
            System.out.println(getCard()+" is approved");
        }else System.out.println(getCard()+" is approved");
    }
}
class Mastercard extends Hw2_Card{

    Mastercard(String cardType) {
        super(cardType);
    }

    @Override
    void cc_new(double salary) {
        if(salary>=30000){
            System.out.println(getCard()+" is approved");
        }else System.out.println(getCard()+" is approved");
    }
}
class Amex extends  Hw2_Card{

    Amex(String cardType) {
        super(cardType);

    }
    @Override
    void cc_new(double salary) {
        if(salary>=60000){
            System.out.println(getCard()+" is approved");
        }else System.out.println(getCard()+" is not approved");
    }
}
class CardTester{
    public static void main(String[] args){
        LinkedList<Hw2_Card> obj = new LinkedList<>();
        obj.add(new Visa("Visa Card"));
        obj.add(new Mastercard("Master Card"));
        obj.add(new Amex("Amex Card"));
        System.out.println(obj);
        for (var o:obj) {
            o.cc_new(40000);
            o.cc_upgrade(80000.00);
        }

    }
}

