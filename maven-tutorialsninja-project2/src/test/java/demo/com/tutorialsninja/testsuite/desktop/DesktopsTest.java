package demo.com.tutorialsninja.testsuite.desktop;

import demo.com.tutorialsninja.pages.DesktopsPage;
import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();

//    @Test
//    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
//        //1.1 Mouse hover on Desktops Tab.and click
//        homePage.mouseHoverAndClickOnDesktop();
//        //1.2 Click on “Show All Desktops”
//        homePage.clickOnShowAllDesktop();
//        // Get all the products name and stored into array list
//        List<String> originalProductsName = desktopsPage.getProductNameList();
//        // Sort By Reverse order
//        Collections.reverse(originalProductsName);
//        //1.3 Select Sort By position "Name: Z to A"
//        Thread.sleep(2000);
//        desktopsPage.selectSortByFilter("Name (Z - A)");
//        // After filter Z -A Get all the products name and stored into array list
//        Thread.sleep(2000);
//        List<String> afterSortByZToAProductsName = desktopsPage.getProductNameList();
//        Assert.assertEquals(originalProductsName, afterSortByZToAProductsName);
//    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        // Mouse hover on Currency Dropdown and click
        desktopsPage.clickOnCurrencyPound();
        // Mouse hover on £Pound Sterling and click
        desktopsPage.changeCurrenctToPound();
        // Mouse hover on Desktops Tab. and click
        homePage.mouseHoverAndClickOnDesktop();
        // Click on “Show All Desktops”
        homePage.clickOnShowAllDesktop();
        // Select Sort By position "Name: A to Z"
        desktopsPage.selectSortByFilter("Name (A - Z)");
        Thread.sleep(2000);
        // Select product “HP LP3065”
        desktopsPage.clickOnHPLP3065();
        // Verify the Text "HP LP3065"
        String expectedValueHPLP3065 = "HP LP3065";
        String actualValueHPLP3065 = desktopsPage.getTitleHPLP3065();
        Assert.assertEquals(actualValueHPLP3065, expectedValueHPLP3065);
        // Select Delivery Date "2023-11-27"
        desktopsPage.clickOnDatePicker();
        // Click on “Add to Cart” button
        desktopsPage.clickOnAddToCartBtn();
        // Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        Thread.sleep(2000);
        String expectedMsgAddToCart = "Success: You have added HP LP3065 to your shopping cart!";
        //Click on link “shopping cart” display into success message
        desktopsPage.clickOnShoppingCart();
        //Verify the text "Shopping Cart"
        String expectedShoppingCart = "Shopping Cart";
        String actualShoppingCart = desktopsPage.getShoppingCart();
        Assert.assertEquals(expectedShoppingCart,actualShoppingCart);
        //Verify the Product name "HP LP3065"
        String expectedProductNameHPLP3065 = "HP LP3065";
        String actualProductNameHPLP3065 = desktopsPage.getProductName();
        Assert.assertEquals(expectedProductNameHPLP3065,actualProductNameHPLP3065);
        //Verify the Delivery Date "2025-11-30"
        String expectedDeliveryDate = "Delivery Date:2025-11-30";
        String actualDeliveryDate = desktopsPage.getDeliveryDate();
        Assert.assertEquals(expectedDeliveryDate,actualDeliveryDate);
        //Verify the Model "Product21"
        String expectedModelProduct = "Product 21";
        String actualModelProduct = desktopsPage.getModelProduct();
        Assert.assertEquals(expectedModelProduct,actualModelProduct);
        //Verify the Total "£74.73"
        String expectedValueOfTotal = "£74.73";
        String actualValueOfTotal = desktopsPage.getValueOfTotal();
        Assert.assertEquals(expectedValueOfTotal,actualValueOfTotal);

    }
}
