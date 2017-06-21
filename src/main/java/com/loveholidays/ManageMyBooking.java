package com.loveholidays;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay Vaghani on 17/06/2017.
 */
public class ManageMyBooking extends Utils {

    @FindBy(id = "js-reference-field-with-letters")
    WebElement _bookingReferanceField;

    @FindBy(name = "surname")
    WebElement _passengerSurnameField;

    @FindBy(css = "h1.mmb-login__heading")
    public WebElement _welcomeToMMB;

    @FindBy(css = "button.mmb-login__form__submit__button")
    WebElement _btnSignIn;

    @FindBy(xpath = "//input[@id='js-reference-field-with-letters']")
    public WebElement _errorMessage_1;

    @FindBy(xpath = "//form[@id='getBooking']/label/p")
    WebElement _errorMessage_2;

    public void sendTextOnReferanceField(String referanceNo){
        sendTextOnField(_bookingReferanceField,referanceNo);
    }

    public void sendTextOnPassengerSurnameField(String surname){
        sendTextOnField(_passengerSurnameField,surname);
    }

    public void clickOnSignInButton(){
        clickOnElement(_btnSignIn);
    }

    public String errorMessageOnReferanceField(){
        String errorMessage =_errorMessage_1.getAttribute("oninValid");
        System.out.println(errorMessage);
        return errorMessage;
    }

    public boolean welcomeMyMMBPresent(){
      boolean result =  _welcomeToMMB.isDisplayed();
        System.out.println(_welcomeToMMB.getText());
      return result;
    }



}
