package com.saucedemo.testcases;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.utils.ConfigUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Auth Feature")
public class LoginTest extends BaseTest {
    @Story("Login with invalid username and password")
    @Description("It will login by filling the invalid username and the password and show me the error")
    @Test(description = "Test the login functionality using invalid data")
    public void ShouldBeUnableToLoginWithInvalidUsernameAndPassword() {
        LoginPage loginPage = new LoginPage(getDriver());
        boolean isErrorMsgDisplayed = loginPage
                .load()
                .loginWithInvalidUsernameAndPassword(ConfigUtils.getInstance().getInvalidUsername(), ConfigUtils.getInstance().getInvalidPassword())
                .isErrorMassageDisplayed();

        Assert.assertTrue(isErrorMsgDisplayed);

    }

    @Story("Login with valid username and password")
    @Description("It will login by filling the valid username and the password and navigate to the main page ")
    @Test(description = "Test the login functionality using valid data")
    public void ShouldBeAbleToLoginWithValidUsernameAndPassword() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage
                .load()
                .loginWithValidUsernameAndPassword(ConfigUtils.getInstance().getValidUsername(), ConfigUtils.getInstance().getValidPassword());

        Assert.assertEquals(getDriver().getCurrentUrl(), "https://www.saucedemo.com/inventory.html");

    }
}
