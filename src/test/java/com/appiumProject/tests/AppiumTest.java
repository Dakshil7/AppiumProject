package com.appiumProject.tests;

import com.appiumProject.pageObjects.HomePage;
import com.appiumProject.pageObjects.LoginPage;
import com.appiumProject.pageObjects.SearchResultsPage;
import com.appiumProject.reusables.BaseAssertions;
import com.appiumProject.reusables.BaseTest;
import org.testng.annotations.Test;

public class AppiumTest extends BaseTest {

    @Test
    public void positiveFlowTest() throws Exception {
        LoginPage lp = new LoginPage(driver);

        HomePage hp =lp.launchURL();

        SearchResultsPage srp = hp.clickOnSearchBtn();
        srp.clickOnTools();
        boolean result =srp.checkToolsText();
        BaseAssertions.shouldBeTrue(result);
    }
}
