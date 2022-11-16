package HW_Maps;

import java.util.*;

public class Hw2_MapCountry {
    public static void main(String[] args) {
        TreeMap<String,String> countries = new TreeMap<>();
        countries.put("USA","Washington DC");
        countries.put("Japan","Tokyo");
        countries.put("Canada","Ottawa");
        countries.put("Mexico","Mexico City");
        countries.put("England","London");
        countries.put("Australia","Canberra");
        Set<Map.Entry<String, String>> kv = countries.entrySet();

        System.out.println("***********************************"+"\n"+"Keys and values using foreach loop:"+"\n"+"***********************************");
        for (Map.Entry<String,String> kventry:  kv ) {
            System.out.println(kventry);
        }
        System.out.println("********************************"+"\n"+"Keys and values using iterator:"+"\n"+"********************************");
        Iterator it= kv.iterator();
        while (it.hasNext()){
            Object cc = it.next();
            System.out.println(cc);
        }
        Collection vEntry = countries.values();
        System.out.println("**************************"+"\n"+"Values using foreach loop:"+"\n"+"**************************");
        for (Object values:  vEntry ) {
            System.out.println(values);
        }
        System.out.println("*************************"+"\n"+"Values using iterator:"+"\n"+"*************************");
        Iterator itv = vEntry.iterator();
        while (itv.hasNext()){
            Object cv = itv.next();
            System.out.println(cv);
        }
    }
}
