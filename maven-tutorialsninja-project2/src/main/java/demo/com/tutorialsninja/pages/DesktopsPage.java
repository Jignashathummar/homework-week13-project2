package demo.com.tutorialsninja.pages;

import demo.com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopsPage extends Utility {
    By getProductNameList = By.xpath("//h4/a");
    By selectSortByZtoA = By.id("input-sort");
    By clickOnCurrencyPound = By.xpath("//span[contains(text(),'Currency')]");
    By changeCurrenctToPound = By.xpath("//button[normalize-space()='£Pound Sterling']");
    By clickOnHPLP3065 = By.xpath("//a[contains(text(),'HP LP3065')]");
    By clickOnDatePicker = By.xpath("//div[@class = 'input-group date']//button");
    By getTitleHPLP3065 = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By getDatePicketText = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");
    By getallDates = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");

    By clickOnAddToCartBtn = By.xpath("//button[@id='button-cart']");
    By clickOnShoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");
    By getShoppingCart = By.xpath("//a[contains(text(),'Shopping Cart')]");
    By getProductName = By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By getDeliveryDate = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]");
    By getModelProduct = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]");
    By getValueOfTotal = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");

    public List<String> getProductNameList() {
        return getList(getProductNameList);
    }

    public void selectSortByFilter(String text) {
        selectByVisibleTextFromDropDown(selectSortByZtoA, text);
    }

    public void clickOnCurrencyPound() {
        clickOnElement(clickOnCurrencyPound);
    }

    public void changeCurrenctToPound() {
        clickOnElement(changeCurrenctToPound);
    }

    public void clickOnHPLP3065() {
        clickOnElement(clickOnHPLP3065);
    }

    public String getTitleHPLP3065() {
        return getTextFromElement(getTitleHPLP3065);
    }

    public void clickOnDatePicker() {
        String year = "2025";
        String month = "November";
        String date = "30";
        clickOnElement(clickOnDatePicker);
        while (true) {
            String monthAndYear = getTextFromElement(getDatePicketText);
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = getListOfElements(getallDates);
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    public void clickOnAddToCartBtn() {
        clickOnElement(clickOnAddToCartBtn);
    }

    public void clickOnShoppingCart() {
        clickOnElement(clickOnShoppingCart);
    }

    public String getShoppingCart() {
        return getTextFromElement(getShoppingCart);
    }

    public String getProductName() {
        return getTextFromElement(getProductName);
    }

    public String getDeliveryDate() {
        return getTextFromElement(getDeliveryDate);
    }

    public String getModelProduct() {
        return getTextFromElement(getModelProduct);
    }

    public String getValueOfTotal() {
        return getTextFromElement(getValueOfTotal);
    }
}
