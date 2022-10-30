package Inheritance;

public class Hw3ChemistryTeacher extends Hw3Teacher {
    private String specilization;
    Hw3ChemistryTeacher()
    {

    }
    Hw3ChemistryTeacher(String tName, String grade, String subject, String specilization){
        super(tName,grade,subject);
        this.specilization = specilization;
    }
    void displayChemTeacherInfo (){
        System.out.println("Specialized in : "+specilization);
    }
    public static void main(String[] args){
        Hw3ChemistryTeacher chem = new Hw3ChemistryTeacher("Lakshman","11th","Chemistry","Organic Chemistry");
        chem.printTeacherInfo();
        chem.displayChemTeacherInfo();
    }
}
