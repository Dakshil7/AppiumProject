package com.appiumProject.pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    AppiumDriver<MobileElement> driver;

    public LoginPage(AppiumDriver driver) {
        this.driver = driver;
    }

    public HomePage launchURL() throws Exception {
        driver.get("https://www.google.ca/");
        return new HomePage(driver);
    }
}
