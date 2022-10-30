package Inheritance;

public class Hw3Teacher {
    //Write a Java program called Teacher.  Identify features and behaviour of that Class.
    //Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features and behaviour.
    // Test all 4 classes
    private String tName;
    private String grade;
    private String subject;
    Hw3Teacher(){
    }
    Hw3Teacher(String sName, String grade, String subject){
        this.tName =sName;
        this.grade = grade;
        this.subject = subject;
    }
    void printTeacherInfo(){
        System.out.println("Teacher name: "+tName+"\n"+"Grade: "+grade+"\n"+"Subject: "+subject);
    }
}
