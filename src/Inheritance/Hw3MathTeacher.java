package Inheritance;

public class Hw3MathTeacher extends Hw3Teacher {
    private int noOfDegrees;
    Hw3MathTeacher()
    {

    }
    Hw3MathTeacher(String tName, String grade, String subject, int noOfDegrees){
        super(tName,grade,subject);
        this.noOfDegrees = noOfDegrees;
        System.out.println(tName);
    }
    void displaymathTeacherInfo (){
        System.out.println("No.of University Degrees completed :"+noOfDegrees);
    }
    public static void main(String[] args){
        Hw3MathTeacher math = new Hw3MathTeacher("Bharatan","12th","Math",8);
        math.printTeacherInfo();
        math.displaymathTeacherInfo();
    }
}
