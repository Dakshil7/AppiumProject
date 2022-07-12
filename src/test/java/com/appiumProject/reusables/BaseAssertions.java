package com.appiumProject.reusables;

import org.testng.Assert;

public class BaseAssertions {

    public static void shouldBeEqual(String str1, String str2) {
        Assert.assertEquals(str1, str2, "Mismatch of values in Value1[" + str1 + "] and Value2 [" + str2 + "]");
    }

    public static void shouldNotBeEqual(String str1, String str2) {
        Assert.assertNotEquals(str1, str2, "Mismatch of values in Value1[" + str1 + "] and Value2 [" + str2 + "]");
    }

    public static void shouldBeTrue(boolean condition) {
        Assert.assertTrue(condition, "Condition not true");

    }
}
