package YouLendProject.Pages;

import YouLendProject.Utils;
import org.openqa.selenium.By;

public class AddressTabPage extends Utils {
    private By _proceedToCheckOutButton = By.xpath("//*[@id=\"center_column\"]/form/p/button");

    public void clickOnProceedToCheckOut(){
        clickOnElement(_proceedToCheckOutButton);
    }
}
