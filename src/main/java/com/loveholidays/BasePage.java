package com.loveholidays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Jay Vaghani on 17/06/2017.
 */
public class BasePage
{
    public static WebDriver driver;

    public BasePage(){
        PageFactory.initElements(driver,this);
    }
}
