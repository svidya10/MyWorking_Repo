package ReplTest;

public class maxLength {
    static String maxLength (String[] arr){
        String s="";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > s.length()) {
                s = arr[i];
            }
        }
        return s;
    }
    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hiiiiiiiiiiiiiiiiiiiiiiiiiii","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
}
