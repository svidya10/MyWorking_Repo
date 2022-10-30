package ReplTest;

public class compareLetters {
        public String alphabetical (String str){
            String s="";
            s+=str.charAt(0);
            for(int i=1; i<str.length(); i++){
                    if(str.charAt(i)>str.charAt(i-1)) {
                        s += str.charAt(i);
                    }
            }
            System.out.println(s);
            return s;
            }
        public static void main(String[] args){
            compareLetters obj = new compareLetters();
            obj.alphabetical("hello");
            obj.alphabetical("software");
            obj.alphabetical("language");
        }
}
