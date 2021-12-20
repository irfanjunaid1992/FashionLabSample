package com.fashlab.pageObjects;

import com.fashlab.utilities.initializeDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPageObjects extends initializeDriver {

    private String loginEmailCssLocator = "#edit-mail";
    private String loginPasswordCssLocator = "#edit-pass";
    private String signInButtonCssLocator = "#edit-submit";

    private String headerCssLocator = "#middle_part h2";


    @Step("Verify Login Landing page")
    public void verifyLoginLandingPage() {
        String expectedHeader = "Sign In";

        String actualHeader = driver.findElement(By.cssSelector(headerCssLocator)).getText();

        Assert.assertEquals(expectedHeader, actualHeader);
    }

    @Step("Login with user name : (0) and password : (1)")
    public void validateLogin(String userName, String passWord) {
        driver.findElement(By.cssSelector(loginEmailCssLocator)).sendKeys(userName);
        driver.findElement(By.cssSelector(loginPasswordCssLocator)).sendKeys(passWord);
        driver.findElement(By.cssSelector(signInButtonCssLocator)).click();
    }

}
