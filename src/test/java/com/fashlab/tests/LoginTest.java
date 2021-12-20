package com.fashlab.tests;

import com.fashlab.pageObjects.LandingPageObjects;
import com.fashlab.pageObjects.LoggedInPageObjects;
import com.fashlab.pageObjects.LoginPageObjects;
import com.fashlab.utilities.initializeDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Epic("Test FashionLab UI Flows")
@Feature("Test the Login functionality")
public class LoginTest extends initializeDriver {

    public LandingPageObjects landingPage = new LandingPageObjects();
    public LoginPageObjects loginPage = new LoginPageObjects();
    public LoggedInPageObjects loggedInPage = new LoggedInPageObjects();

    @BeforeClass
    public void navigateToFashionLab() {
        driver.get("https://default.fashlab-staging.fashcon.com/");
        driver.manage().window().maximize();
    }

    @Test(priority = 0, description="Verify Login Functionality")
    @Description("Verify Login with valid username and password")
    public void login() {

        landingPage.verifyLandingPage();

        landingPage.navigateToSignIn();
        loginPage.verifyLoginLandingPage();
        loginPage.validateLogin("xohigeg992@macauvpn.com", "Testpass1");
        loggedInPage.verifyLoggedInPage();
    }

}
