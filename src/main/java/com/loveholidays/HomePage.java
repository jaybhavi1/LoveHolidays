package com.loveholidays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay Vaghani on 17/06/2017.
 */
public class HomePage extends Utils
{
    @FindBy(css = "div.masthead-badge.cogs > a > div.masthead-label")
    WebElement _manageMyBooking;

    public void clickOnManageMyBookingTab(){
        clickOnElement(_manageMyBooking);
    }

}
