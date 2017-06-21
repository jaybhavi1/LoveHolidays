package com.loveholidays;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

/**
 * Created by Jay Vaghani on 17/06/2017.
 */
public class Utils extends BasePage
{
    //Click on Element
    public static void clickOnElement(WebElement element){
        element.click();
    }

    // Send Text on Element
    public static void sendTextOnField(WebElement element,String str){
        element.sendKeys(str);
    }

    public static void assertTrue(WebElement element,String str){
        Assert.assertTrue(element.isDisplayed(),"I not navigate to "+str+ "page");
    }

    public static void assertEquals(String actual,String expected,String message){
        Assert.assertEquals(actual,expected,message);
    }

    public static void assertContainsWithAttribute(WebElement element,String attribute,String contain,String message){
        Assert.assertTrue(element.getAttribute(attribute).contains(contain),message);
    }

    public static void assertContainsWithGetText(WebElement element,String contain,String message){
        Assert.assertTrue(element.getText().contains(contain),message);
    }





}
