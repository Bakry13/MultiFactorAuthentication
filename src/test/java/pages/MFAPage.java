package pages;

import actions.ElementActions;
import org.openqa.selenium.By;

public class MFAPage extends ElementActions {
    By username = By.id("username");
    By password = By.id("password");
    By otp = By.id("totpcode");
    By loginButton = By.id("log-in");

    public void typeUsername(String usernameValue)
    {
        getElement(username).sendKeys(usernameValue);
    }
    public void typePassword(String passwordValue)
    {
        getElement(password).sendKeys(passwordValue);
    }
    public void typeOTP(String OTPValue)
    {
        getElement(otp).sendKeys(OTPValue);
    }
    public void clickLogin()
    {
        getElement(loginButton).click();
    }
}
