package YouLendProject.Pages;

import YouLendProject.Utils;
import org.openqa.selenium.By;

public class MyAccountPage extends Utils {

    private By _womenTab = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");

    public void goToWomenSection(){
        clickOnElement(_womenTab);
    }
}
