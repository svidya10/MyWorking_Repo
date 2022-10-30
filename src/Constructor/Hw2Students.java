package Constructor;

public class Hw2Students {
    /*Write a java Class Students that have a constructor which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.Test Student class for 5 different students with different marks.
    Your program should print an average mark of each student's name.*/
    private String StudentName;
    private int math;
    private int english;
    private int science;
     Hw2Students(String sName, int mMark, int eMark, int sMark){
        StudentName = sName;
        math = mMark;
        english = eMark;
        science= sMark;
    }
    public int calAverage () {
        int avg;
        avg = (math+english+science)/3;
        System.out.println("Average mark of "+StudentName+" is "+avg);
        return avg;
    }
}
