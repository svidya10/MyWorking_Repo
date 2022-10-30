package Inheritance;

public class Hw3PianoTeacher extends Hw3Teacher {
    private String instrument;
     Hw3PianoTeacher()
    {

    }
    Hw3PianoTeacher(String tName, String grade, String subject, String instrument){
        super(tName,grade,subject);
        this.instrument = instrument;
    }
    void displayPianoTeacherInfo (){
        System.out.println("Instrument name : "+instrument);
    }
    public static void main(String[] args){
        Hw3PianoTeacher piano = new Hw3PianoTeacher("Raman","Fifth","Piano","Grand Piano");
        piano.printTeacherInfo();
        piano.displayPianoTeacherInfo();
    }
}
