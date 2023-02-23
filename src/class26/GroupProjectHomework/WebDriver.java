package class26.GroupProjectHomework;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface RemoteWebDriver extends WebDriver{
     void navigate();

}
interface TakesScreenShot extends RemoteWebDriver{
    void getScreenshot();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("ChromeDriver is opening");
    }

    @Override
    public void close() {
        System.out.println("ChromeDriver is closing..");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Chrome Navigates...");
    }
}
class FireFoxDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("FireFox is opening ...");
    }

    @Override
    public void close() {
        System.out.println("FireFox is closing..");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("FireFox is Navigating...");
    }
}
class SafariDriver implements RemoteWebDriver{
    @Override
    public void open() {
        System.out.println("Opening Safari..");
    }

    @Override
    public void close() {
        System.out.println("Safari is closing...");
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public void navigate() {
        System.out.println("Safari is navigating...");
    }

    public static void main(String[] args) {
        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.open();
        chromeDriver.close();
        System.out.println(chromeDriver.getTitle());
        chromeDriver.navigate();


        FireFoxDriver fireFox=new FireFoxDriver();
        fireFox.open();
        fireFox.close();
        System.out.println(fireFox.getTitle());
        fireFox.navigate();

        SafariDriver safariDriver=new SafariDriver();
        safariDriver.open();
        safariDriver.close();
        System.out.println(safariDriver.getTitle());
        safariDriver.navigate();
    }
}
