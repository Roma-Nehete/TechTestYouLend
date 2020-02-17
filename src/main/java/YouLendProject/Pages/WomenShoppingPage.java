package YouLendProject.Pages;

import YouLendProject.LoadProp;
import YouLendProject.Utils;
import org.openqa.selenium.By;
import org.testng.Assert;


public class WomenShoppingPage extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _blouseDress = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img");
    private By _blouseDressQuickView = By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div");
    private By _blouseTitle =By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a");
    private By _sizeDropDown = By.id("group_1");
    private By _addToCartButton = By.id("add_to_cart");
    private By _successMessage = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");
    private By _continueShoppingButton = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span");
    private By _tShirtQuickView = By.xpath(" //*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div");
    private By _tShirtTitle = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a");
    private By _closeQuickView = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/span");
    private By _viewCart = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
    private By _blueColour = By.id("color_14");
    private By _tshirtAtt = By.id("layer_cart_product_attributes");


    public void getBlouseDress(String arg1){
        scrollIntoView(_blouseDress);
        Assert.assertEquals(getText(_blouseTitle),arg1);
        waitForElementToBeVisible(_blouseDressQuickView,30);
        hoverAndClickElement(_blouseDressQuickView);
    }

    public void changeSize(String arg1){
        driver.switchTo().frame(0);
       selectByVisibleText(_sizeDropDown,arg1);
    }

    public void addToCartFirstItem(){
        clickOnElement(_addToCartButton);
        waitForElementToBeVisible(_successMessage,2);

    }

    public void continueShopping(){
        clickOnElement(_continueShoppingButton);
    }

    public void getTshirt(String arg1){
        Assert.assertEquals(getText(_tShirtTitle),arg1);
        waitForElementToBeVisible(_tShirtQuickView,30);
        hoverAndClickElement(_tShirtQuickView);
    }
    public void addToCartSecondItemAndCloseQuickView(){
        driver.switchTo().frame(0);
        clickOnElement(_addToCartButton);
        waitForElementToBeVisible(_successMessage,2);
        clickOnElement(_closeQuickView);
    }
    public void selectBlueColour(String arg1){
        driver.switchTo().frame(0);
        clickOnElement(_blueColour);

    }
    public void verifyTshirtAtt(){
        String ActualTShirtAtt = getText(_tshirtAtt);
        String ExpectedTshirtAtt = loadProp.getProperty("ExpectedTshirtAtt");
        Assert.assertEquals(ActualTShirtAtt,ExpectedTshirtAtt);
    }
    public void closeQuickView(){
        waitForElementToBeVisible(_closeQuickView,5);
        clickOnElement(_closeQuickView);
    }

    public void clickOnCart(){
        scrollIntoView(_viewCart);
        hoverAndClickElement(_viewCart);

    }


}
