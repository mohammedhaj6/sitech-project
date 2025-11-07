package com.saucedemo.pages;

import com.saucedemo.utils.ConfigUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement usernameInput;
    @FindBy(id = "password")
    private WebElement passwordInput;
    @FindBy(id = "login-button")
    private WebElement loginBtn;
    @FindBy(css = "h3[data-test='error']")
    private WebElement errorMsg;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("visit the Login Page")
    public LoginPage load() {
        driver.get(ConfigUtils.getInstance().getBaseUrl());
        return this;
    }

    @Step
    public LoginPage loginWithInvalidUsernameAndPassword(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
        return this;
    }

    @Step
    public MainPage loginWithValidUsernameAndPassword(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
        return new MainPage(driver);
    }

    @Step
    public boolean isErrorMassageDisplayed() {
        return errorMsg.isDisplayed();

    }
}
