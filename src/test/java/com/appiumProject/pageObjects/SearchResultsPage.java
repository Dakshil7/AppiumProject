package com.appiumProject.pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class SearchResultsPage {

    AppiumDriver<MobileElement> driver;

    public SearchResultsPage (AppiumDriver driver) {
        this.driver = driver;
    }

    public boolean checkToolsText(){
        String toolText = driver.findElement(By.xpath("//input[@name='q']")).getText();
        boolean result = toolText.equalsIgnoreCase("tools");
        return result;
    }

    public SearchResultsPage clickOnTools(){
        driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
        return this;
    }
}
