package GroupProj_2ex;
public class GP_Variables {
    //Instance Variable
    String day;
    //each instance has its own copy of these variables.
    public void printDay(){
        day = "Saturday";
        System.out.println(day);
    }
    public void getDay(){
        day = "Monday";
        System.out.println(day);
    }
    //static variable
    static int score=100;
    public void getScore(){
        System.out.println(score);
    }
    //Local variable
    public void defineLocal(){
        // Local var scope starts here
        int a=10, b=15;
        int sum;
        sum = a+b;
        System.out.println(sum);
    }// local var scope ends here***
}
class VarTester{
    public static void main(String[] args){
        GP_Variables obj1 = new GP_Variables();
        GP_Variables obj2 = new GP_Variables();
        System.out.println("**** static Variable output ****");
        obj1.getScore();
        GP_Variables.score = 20;
        obj1.getScore();
        obj2.getScore();
        System.out.println("**** instance Variable output ****");
        obj1.getDay();
        obj2.printDay();
    }
}
