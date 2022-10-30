package thisKeyword;

public class Student {
    private String name;
    private String address;

   public Student (String name, String address){
        this.name=name;
        this.address = address;
    }
    void printInfo(){
        System.out.println("Student name :"+name);
        System.out.println(name+"'s Address: "+address);
    }
    public static void main(String[] args){
       new Student("ABC","1234, abc").printInfo();
    }
}
