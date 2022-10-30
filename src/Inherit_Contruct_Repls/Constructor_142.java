package Inherit_Contruct_Repls;
    class SyntaxTechnologies {
        String schoolName;
        int batch;
        int year;
        String lastDayOfClass;
        SyntaxTechnologies() {
        }
        SyntaxTechnologies(String schoolName,int batch,int year,String lastDayOfClass){
            this.schoolName = schoolName;
            this.batch = batch;
            this.year = year;
            this.lastDayOfClass = lastDayOfClass;
        }
        void displayValues(){
            System.out.println(schoolName+batch+year+lastDayOfClass);
        }
    }
public class Constructor_142 extends SyntaxTechnologies {
    public static void main(String[] args){
        SyntaxTechnologies obj1 = new SyntaxTechnologies();
        obj1.displayValues();
        SyntaxTechnologies obj2 = new SyntaxTechnologies("Syntax",6,2020,"07/30/2020");
        obj2.displayValues();
    }
}
