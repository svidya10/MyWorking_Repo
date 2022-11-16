package Collections_Hw;

import java.util.HashSet;
import java.util.Objects;

public class Hw6_Student {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hw6_Student that = (Hw6_Student) o;
        return studentID == that.studentID && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentID);
    }
    private String name;
    private int studentID;
    Hw6_Student (String name ,int studentID) {
        this.name = name;
        this.studentID = studentID;
    }
    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] args){
        HashSet<Hw6_Student> obj = new HashSet<>();
        obj.add(new Hw6_Student("Vidya",10010));
        obj.add(new Hw6_Student("Nithya",12002));
        obj.add(new Hw6_Student("Divya",10298));
        for (Hw6_Student o:obj ) {
            System.out.println(o.getName()+" - "+o.getStudentID());
            o.toString();
        }

    }
}
