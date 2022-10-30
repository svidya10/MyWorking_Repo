package Abstraction;
public interface WebDriver_HW2 {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver_HW2{
    public void openBrowser(){
        System.out.println("Open Chrome Browser");
    }
    public void closeBrowser(){
        System.out.println("Close Chrome Browser");
    }
    public void maximizeWindow(){
        System.out.println("Maximize Window in Chrome Browser");
    }
    public void findElement(){
        System.out.println("Find element in Chrome Browser");
    }
}
class FirefoxDriver extends ChromeDriver implements WebDriver_HW2 {
    public void openBrowser(){
        System.out.println("Open Firefox Browser");
    }
    public void closeBrowser(){
        System.out.println("Close Firefox Browser");
    }
    public void maximizeWindow(){
        System.out.println("Maximize Window in Firefox Browser");
    }
    public void findElement(){
        System.out.println("Find element in Firefox Browser");
    }
}
class DriverTester{
    public static void main(String[] args){
        WebDriver_HW2[] drivers = {new ChromeDriver(),new FirefoxDriver()};
        for (WebDriver_HW2 driver: drivers) {
            driver.openBrowser();
            driver.maximizeWindow();
            driver.findElement();
            driver.closeBrowser();
        }
    }
}
