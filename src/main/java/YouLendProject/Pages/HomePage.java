package YouLendProject.Pages;

import YouLendProject.Utils;
import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By _signIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");

    public void goToLoginPage(){
        System.out.println(driver.getCurrentUrl());
        clickOnElement(_signIn);
    }
}
