package YouLendProject;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserSetup extends BasePage {

    LoadProp loadProp = new LoadProp();
    String browser = loadProp.getProperty("Browser");

   //Method for Multi Browser
   public void selectBrowser(){
        if (browser.equalsIgnoreCase("Chrome")){
        System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDrivers\\chromedriver.exe");
        driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDrivers\\geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver","src\\test\\Resources\\BrowserDrivers\\msedgedriver.exe");
            driver = new EdgeDriver();

        } else {
            System.out.println("Invalid Browser");
        }
    }


    // We could setup SauceLabs or BrowserStack settings here - to enable testing on different devices or browsers

}
