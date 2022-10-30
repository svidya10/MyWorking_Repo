package Constructor;

public class ConstrutTypes {
    /*    Write a java class that have 4 constructors with 4 different access levels of constructors
    (private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package and observe result.*/
    public ConstrutTypes() {
        System.out.println("Public");
    }

    ConstrutTypes(char c) {
        System.out.println("default");
    }

    private ConstrutTypes(String s) {
        System.out.println("Private");
    }

    protected ConstrutTypes(int i) {
        System.out.println("Protected");
    }

    public static void main(String[] args) {
        ConstrutTypes obj1 = new ConstrutTypes();
        ConstrutTypes obj2 = new ConstrutTypes('t');
        ConstrutTypes obj3 = new ConstrutTypes("abcd");
        ConstrutTypes obj4 = new ConstrutTypes(12);
    }
}
