package pageobjects;

import config.Constants;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.Actions;

import java.util.HashMap;
import org.testng.Assert;
import utils.Log;

import static org.testng.Assert.assertTrue;

public class StationDetailsPage extends BasePage {
    // Station details screen
    private final HashMap<String, By> networkName = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"ChargePoint\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> navigateIconAndText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Navigate')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> stationName = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'James Ortiz')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> stationAddress = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'716 Washington')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> stationOpenOrClosed = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Open')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> loginOrSignUp = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Log in or sign up\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> verifyLogin = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Enter your phone number\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> bookmark = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> unMarkBookmark = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> btnSelect = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Select\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> selectCharger = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> learnMoreAboutPlugsText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Learn more about plugs\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> seePriceDetailsText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"See details\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> closeModal = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Dismiss\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> selectYourVehicleBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Add your vehicle to see compatible plugs\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> loginBackBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Back\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> locationAddress = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"716 Washington Avenue, Los Angeles, CA, 90071\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> bottomSelectCharger = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("\t\n" +
                "//android.view.View[@content-desc=\"Select charger\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargeWithPrestoText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("\t\n" +
                "//android.widget.ImageView[@content-desc=\"How to charge with Presto? Learn more \"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> markedStationMsg = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@index='0']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> unmarkStationMsg = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@index='0']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> recommented = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Recommended']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargerAvailable = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'available')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> ccsCharger = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'CCS')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> howToCharge = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"How to charge?\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> howToChargeText1 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Plug in your vehicle')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> howToChargeText2 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Select matching charger ID below')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> howToChargeText3 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Swipe to charge')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> vehicleToEdit = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@index=\"1\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> price = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Prices\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> prestoPlanName = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Road Trip')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> stationToMapBackBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@index='0']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> outOfOrderCharger = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'out of service')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> payAsYouGo = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Pay As You Go\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> saveOnChargingCard = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Save on charging!\n" +
                "Buy PrestoPass\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> typicalSessionCostText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Typical session cost\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> kwhEnergyText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"25 kWh session\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> reportIssue = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Report issue\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> reportIssueModalText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'What issues did you encounter?')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> reportIssueBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Report issue\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectReason = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Access Blocked\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> feedbackField = new HashMap<String, By>() {{
        put("Android", AppiumBy.className("android.widget.EditText"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> feedbackPopup = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Your feedback helps improve the EV charging experience. Thank you.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargersTab = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Chargers\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> pricesTab = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Prices\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> roadTripPlanText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Road Trip Plan')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> flexPayText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'FlexPay')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> flexPayPrestoPass = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Save up to 30%!\n" +
                "Buy PrestoPass\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> closeBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.widget.Button"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> watchTutorial = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Watch tutorial\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    public final HashMap<String, By> tutorialVideoCloseBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> vehicleSection = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Showing connectors compatible with your')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> pricesPerKWhText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"FlexPay prices per kWh\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargerReadyToUse = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'ready to use')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargerId1 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Charger ID:\n" +
                "1 - AM AUTO CHAR\n" +
                "select\"]"));
        //android.view.View[contains(@content-desc,'ChargeP')]
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargerId2 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Charger ID:\n" +
                "2 - AM AUTO CHAR\n" +
                "out of service\"]"));
        //android.view.View[contains(@content-desc,'ChargeP')]
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> showingConnectors = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Showing connectors')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> howToChargeWithPrestoText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"How to charge with Presto?\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> playBtnInVideo = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> videoScrn = new HashMap<String, By>() {{
        put("Android", AppiumBy.id("android:id/content"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> playAndPauseIcon = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView"));
        put("iOS", AppiumBy.xpath(""));
    }};

    public StationDetailsPage(AppiumDriver driver) {
        super(driver);
    }

    public StationDetailsPage VerifyStationNetworkName() {
        boolean isNetworkName = Actions.isDisplayedCheck(networkName, 30, 1000);
        assertTrue(isNetworkName, "Network name not found");

        return this;
    }

    public StationDetailsPage stationDetailNavigation() {
        boolean isNavigationIcon = Actions.isDisplayedCheck(navigateIconAndText, 30, 1000);
        assertTrue(isNavigationIcon, "Unable to locate navigation details");
        return this;
    }

    public StationDetailsPage verifyStationName() {
        boolean isStation = Actions.isDisplayedCheck(stationName, 30, 1000);
        assertTrue(isStation, "Station name not found");
        return this;
    }

    public StationDetailsPage verifyStationAddress() {
        boolean isStationAddress = Actions.isDisplayedCheck(stationAddress, 30, 1000);
        assertTrue(isStationAddress, "Station address not found");
        return this;
    }

    public StationDetailsPage verifyStationOpenOrClosed() {
        boolean isOpen = Actions.isDisplayedCheck(stationOpenOrClosed, 30, 1000);
        assertTrue(isOpen, "Open / Closed text not found");
        return this;
    }

    public StationDetailsPage clickNavigation() {
        Actions.clickElement(navigateIconAndText, 30, 2000);
        return this;
    }

    public StationDetailsPage clickLoginOrSignUpModal() {
        Actions.clickElement(loginOrSignUp, 30, 2000);
        return this;
    }

    public StationDetailsPage verifyLoginPage() {
        boolean isLogin = Actions.isDisplayedCheck(verifyLogin, 30, 1000);
        assertTrue(isLogin);
        return this;
    }

    public StationDetailsPage clickBookmark() {
        Actions.clickElement(bookmark, 30, 2000);
        return this;
    }

    public StationDetailsPage clickUnMarkBookmark() {
        Actions.clickElement(unMarkBookmark, 30, 2000);
        return this;
    }

    public StationDetailsPage clickSelectBtn() {
        Actions.clickElement(btnSelect, 30, 2000);
        return this;
    }

    public StationDetailsPage clickSelectCharger() {
        boolean isChargerAvailable = Actions.isDisplayedCheck(chargerAvailable, 30, 1000);
        assertTrue(isChargerAvailable, "Charger is not available");
        Actions.clickElement(selectCharger, 30, 2000);
        return this;

    }

    public StationDetailsPage clickLearnMorePlug() {
        Actions.clickElement(learnMoreAboutPlugsText, 30, 2000);
        return this;
    }

    public StationDetailsPage clickSeeDetails() {
        Actions.clickElement(seePriceDetailsText, 30, 2000);
        return this;
    }

    public StationDetailsPage clickCloseModal() {
        Actions.clickElement(closeModal, 30, 2000);
        return this;
    }

    public StationDetailsPage clickSelectVehicle() {
        Actions.scrollElement("Add your vehicle");
        Actions.clickElement(selectYourVehicleBtn, 30, 2000);
        return this;
    }

    public StationDetailsPage clickBackBtn() {
        Actions.clickElement(loginBackBtn, 30, 2000);
        return this;
    }

    public StationDetailsPage verifyLocationAddress() {
        boolean isLogin = Actions.isDisplayedCheck(locationAddress, 30, 1000);
        assertTrue(isLogin, "Location address not found");
        return this;
    }

    public StationDetailsPage clickBotttomSelectCharger() {
        Actions.clickElement(bottomSelectCharger, 30, 2000);
        return this;
    }

    public StationDetailsPage clickLearnMore() {
        Actions.clickElement(chargeWithPrestoText, 30, 2000);
        return this;
    }

    public StationDetailsPage verifyBookmarkSavedMsg() {
        boolean isMarkedMsg = Actions.isDisplayedCheck(markedStationMsg, 30, 1000);
        assertTrue(isMarkedMsg, "Saved station message not found");
        return this;
    }

    public StationDetailsPage verifyBookmarkUnmarkMsg() {
        boolean isUnsavedMsg = Actions.isDisplayedCheck(unmarkStationMsg, 30, 1000);
        assertTrue(isUnsavedMsg, "UnSaved station message not found");
        return this;
    }

    public StationDetailsPage clickOnRecommended() {
        Actions.clickElement(recommented, 30, 1000);
        return this;
    }

    public StationDetailsPage verifyCcsCharger() {
        boolean isCCS = Actions.isDisplayedCheck(ccsCharger, 30, 1000);
        assertTrue(isCCS, "CCS charger not found");
        return this;
    }

    public StationDetailsPage verifyHowToCharge() {
        boolean isText1 = Actions.isDisplayedCheck(howToChargeText1, 30, 1000);
        assertTrue(isText1, "How to Charge text1 is not found");
        boolean isText2 = Actions.isDisplayedCheck(howToChargeText2, 30, 1000);
        assertTrue(isText2, "How to Charge text2 is not found");
        boolean isText3 = Actions.isDisplayedCheck(howToChargeText3, 30, 1000);
        assertTrue(isText3, "How to Charge text3 is not found");
        Actions.clickElement(howToCharge, 30, 2000);
        return this;

    }

    public StationDetailsPage selectVehicleToEdit() {
        Actions.scrollElement("Showing connectors");
        Actions.clickElement(showingConnectors, 30, 1000);
        return this;
    }

    public StationDetailsPage verifyPrices() {
        Assert.assertTrue(Actions.isDisplayedCheck(prestoPlanName, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(price, 30, 1000));
        return this;
    }

    public StationDetailsPage closeStationDetailPage() {
        Actions.clickElement(stationToMapBackBtn, 30, 1000);
        return this;
    }

    public StationDetailsPage verifyNoVehicleAdded() {
        Actions.scrollElement("Add your vehicle");
        Actions.isDisplayedCheck(selectYourVehicleBtn, 30, 1000);
        return this;
    }

    public StationDetailsPage verifyChargers() {
        Actions.isDisplayedCheck(outOfOrderCharger, 30, 1000);
        Actions.isDisplayedCheck(chargerReadyToUse, 30, 1000);
        return this;
    }

    public StationDetailsPage verifyPlanCard() {

        String planName = Actions.getAttributeValue(prestoPlanName, 30, 1000, "content-desc");
        System.out.println("plan name" + planName);
        Assert.assertEquals(planName, Constants.PRESTO_PLAN_TEXT);
        return this;
    }

    public StationDetailsPage verifyPayAsYouGoDetails() {
        String payAsYouGoText = Actions.getAttributeValue(payAsYouGo, 30, 1000, "content-desc");
        Assert.assertEquals(payAsYouGoText, Constants.PAY_AS_YOU_GO);
        Assert.assertTrue(Actions.isDisplayedCheck(typicalSessionCostText, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(kwhEnergyText, 30, 1000));

        Assert.assertTrue(Actions.isDisplayedCheck(saveOnChargingCard, 30, 1000));

        return this;
    }

    public StationDetailsPage verifyNoAddVehicle() {
        boolean isTextDisplayed = Actions.isDisplayedCheck(selectYourVehicleBtn, 30, 1000);
        Assert.assertFalse(isTextDisplayed);
        return this;
    }

    public StationDetailsPage verifySelectChargerScreen() {
        boolean isSelectCharger = Actions.isDisplayedCheck(bottomSelectCharger, 30, 1000);
        assertTrue(isSelectCharger, "Select charger screen not found");
        return this;
    }

    public StationDetailsPage clickReportIssue() {
        Actions.clickElement(reportIssue, 30, 2000);
        return this;
    }

    public StationDetailsPage verifyReportIssue() {
        Assert.assertTrue(Actions.isDisplayedCheck(reportIssueModalText, 30, 1000));
//        Actions.clickElement(feedbackField, 30, 2000);
//        Actions.sendText(feedbackField, "feedback for test", 30, 10000);
        Actions.clickElement(selectReason, 30, 2000);
//        Actions.hideKeyboard();
        Actions.clickElement(reportIssueBtn, 30, 2000);
        Assert.assertTrue(Actions.isDisplayedCheck(feedbackPopup, 30, 1000));
        return this;
    }

    public StationDetailsPage verifyChargersTab() {
        Assert.assertEquals(Actions.getAttributeValue(chargersTab, 30, 1000, "content-desc"), Constants.CHARGERS_TAB);
        verifySelectChargerScreen();
        return this;
    }

    public StationDetailsPage verifyPriceTab() {
        Assert.assertEquals(Actions.getAttributeValue(pricesTab, 30, 1000, "content-desc"), Constants.PRICES_TAB);
        Actions.clickElement(pricesTab, 30, 1000);
        Assert.assertTrue(Actions.isDisplayedCheck(roadTripPlanText, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(pricesPerKWhText, 30, 1000));
        return this;
    }

    public StationDetailsPage verifyNoPlan() {
        Actions.clickElement(pricesTab, 30, 1000);
        Assert.assertTrue(Actions.isDisplayedCheck(flexPayText, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(flexPayPrestoPass, 30, 1000));
        return this;
    }

    public StationDetailsPage clickTutorialCloseBtn() {
        Actions.clickElement(chargersTab, 30, 2000);
        Actions.clickElement(closeBtn, 30, 2000);
        Actions.clickElement(watchTutorial, 30, 2000);
        Actions.clickElement(tutorialVideoCloseBtn, 30, 1000);
        return this;
    }

    public StationDetailsPage vehicleTab() {
        Actions.scrollElement("Showing connectors");
        Assert.assertTrue(Actions.isDisplayedCheck(vehicleSection, 30, 1000));
        return this;
    }

    public StationDetailsPage verifySelectCharger() {
        Actions.scrollElement("Showing connectors");
        Assert.assertTrue(Actions.isDisplayedCheck(chargerId1, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(chargerId2, 30, 1000));
        return this;
    }

    public StationDetailsPage openVideoTutorial() {
        Actions.clickElement(chargersTab, 30, 1000);
        Assert.assertTrue(Actions.isDisplayedCheck(closeBtn, 30, 1000));
        Actions.clickElement(closeBtn, 30, 1000);
        Assert.assertTrue(Actions.isDisplayedCheck(watchTutorial, 30, 1000));
        Actions.clickElement(watchTutorial, 30, 1000);
        return this;
    }
    public StationDetailsPage verifyTextInVideo() {
        Assert.assertTrue(Actions.isDisplayedCheck(howToChargeWithPrestoText, 30, 1000));
        return this;
    }
    public StationDetailsPage verifyPlayBtnInVideo() {
        Assert.assertTrue(Actions.isDisplayedCheck(playBtnInVideo, 30, 1000));
        return this;
    }
    public StationDetailsPage verifyCloseBtnInVideo() {
        Assert.assertTrue(Actions.isDisplayedCheck(tutorialVideoCloseBtn, 30, 1000));
        return this;
    }
    public StationDetailsPage clickOnVideoScrn() {
        Actions.clickElement(videoScrn, 30, 1000);
        return this;
    }
    public StationDetailsPage clickOnPlayAndPauseBtn() {
        Actions.clickElement(playAndPauseIcon, 30, 1000);
        return this;
    }
    public StationDetailsPage clickOnCloseBtnInVideo(){
        Actions.clickElement(tutorialVideoCloseBtn,30,1000);
        Assert.assertTrue(Actions.isDisplayedCheck(chargersTab,30,1000));
        return this;
    }
}