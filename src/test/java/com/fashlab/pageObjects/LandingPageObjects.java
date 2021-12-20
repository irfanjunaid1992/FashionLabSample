package com.fashlab.pageObjects;

import com.fashlab.utilities.initializeDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LandingPageObjects extends initializeDriver {

    private String headerCssLocator = "#block-porto-sub-content h2";
    private String signInLink = "SIGN IN";

    @Step("Verify Fashion Lab Landing page")
    public void verifyLandingPage() {
        String expectedHeader = "Welcome to the Fashion Constellate Research Portal";
        String actualHeader = driver.findElement(By.cssSelector(headerCssLocator)).getText();
        Assert.assertEquals(expectedHeader, actualHeader);

    }

    @Step("Naviagte to Login page")
    public void navigateToSignIn() {
        driver.findElement(By.linkText(signInLink)).click();
    }

}
