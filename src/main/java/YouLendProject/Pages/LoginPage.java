package YouLendProject.Pages;

import YouLendProject.LoadProp;
import YouLendProject.Utils;
import org.openqa.selenium.By;

public class LoginPage extends Utils {

    LoadProp loadProp = new LoadProp();

    private By _emailAddressField = By.id("email");
    private By _passwordField = By.id("passwd");
    private By _signInButton = By.id("SubmitLogin");

public void inputLoginCredentials(){
    enterText(_emailAddressField, loadProp.getProperty("Email"));
    enterText(_passwordField, loadProp.getProperty("Password"));
}

public void clickOnSignInButton(){
    clickOnElement(_signInButton);
}

}
