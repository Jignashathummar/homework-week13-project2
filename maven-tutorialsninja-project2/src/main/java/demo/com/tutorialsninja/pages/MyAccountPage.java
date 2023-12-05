package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MyAccountPage extends Utility {
    By clickOnMyAccountLink = By.xpath("//span[contains(text(),'My Account')]");
    By getTextMessage = By.xpath("//h2[contains(text(),'Returning Customer')]");
    By getTextAccountLogout = By.xpath("//h1[contains(text(),'Account Logout')]");

    By getClickOnContinue1 = By.xpath("//a[contains(text(),'Continue')]");

    public void clickOnMyAccountLink() {
        clickOnElement(clickOnMyAccountLink);
    }

    public String getTextMessage() {
        return getTextFromElement(getTextMessage);
    }

    public String getTextAccountLogout(){
        return getTextFromElement(getTextAccountLogout);
    }
    public void clickOnContinueButton(){
        clickOnElement(getClickOnContinue1);
    }
}
