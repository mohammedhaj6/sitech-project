package com.saucedemo.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class MainPage extends BasePage {

    private final By dropDown = By.className("product_sort_container");
    private final By addToCartButtonForTheFirstItem = By.cssSelector(".inventory_item:first-of-type button.btn_inventory");
    private final By shoppingCartBadgeNumber = By.xpath("//*[@id='shopping_cart_container']/a/span");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public MainPage sortByHighestPrice() {
        Select sortDropdown = new Select(find(dropDown));
        find(addToCartButtonForTheFirstItem).click();
        sortDropdown.selectByVisibleText("Price (high to low)");
        return this;
    }

    @Step
    public MainPage clickOnAddToCartButton() {
        find(addToCartButtonForTheFirstItem).click();
        return this;
    }

    @Step
    public boolean isShoppingCartBadgeNumberDisplayed() {
        return find(shoppingCartBadgeNumber).isDisplayed();
    }
}
