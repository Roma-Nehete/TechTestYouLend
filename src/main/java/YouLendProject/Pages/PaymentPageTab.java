package YouLendProject.Pages;

import YouLendProject.Utils;
import org.openqa.selenium.By;

public class PaymentPageTab extends Utils {
    private By _payByBankWireButton = By.className("bankwire");
    private By _confirmOrderButton = By.xpath("//*[@id=\"cart_navigation\"]/button");

    public void clickOnPayByBankWire(){
        clickOnElement(_payByBankWireButton);
    }
    public void clickOnConfirmOrder(){
        clickOnElement(_confirmOrderButton);
    }
}
