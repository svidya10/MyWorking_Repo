package Polymorphism;
public abstract class Student {
    void printInfo(){
        System.out.println("Student personal information");
    }
     void printMarks(){
        System.out.println("Student Marks");
    }
    protected void printCourse() {
        System.out.println("Student Courses ");
    }
}
class SyntaxStudent extends Student {
    @Override
    void printInfo() {
        System.out.println("Syntax Student information");
    }

    public void printMarks(){
        System.out.println("Syntax Student Marks");
    }
    void printSyntax(){
        System.out.println("Syntax");
    }
}
class CollegeStudent extends Student {
    protected void printCourse(){
        System.out.println("College Student Course");
    }

    void printCollege(){
        System.out.println("College");
    }
}
class SchoolStudent extends Student {
    public void printMarks(){
        System.out.println("School Student Marks");
    }
    void printSchool(){
        System.out.println("School");
    }
}
class PolymorphismTest{
    public static void main(String[] args){
        Student[] student = {new SyntaxStudent(),new CollegeStudent(), new SchoolStudent()};
        for(Student stu:student){
            stu.printInfo();
            stu.printCourse();
            stu.printMarks();
            System.out.println("---------------------------------------");
        }
    }
}