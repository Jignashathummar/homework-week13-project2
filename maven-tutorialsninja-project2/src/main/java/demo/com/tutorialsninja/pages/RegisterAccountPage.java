package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterAccountPage extends Utility {
    By sendFirstName = By.id("input-firstname");
    By sendLastName = By.id("input-lastname");
    By sendEmail = By.id("input-email");
    By sendTelephone = By.id("input-telephone");
    By sendPassword = By.id("input-password");
    By sendPasswordConfirm = By.id("input-confirm");
    By selectRadioButton = By.xpath("//fieldset[3]//input");

    By clickOnCheckBox = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");

    By getTextAccountCreated = By.xpath("//h1[contains(text(),'Your Account Has Been Created!");
    By clickOnContinue = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");
    By getClickOnContinue1 = By.xpath("//a[contains(text(),'Continue')]");
    By clickOnMyAccountLink = By.xpath("//span[contains(text(),'My Account')]");

    public void sendFirstName(String firstName) {
        sendTextToElement(sendFirstName, firstName);
    }

    public void sendLastName(String lastName) {
        sendTextToElement(sendLastName, lastName);
    }

    public void sendEmail(String email) {
        sendTextToElement(sendEmail, email);
    }

    public void sendTelephone(String telephone) {
        sendTextToElement(sendTelephone, telephone);
    }

    public void sendPassword(String password) {
        sendTextToElement(sendPassword, password);
    }

    public void sendPasswordConfirm(String confirmPassword) {
        sendTextToElement(sendPasswordConfirm, confirmPassword);
    }

    public void selectRadioButton(String text) {
        selectByContainsTextFromListOfElements(selectRadioButton, text);
    }

    public void clickOnCheckBox() {
        clickOnElement(clickOnCheckBox);
    }

    public String getTextAccountCreated() {
        return getTextFromElement(getTextAccountCreated);
    }

    public void clickOnContinue() {
        clickOnElement(clickOnContinue);
    }

    public void clickOnContinueButton() {
        clickOnElement(getClickOnContinue1);
    }

    public void clickOnMyAccountLink() {
        clickOnElement(clickOnMyAccountLink);
    }

}
