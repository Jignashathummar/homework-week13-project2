package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuPage extends Utility {
    By getMenu = By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*");
    By mouseHoverAndClickOnDesktops = By.linkText("Desktops");
    By getTextDesktops = By.xpath("//h2[contains(text(),'Desktops')]");
    By mouseHoverAndClickOnLaptopsAndNotebooks = By.linkText("Laptops & Notebooks");
    By getTextLaptopsAndNotebooks = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    By mouseHoverAndClickOnComponents = By.linkText("Components");
    By getTextComponents = By.xpath("//h2[contains(text(),'Components')]");

    public List<WebElement> getMenu() {
        return getListOfElements(getMenu);
    }

    public void mouseHoverAndClickOnDesktops() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnDesktops);
    }

    public String getTextDesktops() {
        return getTextFromElement(getTextDesktops);
    }

    public void mouseHoverAndClickOnLaptopsAndNotebooks() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnLaptopsAndNotebooks);
    }

    public String getTextLaptopsAndNotebook() {
        return getTextFromElement(getTextLaptopsAndNotebooks);
    }

    public void mouseHoverAndClickOnComponents() {
        mouseHoverToElementAndClick(mouseHoverAndClickOnComponents);
    }

    public String getTextComponents() {
        return getTextFromElement(getTextComponents);
    }
}
