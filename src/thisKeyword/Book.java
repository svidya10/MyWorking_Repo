package thisKeyword;
public class Book {
    /*Write Book class that will have instance variables and 2 Constructors.
    While creating an object make sure: Instance variables are being initialized   Both Constructors are being executed*/
    private String bName;
    private int pageNos;
    private String genere;
    public Book(String bName, int pageNos, String type) {
        //this.bName = bName;
        //this.pageNos = pageNos;
        this(bName,pageNos);
        genere = type;
        System.out.println(bName+" book is "+pageNos+" pages and "+type+" book");
    }
    Book (String bName, int pageNos){
        //this(bName,pageNos,"");
        this.bName = bName;
        this.pageNos = pageNos;
        System.out.println(bName+" book is "+pageNos+" pages");
    }
    public static void main(String[] args){
        new Book("Harry Potter", 900,"Fantasy");
        new Book("LOL", 60);
    }
}
