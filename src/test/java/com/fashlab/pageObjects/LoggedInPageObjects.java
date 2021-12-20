package com.fashlab.pageObjects;

import com.fashlab.utilities.initializeDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoggedInPageObjects extends initializeDriver {

    private String searchBarCssLocator = "#edit-search-api-fulltext";

    @Step("Verify Login is successfull")
    public void verifyLoggedInPage() {
        if(driver.findElement(By.cssSelector(searchBarCssLocator))!=null) {
            Assert.assertEquals(true, true, "Successfully Logged in");
        } else
            Assert.assertEquals(true, false, "Login failure");

    }

}
