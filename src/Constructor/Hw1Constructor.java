package Constructor;
public class Hw1Constructor {
/*  Write a java class that will have a constructor: one with parameters and second without any parameters.
       Create a separate Test class where you will execute both of the constructors 1 by 1.*/
    public String console;
    private String gameName;
    private int players;
    public Hw1Constructor (int noOfPlayers, String consoleType, String game){
        console = consoleType;
        gameName = game;
        players = noOfPlayers;
        System.out.println("I am in parametrized constructor");
    }
    Hw1Constructor() {
        System.out.println("I am in default constructor");
    }
}
