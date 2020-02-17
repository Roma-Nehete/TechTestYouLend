package YouLendProject.Pages;

import YouLendProject.Utils;
import org.openqa.selenium.By;

public class ShippingTabPage extends Utils {
    private By _termsOfServiceCheckBox = By.id("cgv");
    private By _proceedToCheckoutButton = By.xpath("//*[@id=\"form\"]/p/button");

    public void clickOnTermsOfService(){
        clickOnElement(_termsOfServiceCheckBox);
    }
    public void clickOnProceedToCheckout(){
        clickOnElement(_proceedToCheckoutButton);
    }

}
