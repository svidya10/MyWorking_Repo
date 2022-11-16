package HW_Maps;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Create a Person class with following private fields: name, lastName, age, salary.
//Variables should be initialized through constructor.
//Inside the class also create a method to print user details.
//In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object.
// Print each object details.
public class Hw4_MapPerson {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    Hw4_MapPerson(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

   @Override
    public String toString() {
        return "FirstName: " + firstName + "\n" + "LastName: " + lastName + "\n" + "Age: " + age + "\n" + "Salary: " + salary;
    }

    public String displayInfo() {

        return "FirstName: " + firstName + "\n" + "LastName: " + lastName + "\n" + "Age: " + age + "\n" + "Salary: " + salary;
    }
}
class TestPerson{
    public static void main(String[] args) {
        TreeMap<Integer, Hw4_MapPerson> person = new TreeMap<>();
        person.put(200, new Hw4_MapPerson("Mark", "Z", 31, 110000.00));
        person.put(400, new Hw4_MapPerson("John", "S", 42, 150000.00));
        person.put(100, new Hw4_MapPerson("Dory", "R", 25, 890000));
        person.put(300, new Hw4_MapPerson("Nemo", "K", 18, 60000));

        Set<Map.Entry<Integer, Hw4_MapPerson>> entrykv = person.entrySet();
        for (var ekv:entrykv) {
            System.out.println(ekv.getKey()+"\n"+ekv.getValue()+"\n******************");
        }
    }
}

