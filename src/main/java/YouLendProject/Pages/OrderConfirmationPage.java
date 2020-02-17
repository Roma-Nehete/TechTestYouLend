package YouLendProject.Pages;

import YouLendProject.LoadProp;
import YouLendProject.Utils;
import org.openqa.selenium.By;
import org.testng.Assert;

public class OrderConfirmationPage extends Utils {
    LoadProp loadProp = new LoadProp();
    private By _orderConfirmationMessage = By.xpath("//*[@id=\"center_column\"]/div/p/strong");
    private By _signOutButton = By.className("logout");

    public void verifyOrderIsSuccessful(){
       String ActualOrderSuccessMessage =  getText(_orderConfirmationMessage);
       String ExpectedOrderSuccessMessage = loadProp.getProperty("ExpectedOrderSuccessMessage");
        Assert.assertEquals(ActualOrderSuccessMessage,ExpectedOrderSuccessMessage);

    }
    public void clickOnSignOut(){
        clickOnElement(_signOutButton);
    }

}
