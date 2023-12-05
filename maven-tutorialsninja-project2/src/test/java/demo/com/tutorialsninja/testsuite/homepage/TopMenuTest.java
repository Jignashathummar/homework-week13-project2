package demo.com.tutorialsninja.testsuite.homepage;

import demo.com.tutorialsninja.pages.TopMenuPage;
import demo.com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TopMenuTest extends BaseTest {
    TopMenuPage topMenuPage = new TopMenuPage();

    @Test
    public void selectMenu(String menu) {
        List<WebElement> topMenuList = topMenuPage.getMenu();
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = topMenuPage.getMenu();
        }
    }

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //1.1 Mouse hover on “Desktops” Tab and click
        topMenuPage.mouseHoverAndClickOnDesktops();
        //1.2 call selectMenu method and pass the menu = “Show AllDesktops”
        selectMenu("Show AllDesktops");
        //1.3 Verify the text ‘Desktops’
        String expectedText = "Desktops";
        String actualText = topMenuPage.getTextDesktops();
        Assert.assertEquals(expectedText, actualText);

    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        topMenuPage.mouseHoverAndClickOnLaptopsAndNotebooks();
        //2.2 call selectMenu method and pass the menu = “Show AllLaptops & Notebooks”
        selectMenu("Show AllLaptops & Notebooks");
        //2.3 Verify the text ‘Laptops & Notebooks’
        String expectedLaptopsAndNotebooks = "Laptops & Notebooks";
        String actualLaptopsAndNotebooks = topMenuPage.getTextLaptopsAndNotebook();
        Assert.assertEquals(expectedLaptopsAndNotebooks, actualLaptopsAndNotebooks);
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        //3.1 Mouse hover on “Components” Tab and click
        topMenuPage.mouseHoverAndClickOnComponents();
        //3.2 call selectMenu method and pass the menu = “Show AllComponents”
        selectMenu("Show AllComponents");
        //3.3 Verify the text ‘Components’
        String expectedTextComponents = "Components";
        String actualTextComponents = topMenuPage.getTextComponents();
        Assert.assertEquals(expectedTextComponents, actualTextComponents);

    }


}
