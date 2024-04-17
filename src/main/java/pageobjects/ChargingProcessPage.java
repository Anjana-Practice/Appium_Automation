package pageobjects;

import config.Constants;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Actions;

import javax.swing.*;
import java.util.HashMap;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ChargingProcessPage extends BasePage {

    private final HashMap<String, By> slab = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'kWh')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> ccsCharger = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'CCS')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargerId = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,' AM AUTO CHAR')]"));
        //android.view.View[contains(@content-desc,'ChargeP')]
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectCharger = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Charger ID:\n" +
                "1 - AM AUTO CHAR\n" +
                "select\"]"));
        //android.view.View[contains(@content-desc,'ChargeP')]
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectDeniedCharger = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Charger ID:\n" +
                "OCPP77331-1\n" +
                "select\"]"));
        //android.view.View[contains(@content-desc,'ChargeP')]
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargerswipe = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> connectingToCharger = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Connecting to charger...']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> makeSureText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Make sure you are plugged into the selected charger to successfully charge. ']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> connectedToText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Connected to\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> message1 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Just a moment while we start your charge and receive your session data from the charger.']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> message2 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contain(@content-desc,'Make sure you are plugged into the selected charger to successfully charge.')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargingInProgressText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Charging in progress\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> closeBtnFromInprogressPage = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Charging in progress\"]//following-sibling::android.widget.Button"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargingPillsInprogressBar = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Charging')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargingPillsCompletedBar = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Charging completed\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};


    private final HashMap<String, By> chargingDetails = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contain(@content-desc,'00:49 mi')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargingCompletedHeading = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Charging finished\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargingCompletedText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Disconnect your EV. Charging is completed\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> gotItBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc='Got it']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> reviewMsg = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='How was your charging experience?']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> close = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> chargingCompletedTextInSummary = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Charging completed']"));
        put("iOS", AppiumBy.xpath(""));
    }};
//Charging denied

    private final HashMap<String, By> chargingDeniedText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Charging denied\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargingDeniedMessage = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"The chargers at this location seem to be unavailable. Please find another location on the Presto app.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    //android.widget.Button[@content-desc="Find new location"]
    private final HashMap<String, By> findNewLocationBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Find new location\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> contactSupportBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Contact support\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> deniedMsgClose = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[12]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> addPaymentMethodBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Add payment method\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> noBalanceError = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"The payment hasn't been processed. Please update your card in settings and try again.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargingTimedOutText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Charging request timed out\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> failedTimeOutMessage = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Unable to communicate with charger. Please check that the Charger ID on Presto matches the ID on the station. To retry - unplug, wait for the station to show as available in Presto, plug back in and swipe to start in Presto\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> tryAgainBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Try again\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> choosePlanBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Choose Plan\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> clickLoginBtn= new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Log in or sign up\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> swipeChargeText= new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Swipe to charge\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> continueBtn= new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Continue\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chaDemoCharger = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'CHAdeMO')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> peakPriceOnEffect = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Peak pricing in effect\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> peakPriceContinueBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Continue\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    public ChargingProcessPage(AppiumDriver driver) {
        super(driver);
    }

    public ChargingProcessPage clickOnCCSCharger() {
        Actions.scrollElement("2 - AM AUTO CHAR");
        Actions.clickElement(selectCharger, 30, 1000);
        Actions.clickElement(ccsCharger, 30, 1000);
        return this;
    }
    public ChargingProcessPage clickOnDeniedCharger() {
        Actions.clickElement(selectDeniedCharger, 30, 1000);
        Actions.clickElement(ccsCharger, 30, 1000);
        return this;
    }
    public ChargingProcessPage clickOnChaDemoCharger() {
        Actions.clickElement(ccsCharger, 30, 1000);
        return this;
    }

    public ChargingProcessPage isChargerIdDisplayed() {
        boolean isChargerIdDisplayed = Actions.isDisplayedCheck(chargerId, 60, 500);
        assertTrue(isChargerIdDisplayed);
        return this;
    }

    public ChargingProcessPage startChargeSwipe() {
        Actions.swipeFromOneCoordinateToOther(chargerswipe, 60, 500);
        return this;
    }
    public ChargingProcessPage isPeakPriceOnEffect(){
        boolean peakPrice = Actions.isDisplayedCheck(peakPriceOnEffect,30,1000);
        if (peakPrice) {
            Actions.clickElement(peakPriceContinueBtn, 30, 1000);
            return this;
        }
        return this;
    }

    public ChargingProcessPage clickOnContinue() {
        Actions.clickElement(continueBtn, 60, 100);
        return this;
    }

    public ChargingProcessPage isConnectingToChargerTextDisplayed() {
        boolean isConnectingToChargerTextDisplayedCheck = Actions.isDisplayedCheck(connectingToCharger, 60, 100);
        assertTrue(isConnectingToChargerTextDisplayedCheck);
        return this;
    }

    public ChargingProcessPage connectingToChargerTextVerification() {
        String connectingToChargerTextVerificationCheck = Actions.getAttributeValue(connectingToCharger, 60, 100, "content-desc");
        assertEquals(connectingToChargerTextVerificationCheck, Constants.CONNECTING_CHARGER_TEXT);
        return this;
    }

    public ChargingProcessPage isMakeSureTextDisplayed() {
        boolean makeSureTextDisplayedCheck = Actions.isDisplayedCheck(makeSureText, 60, 100);
        assertTrue(makeSureTextDisplayedCheck);
        return this;
    }

    public ChargingProcessPage makeSureTextVerification() {
        String makeSureTextVerificationCheck = Actions.getAttributeValue(makeSureText, 60, 100, "content-desc");
        assertEquals(makeSureTextVerificationCheck, Constants.MAKESURE_TEXT);
        return this;
    }

    public ChargingProcessPage connectedToTextVerification() {
        String connectedToTextVerification = Actions.getAttributeValue(connectedToText, 60, 100, "content-desc");
        assertEquals(connectedToTextVerification, Constants.CONNECTED_TO_TEXT);
        return this;
    }

    public ChargingProcessPage connectedToMessage1() {
        String connectedToMessage1 = Actions.getAttributeValue(message1, 60, 100, "content-desc");
        assertEquals(connectedToMessage1, Constants.CONNECTED_TO_MESSAGE1);
        return this;
    }

    public ChargingProcessPage connectedToMessage2() {
        String connectedToMessage2 = Actions.getAttributeValue(makeSureText, 60, 100, "content-desc");
        assertEquals(connectedToMessage2, Constants.MAKESURE_TEXT);
        return this;
    }

    public ChargingProcessPage chargingInprogressTextVerification() {
        String chargingInprogressTextVerification = Actions.getAttributeValue(chargingInProgressText, 60, 100, "content-desc");
        assertEquals(chargingInprogressTextVerification, Constants.CHARGING_INPROGRESS_TEXT);
        return this;
    }

    public ChargingProcessPage chargingInprogressTextVerificationForClosePage() {
        String chargingInprogressTextVerification = Actions.getAttributeValue(chargingInProgressText, 60, 10, "content-desc");
        assertEquals(chargingInprogressTextVerification, Constants.CHARGING_INPROGRESS_TEXT);
        return this;
    }

    public ChargingProcessPage clickOnCloseButtonFromInprogressScreen() {
        Actions.clickElement(closeBtnFromInprogressPage, 60, 100);
        return this;
    }

    public ChargingProcessPage isDetailsDisplayed() {
        boolean isDetailsDisplayed = Actions.isDisplayedCheck(chargingDetails, 60, 100);
        assertTrue(isDetailsDisplayed);
        return this;
    }

    public ChargingProcessPage completedMessage1() {
        Actions.isDisplayedCheck(chargingCompletedHeading,30,1000);
        String completedMessage1 = Actions.getAttributeValue(chargingCompletedText, 60, 100, "content-desc");
        assertEquals(completedMessage1, Constants.CHARGING_COMPLETED_TEXT);
        return this;
    }

    public ChargingProcessPage isGotItDisplayed() {
        boolean isGotItDisplayed = Actions.isDisplayedCheck(gotItBtn, 60, 500);
        assertTrue(isGotItDisplayed);
        return this;
    }

    public ChargingProcessPage clickGotItBtn() {
        Actions.clickElement(gotItBtn, 60, 500);
        return this;
    }

    public ChargingProcessPage reviewMessageValidation() {
        boolean isreviewMessageDisplayed = Actions.isDisplayedCheck(reviewMsg, 30, 1000);
        assertTrue(isreviewMessageDisplayed);
        String reviewMessage = Actions.getAttributeValue(reviewMsg, 30, 1000, "content-desc");
        assertEquals(reviewMessage, Constants.REVIEW_MESSAGE_TEXT);
        return this;
    }

    public ChargingProcessPage clickCloseFromReview() {
        Actions.clickElement(close, 30, 1000);
        return this;
    }

    /* public ChargingProcessPage isChargingCompletedTextInSummaryDisplayed() {
         boolean isChargingCompletedTextInSummaryDisplayed = Actions.isDisplayedCheck(chargingCompletedTextInSummary, 30, 1000);
         assertTrue(isChargingCompletedTextInSummaryDisplayed);
         return this;
     }*/
    public ChargingProcessPage deniedMessageScreenValidation() {
        boolean isDeniedScreenTextDisplayed = Actions.isDisplayedCheck(chargingDeniedText, 30, 1000);
        if(isDeniedScreenTextDisplayed==true){
            boolean isDeniedScreenMessageDisplayed = Actions.isDisplayedCheck(chargingDeniedMessage, 30, 1000);
            assertTrue(isDeniedScreenMessageDisplayed);
            String DeniedScreenTextActual = Actions.getAttributeValue(chargingDeniedText, 30, 1000, "content-desc");
            Assert.assertEquals(DeniedScreenTextActual, Constants.DENIED_TEXT);
            Assert.assertEquals(Actions.getAttributeValue(chargingDeniedMessage, 30, 1000, "content-desc"), Constants.DENIED_MESSAGE);
            assertTrue(Actions.isDisplayedCheck(findNewLocationBtn, 30, 1000));
            Assert.assertEquals(Actions.getAttributeValue(findNewLocationBtn, 30, 1000, "content-desc"), Constants.FIND_NEW_LOCATION_BTN);
            assertTrue(Actions.isDisplayedCheck(contactSupportBtn, 30, 1000));
            Assert.assertEquals(Actions.getAttributeValue(contactSupportBtn, 30, 1000, "content-desc"), Constants.CONTACT_SUPPORT_BTN);
            Actions.clickElement(findNewLocationBtn, 30, 1000);
        }
        else {
            boolean isTimedOutTextDisplayed = Actions.isDisplayedCheck(chargingTimedOutText, 30, 1000);
            assertTrue(isTimedOutTextDisplayed);
            String TimedOutScreenTextActual = Actions.getAttributeValue(chargingTimedOutText, 30, 1000, "content-desc");
            Assert.assertEquals(TimedOutScreenTextActual, Constants.TIME_OUT_TEXT);
            Assert.assertEquals(Actions.getAttributeValue(failedTimeOutMessage, 30, 1000, "content-desc"), Constants.FAILED_TIMED_OUT_MESSAGE);
            assertTrue(Actions.isDisplayedCheck(tryAgainBtn, 30, 1000));
            Assert.assertEquals(Actions.getAttributeValue(tryAgainBtn, 30, 1000, "content-desc"), Constants.TRY_AGAIN_BTN);
            assertTrue(Actions.isDisplayedCheck(contactSupportBtn, 30, 1000));
            Assert.assertEquals(Actions.getAttributeValue(contactSupportBtn, 30, 1000, "content-desc"), Constants.CONTACT_SUPPORT_BTN);
            Actions.clickElement(tryAgainBtn, 30, 1000);
        }

        return this;
    }

//    public ChargingProcessPage clickOnFindNewLocation() {
//        Actions.clickElement(findNewLocationBtn, 30, 1000);
//        return this;
//    }

    public ChargingProcessPage isChargingCompletedTextInSummaryDisplayed() {
        boolean isChargingCompletedTextInSummaryDisplayed = Actions.isDisplayedCheck(chargingCompletedTextInSummary, 240, 500);
        assertTrue(isChargingCompletedTextInSummaryDisplayed);
        return this;
    }

    public ChargingProcessPage isChargingPillsInprogressBarDisplayed() {
        boolean isChargingInprogressIconDisplayed = Actions.isDisplayedCheck(chargingPillsInprogressBar, 30, 1000);
        assertTrue(isChargingInprogressIconDisplayed);
        return this;
    }

    public ChargingProcessPage clickOnChargingPillsInprogressBar() {
        Actions.clickElement(chargingPillsInprogressBar, 30, 1000);
        return this;
    }

    public ChargingProcessPage isChargingPillsCompletedBarValidation() {
        boolean isChargingCompletedIconDisplayed = Actions.isDisplayedCheck(chargingPillsCompletedBar, 30, 1000);
        assertTrue(isChargingCompletedIconDisplayed);
        return this;
    }

    public ChargingProcessPage clickOnChargingPillsCompletedBar() {
        Actions.clickElement(chargingPillsCompletedBar, 30, 1000);
        return this;
    }

    //Charging process when no plan
    public ChargingProcessPage isAddPaymentMethodAvailable() {
        Actions.isDisplayedCheck(addPaymentMethodBtn, 30, 1000);
        return this;
    }

    public ChargingProcessPage textValidationInButton() {
        String actualTextInAddPayment = Actions.getAttributeValue(addPaymentMethodBtn, 30, 1000, "content-desc");
        Assert.assertEquals(actualTextInAddPayment, "Add payment method");
        return this;
    }

    public ChargingProcessPage clickOnAddPaymentMethod() {
        Actions.clickElement(addPaymentMethodBtn, 30, 1000);

        return this;
    }
    public ChargingProcessPage getNoBalanceError() {
        String actualErrorInCharging = Actions.getAttributeValue(noBalanceError, 30, 1000, "content-desc");
        Assert.assertEquals(actualErrorInCharging, Constants.NO_BALANCE_CARD_ERROR);
        return this;
    }
    public ChargingProcessPage clickOnNoBalanceErrorValidation() {
        Actions.clickElement(noBalanceError, 30, 1000);
        return this;
    }
    public ChargingProcessPage clickChoosePlan() {
        Actions.isDisplayedCheck(choosePlanBtn, 30, 1000);
        Actions.clickElement(choosePlanBtn, 30, 1000);
        return this;
    }
    public ChargingProcessPage clickLoginOrSignupBtn() {
        Actions.clickElement(clickLoginBtn,30,1000);
        return this;
    }
    public ChargingProcessPage swipeBtn() {
        Actions.isDisplayedCheck(swipeChargeText,30,1000);
        return this;
    }
}
