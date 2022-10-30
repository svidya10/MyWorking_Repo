package Inherit_Contruct_Repls;

public class MethodInMethod {
    public static void main(String[] args) {
        Childs obj = new Childs();
        obj.m1();
        obj.m2();
        }
    }
    class Parents {
        public void m1() {
            System.out.println("m1 method in parent class");
        }
    }
    class Childs extends Parents{
            public void m1(){
                System.out.println("m1 method in child class");
            }
            public void m2(){
                super.m1();
            }

    }
