package class25;

public interface WebDriver {
   /* Create a WebDriver Interface that will have the following unimplemented behaviour:
   openBrowser(), closeBrowser(), maximizeWindow(), findElement(). Create 2 classes
    that implements WebDriver interface: ChromeDriver and FirefoxDriver.
    */

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver{
    @Override
    public void openBrowser() {
        System.out.println("Opening Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximizing window on Chrome");
    }

    @Override
    public void findElement() {
        System.out.println("doing a research using chrome Browser");
    }
}
class FireFoxDriver implements WebDriver{
    @Override
    public void openBrowser() {
       System.out.println("Opening Browser using FireFox");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing FireFox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Enlarging window on FireFox");
    }

    @Override
    public void findElement() {
        System.out.println("doing a research using FireFox");
    }


    public static void main(String[] args) {
        System.out.println("--------------using Enhanced For Loop------------------");
        WebDriver[] webDriver={new ChromeDriver(),new FireFoxDriver()};
        for(WebDriver web:webDriver){
            web.openBrowser();
            web.closeBrowser();
            web.maximizeWindow();
            web.findElement();
        }

        System.out.println("---------------using normal For Loop---------------------");

        WebDriver[] webDriver1={new ChromeDriver(),new FireFoxDriver()};
        for (int i = 0; i < webDriver1.length; i++) {
            WebDriver web1=webDriver1[i];
            web1.openBrowser();
            web1.closeBrowser();
            web1.maximizeWindow();
            web1.findElement();

        }
    }
}
