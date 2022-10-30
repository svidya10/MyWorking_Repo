package HWStringMethods;

public class Language {
    //Create a method that will say Hello in different language based on the country that will passed when method is executed
    String getHello (String country) {
        String hello = null;
        switch (country) {
            case "India":
                hello = "Namaste";
                break;
            case "USA":
                hello = "Hello";
                break;
            case "France":
                hello = "Bonjour";
                break;
            default:
                hello = "Not a valid country";
        }
        return hello;
    }
        public static void main (String[] args){
            Language hello = new Language();
            String inpCntry = "France";
            System.out.println("Hello in country " + inpCntry + " is " + hello.getHello(inpCntry));
        }
}
