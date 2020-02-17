package YouLendProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BasePage {

    //to type text
    public static void enterText (By by , String text){
        driver.findElement(by).sendKeys(text);
    }

    // To click
    public static void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    // to get Actual text from the element
    // using String cz the returning text is String
    public static String getText (By by){

        return driver.findElement(by).getText();
    }

    // to select from Drop down Menu
    public static void selectByVisibleText (By element , String text){

        new Select(driver.findElement(element)).selectByVisibleText(text);
    }

    public static void waitForElementToBeVisible(By by , int time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }


    public static void waitForElementToBeInvisible(By by , int time)
    {WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    public static void waitForElementToLoad(By by , int time ){
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void waitForElementToBeClickable(By by , int time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void hoverAndClickElement(By by){
        Actions hover = new Actions(driver);
        WebElement webElement = driver.findElement(by);
        hover.moveToElement(webElement).perform();
        webElement.click();
    }
    public static void hoverOverElement(By by){
        Actions hover = new Actions(driver);
        WebElement webElement = driver.findElement(by);
        hover.moveToElement(webElement).perform();
    }

    public static void scrollIntoView(By by){
        WebElement webElement = driver.findElement(by);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", webElement);




    }


}
