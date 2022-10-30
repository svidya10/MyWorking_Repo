package Inherit_Contruct_Repls;


class MainEmployee {
    public static void main(String[] args){
        Employee emp = new Employee("Joe","Smith",35,35000);
        emp.print();
        Student stu = new Student("Adam","Smith",15,10);
        stu.print();
        Retiree ret = new Retiree("Frank","Smith",15,"tour");
        ret.print();
    }
}
class Person{
    String name;
    String lastName;
    int age;
    Person(String name,String lastName,int age){
        this.name=name;
        this.lastName=lastName;
        this.age=age;
    }
}
class Employee extends Person {
    int salary;
    Employee (String name, String lastName, int age, int salary){
        super(name,lastName,age);
    }
    void print(){
        System.out.println(name+" "+lastName+" "+age+" "+salary);
    }
}
class Student extends Employee {
    int grade;
    Student(String name, String lastName, int age, int grade){
        super(name,lastName,age,0);
        this.grade = grade;
    }
    void print(){
        System.out.println(name+" "+lastName+" "+age+" "+grade);
    }
}
class Retiree extends Student {
    String seniorActivity;
    Retiree (String name, String lastName, int age, String seniorActivity){
        super(name,lastName,age,0);
        this.seniorActivity = seniorActivity;
    }
    void print(){
        System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
    }
}

