package com.saucedemo.testcases;

import com.saucedemo.base.BaseTest;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.utils.ConfigUtils;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.Assert;
import org.testng.annotations.Test;

@Feature("Item Feature")
public class AddItemWithTheHighestPriceTest extends BaseTest {
    @Description("It will add highest price item to cart ")

    @Story("add item to the cart")
    @Test(description = "Should be able to add with the highest price item to the cart")

    public void verifyTheHighPriceItemIsAddedToTheCart() {
        LoginPage loginPage = new LoginPage(getDriver());

        boolean isBadgeNumberDisplayed = loginPage
                .load()
                .loginWithValidUsernameAndPassword(ConfigUtils.getInstance().getValidUsername(), ConfigUtils.getInstance().getValidPassword())
                .sortByHighestPrice()
                .clickOnAddToCartButton()
                .isShoppingCartBadgeNumberDisplayed();
        Assert.assertTrue(isBadgeNumberDisplayed);
    }


}
