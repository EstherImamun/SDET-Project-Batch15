package class23;

public class WebDriverTester {
    public static void main(String[] args) {
       /* WebDriver webDriver=new FireFox();// Up Casting
       // FireFox fireFox=new WebDriver(); // down casting
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();

        //an array of type parent class can hold the objects of all the child classes
        Chrome chrome=new Chrome();
        FireFox fireFox=new FireFox();
        Safari safari=new Safari();

        WebDriver[] browsers={Chrome,Safari,FireFox};*/
        WebDriver[] browsers={new Chrome(),new Safari(),new FireFox()};

        for(WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();
        }






















        /* System.out.println("_______________________________");
         Safari safari=new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();
        System.out.println("__________________________________");

        FireFox fireFox=new FireFox();
        fireFox.startBrowser();
        fireFox.openURL();
        fireFox.testLoginPage();
        fireFox.closeBrowser();*/

    }
}
