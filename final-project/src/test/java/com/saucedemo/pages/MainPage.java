package com.saucedemo.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class MainPage extends BasePage {


    @FindBy(className = "product_sort_container")
    private WebElement dropDown;
    @FindBy(css = ".inventory_item:first-of-type button.btn_inventory")
    private WebElement addToCartButtonForTheFirstItem;
    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]/a/span")
    private WebElement shoppingCartBadgeNumber;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public MainPage sortByHighestPrice() {
        Select sortDropdown = new Select(dropDown);
        sortDropdown.selectByVisibleText("Price (high to low)");
        return this;

    }

    @Step
    public MainPage clickOnAddToCartButton() {
        addToCartButtonForTheFirstItem.click();
        return this;
    }

    @Step
    public boolean isShoppingCartBadgeNumberDisplayed() {
        return shoppingCartBadgeNumber.isDisplayed();

    }


}
