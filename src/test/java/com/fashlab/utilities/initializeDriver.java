package com.fashlab.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class initializeDriver {

    public static WebDriver driver;

    @BeforeSuite
    public void startDriver() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/driverFile/chromedriver");
        driver = new ChromeDriver();
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
