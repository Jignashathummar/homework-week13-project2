package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {
    HomePage homePage;
    By mouseHoverAndClickOnDesktop = By.linkText("Desktops");

    By clickOnShowAllDesktop = By.linkText("Show AllDesktops");
    By selectOption = By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li");

    public void mouseHoverAndClickOnDesktop() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnDesktop);
    }

    public void clickOnShowAllDesktop() {
        clickOnElement(clickOnShowAllDesktop);
    }


    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = getListOfElements(selectOption);
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = getListOfElements(selectOption);
        }
    }
}
