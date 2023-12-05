package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By sendEmail = By.id("input-email");
    By enterPassword = By.id("input-password");
    By clickOnLoginButton = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");
    By getTextMyAccount = By.xpath("//h2[normalize-space()='My Account']");

    public void sendEmail(String email) {
        sendTextToElement(sendEmail, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(enterPassword, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(clickOnLoginButton);
    }

    public String getTextMyAccount() {
        return getTextFromElement(getTextMyAccount);
    }
}
