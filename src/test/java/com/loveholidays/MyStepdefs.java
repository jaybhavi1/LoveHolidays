package com.loveholidays;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Created by Jay Vaghani on 17/06/2017.
 */
public class MyStepdefs extends Utils {

    HomePage homePage = new HomePage();
    ManageMyBooking manageMyBooking = new ManageMyBooking();

    @Given("^that a user goes to MMB page$")
    public void thatAUserGoesToMMBPage() {
        homePage.clickOnManageMyBookingTab();
        assertTrue(manageMyBooking._welcomeToMMB,"MMB");
    }

    @When("^the user enters a reference number like 1702LCCCQV9H$")
    public void theUserEntersAReferenceNumberLikeLCCCQVH() {
        manageMyBooking.sendTextOnReferanceField("1702LCCCQV9H");
        manageMyBooking.clickOnSignInButton();

    }

    @Then("^the message should contain this text 'Your booking reference number starts with LVE or LOV and can be found on your booking summary'$")
    public void theMessageShouldContainThisTextYourBookingReferenceNumberStartsWithLVEOrLOVAndCanBeFoundOnYourBookingSummary()  {
        assertContainsWithAttribute(manageMyBooking._errorMessage_1,"oninValid","'Your booking reference starts with LVE or LOV and can be found on your booking summary. If you haven’t received your booking summary yet, you’ll be unable to login to Manage My Booking.'","Message not display");

    }

    @Given("^that the user goes to MMB page$")
    public void thatTheUserGoesToMMBPage()  {

    }

    @When("^the user enters a reference number like LVE1702LCCCQV9H$")
    public void theUserEntersAReferenceNumberLikeLVELCCCQVH()  {
        manageMyBooking.sendTextOnReferanceField(" LVE1702LCCCQV9H ");

    }

    @And("^the user enters “Test” in the surname$")
    public void theUserEntersTestInTheSurname()  {
        manageMyBooking.sendTextOnPassengerSurnameField("Test");
        manageMyBooking.clickOnSignInButton();
    }

    @Then("^we show the error message that contains “Sorry this is not a valid booking reference,If you have booked within the last 24 hours please wait until you receive your LOV or LVE reference number by email before logging in\"$")
    public void weShowTheErrorMessageThatContainsSorryThisIsNotAValidBookingReferenceIfYouHaveBookedWithinTheLastHoursPleaseWaitUntilYouReceiveYourLOVOrLVEReferenceNumberByEmailBeforeLoggingIn()  {
        assertContainsWithGetText(manageMyBooking._errorMessage_2,"Sorry this is not a valid booking reference. If you have booked within the last 24 hours please wait until you receive your LOV or LVE reference number by email before logging in.","Message Not Contains ErrorMessage");

    }
}

