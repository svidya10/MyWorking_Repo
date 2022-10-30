package Abstraction;
abstract class File {
    abstract void open();
    void edit(){
        System.out.println("Edit file");
    }
    void close(){
        System.out.println("Close the file");
    }
}
class JavaFile extends File {
    @Override
    void open() {
        System.out.println("Open method implemented in Java File");
    }
}
class WordFile extends File {
    @Override
    void open() {
        System.out.println("Open method implemented in Word File");
    }
}
class PdfFile extends File {
    @Override
    void open() {
        System.out.println("Open method implemented in PDF File");
    }
}
class FileTester{
    public static void main(String[] args){
        File[] files = {new JavaFile(),new WordFile(),new PdfFile()};
        for (File f: files) {
              f.open();
              f.edit();
              f.close();
        }
    }
}
