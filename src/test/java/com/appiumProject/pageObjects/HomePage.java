package com.appiumProject.pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class HomePage {

    AppiumDriver<MobileElement> driver;

    public HomePage (AppiumDriver driver) {
        this.driver = driver;
    }



    public SearchResultsPage clickOnSearchBtn(){
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Clearbridge Mobile");
        return new SearchResultsPage(driver);
    }
}
