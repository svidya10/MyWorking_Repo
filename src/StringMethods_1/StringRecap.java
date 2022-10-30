package StringMethods_1;

import java.util.Arrays;

public class StringRecap {
    public static void main(String[] args) {
        String str = "jafbhjfgajbdjadBRGSGgsg! @%$##$";
        str.replaceAll("[^a-z]","");
        System.out.println("str = " + str);

        String sentence = "Batch 14 is great. Batch 14 is waste? Batch 14 is !";
        System.out.println(Arrays.toString(sentence.split("[.!?]")));
        boolean isTrue = false;
        String str2 = "Batch 14 is Great.  Batch 14 is Great";
        String replace = str2.replace("Great","Good");
        System.out.println(replace); //it replaces both great to good
        String replacefirst = str2.replaceFirst("Great","Good");
        System.out.println(replacefirst);//It replaces only first great to good not the second one



    }
}
