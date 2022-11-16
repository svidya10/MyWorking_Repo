package HW_Maps;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hw5_Employee {
    public static void main(String[] args) {
        HashMap<String,Double> emp = new HashMap<>();
        emp.put("Amy",110000.00);
        emp.put("John",90000.00);
        emp.put("Dory",100000.00);
        emp.put("Nemo",120000.00);
        double highSal = 0;
        String highname = "";
        Set<Map.Entry<String, Double>> empEntry = emp.entrySet();
        for (var empkv:emp.entrySet()) {
            if(empkv.getValue()>highSal){
                highSal=empkv.getValue();
                highname=empkv.getKey();
            }
        }
        System.out.println(highname+"=$"+highSal);
    }
}
