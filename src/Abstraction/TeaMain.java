package Abstraction;

public class TeaMain {
        public static void main(String[] args){
            Tea[] tea ={new LemonTea(""), new ChaiTea("")};
            for (Tea t: tea) {
                t.addSugar();
            }
        }
    }
    abstract class Tea{
        String teaType;
        Tea(String teaType){
            this.teaType = teaType;
        }
        abstract void addSugar();
    }
    class LemonTea extends Tea{
        LemonTea(String teaType){
            super(teaType);
        }
        void addSugar(){
            System.out.println("For Lemon Tea we need 2 spoons of sugar");
        }
    }
    class ChaiTea extends Tea{
        ChaiTea(String teaType) {
            super(teaType);
        }
        void addSugar(){
            System.out.println("For Chia Tea we need 1 spoon of sugar");
        }
    }
