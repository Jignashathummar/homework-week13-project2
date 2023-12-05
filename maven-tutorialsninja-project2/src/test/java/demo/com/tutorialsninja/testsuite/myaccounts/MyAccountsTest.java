package demo.com.tutorialsninja.testsuite.myaccounts;

import demo.com.tutorialsninja.pages.HomePage;
import demo.com.tutorialsninja.pages.LoginPage;
import demo.com.tutorialsninja.pages.MyAccountPage;
import demo.com.tutorialsninja.pages.RegisterAccountPage;
import demo.com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountsTest extends BaseTest {
    HomePage homePage = new HomePage();
    MyAccountPage myAccountPage = new MyAccountPage();
    RegisterAccountPage registerAccountPage = new RegisterAccountPage();
    LoginPage loginPage = new LoginPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        //2.1 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();
        //2.2 Call the method “selectMyAccountOptions” method and pass the parameter “Login”
        homePage.selectMyAccountOptions("Login");
        //2.3 Verify the text “Returning Customer”.
        String expectedMessage = "Returning Customer";
        String actualMessage = myAccountPage.getTextMessage();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
        //3.1 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();
        //3.2 Call the method “selectMyAccountOptions” method and pass the parameter “Register”
        homePage.selectMyAccountOptions("Register");
        //3.3 Enter First Name
        registerAccountPage.sendFirstName("prime" + getAlphaNumericString(4));
        //3.4 Enter Last Name
        registerAccountPage.sendLastName("Test" + getAlphaNumericString(4));
        //3.5 Enter Email
        registerAccountPage.sendEmail("prime" + getAlphaNumericString(4) + "@gmail.com");
        //3.6 Enter Telephone
        registerAccountPage.sendTelephone("07988112233");
        //3.7 Enter Password
        registerAccountPage.sendPassword("test123");
        //3.8 Enter Password Confirm
        registerAccountPage.sendPasswordConfirm("test123");
        //3.9 Select Subscribe Yes radio button
        registerAccountPage.selectRadioButton("Yes");
        //3.10 Click on Privacy Policy check box
        registerAccountPage.clickOnCheckBox();
        //3.11 Click on Continue button
        registerAccountPage.clickOnContinue();
        //3.12 Verify the message “Your Account Has Been Created!”
        String expectedAccountCreated = "Your Account Has Been Created!";
        String actualAccountCreated = registerAccountPage.getTextAccountCreated();
        Assert.assertEquals(expectedAccountCreated, actualAccountCreated);
        //3.13 Click on Continue button
        registerAccountPage.clickOnContinueButton();
        //3.14 Click on My Account Link.
        registerAccountPage.clickOnMyAccountLink();
        //3.15 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        homePage.selectMyAccountOptions("Logout");
        //3.16 Verify the text “Account Logout”
        String expectedMessage = "Account Logout";
        String actualMessage = myAccountPage.getTextAccountLogout();
        Assert.assertEquals(expectedMessage, actualMessage);
        //3.17 Click on Continue button
        myAccountPage.clickOnContinueButton();
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
        //4.1 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();
        //4.2 Call the method “selectMyAccountOptions” method and pass the parameter "Login”
        homePage.selectMyAccountOptions("Login");
        //4.3 Enter Email address
        loginPage.sendEmail("prime1233@gmail.com");
        //4.4 Enter Password
        loginPage.enterPassword("test1234");
        //4.5 Click on Login button
        loginPage.clickOnLoginButton();
        //4.7 Verify text “My Account”
        String expectedtextMyAccount = "My Account";
        String actualtextMyAccount = loginPage.getTextMyAccount();
        Assert.assertEquals(expectedtextMyAccount, actualtextMyAccount);
        //4.8 Click on My Account Link.
        myAccountPage.clickOnMyAccountLink();
        //4.9 Call the method “selectMyAccountOptions” method and pass the parameter “Logout”
        homePage.selectMyAccountOptions("Logout");
        //4.10 Verify the text “Account Logout”
        String expectedMessage = "Account Logout";
        String actualMessage = myAccountPage.getTextAccountLogout();
        Assert.assertEquals(expectedMessage, actualMessage);
        //4.11 Click on Continue button
        myAccountPage.clickOnContinueButton();
    }
}
