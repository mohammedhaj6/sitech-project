package com.saucedemo.pages;

import com.saucedemo.utils.ConfigUtils;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    private final By usernameInput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginBtn = By.id("login-button");
    private final By errorMsg = By.cssSelector("h3[data-test='error']");

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
        find(usernameInput).sendKeys(username);
        find(passwordInput).sendKeys(password);
        find(loginBtn).click();
        return this;
    }

    @Step
    public MainPage loginWithValidUsernameAndPassword(String username, String password) {
        find(usernameInput).sendKeys(username);
        find(passwordInput).sendKeys(password);
        find(loginBtn).click();
        return new MainPage(driver);
    }

    @Step
    public boolean isErrorMassageDisplayed() {
        return find(errorMsg).isDisplayed();
    }
}
