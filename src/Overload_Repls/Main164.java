package Overload_Repls;

public class Main164 {
        public static void main(String[] args){
            ParentMain[] p = {new Subclass1(), new Subclass2(), new Subclass3()};
            for(int i=0;i<p.length;i++){
                p[i].hello();
            }
            }
        }
    class ParentMain{
        void hello(){
            System.out.println("method in Parent class");
        }
    }
    class Subclass1 extends ParentMain {
        void hello(){
            System.out.println("method in Child1 class");
        }
    }
    class Subclass2 extends ParentMain {
        void hello(){
            System.out.println("method in Child2 class");
        }
    }
    class Subclass3 extends ParentMain {
        void hello(){
            System.out.println("method in Child3 class");
        }
    }
