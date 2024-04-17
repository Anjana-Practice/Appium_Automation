package pageobjects;

import config.Constants;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Actions;
import utils.Log;

import java.util.HashMap;

public class MapPage extends BasePage {

    private final HashMap<String, By> howToChargeSlab = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath(" //android.widget.ImageView[@content-desc='How to charge with Presto? Learn more']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> videoMaybeLaterBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Maybe later\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> videoWatchTutorialBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Watch tutorial\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> slab = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'kWh')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> mapPageTab1 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Map')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> mapPageTab2 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Plans\n" +
                "Tab 2 of 3\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> mapPageTab3 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Account')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    //android.view.View[contains(@content-desc,'kWh')]

    private final HashMap<String, By> totalSlabs = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'kWh')]"));
        //   put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> saveLocationIcon = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ScrollView[1]//android.widget.ImageView[2]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> backToMap = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button"));
        put("iOS", AppiumBy.xpath(""));
        //(//*[@resource-id='android:id/content']//android.widget.Button[1])[1]
    }};
    private final HashMap<String, By> stationSearch = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='Search...']"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> stationName = new HashMap<String, By>() {{
        put("Android", AppiumBy.className("android.widget.EditText"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> search = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'56 St Marks Pl, New York, NY, USA')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> searchDenied = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"7-Eleven\n" +
                "7-Eleven, 901 Palomar Airport Rd, Carlsbad, CA, USA\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> searchFilter = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Calicut\n" +
                "Calicut, Kerala, India\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> pickNoStation = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.widget.ImageView[contains(@content-desc,'Thrissur')])[1]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> noStationToast = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='Presto is not yet available here']"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> searchTile = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@content-desc,'ChargePoint')][1]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> recommented = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Recommended']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> prestoAcceptedText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Presto accepted\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> recommentedChargePoint = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'ChargePoint')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectNewYork = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"New York\n" +
                "New York, NY, USA\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> howToChargeWithPrestoText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"How to charge with Presto?\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> closeBtnInVideo = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button"));
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



    public MapPage(AppiumDriver driver) {
        super(driver);
    }

    public MapPage clickOnDefaultSlab() {
        Actions.clickElement(slab, 30, 1000);
        return this;
    }

    public MapPage clickOnVideoMayBeLater() {
        if (Actions.isDisplayedCheck(videoMaybeLaterBtn, 5, 1000)) {
            Actions.clickElement(videoMaybeLaterBtn, 30, 1000);
        }
        return this;
    }
    public MapPage clickOnVideoWatchTutorial() {
        if (Actions.isDisplayedCheck(videoWatchTutorialBtn, 5, 1000)) {
            Actions.clickElement(videoWatchTutorialBtn, 30, 1000);
        }

        return this;
    }

    public MapPage clickOnSaveLocation() {
        Actions.clickElement(saveLocationIcon, 30, 1000);
        return this;
    }

    public MapPage backToMap() {
        Actions.clickElement(backToMap, 30, 1000);
        return this;
    }

    public MapPage clickOnMapPageTab1() {
        Actions.clickElement(mapPageTab1, 30, 1000);
        return this;
    }

    public MapPage clickOnMapPageTab2() {
        Actions.clickElement(mapPageTab2, 30, 1000);
        return this;
    }
    public MapPage clickOnMapPageTab3() {
        Actions.clickElement(mapPageTab3, 30, 1000);
        return this;

    }

    public MapPage isSlabDisplayedCheck() {
        boolean isDefaultTabDisplayed = Actions.isDisplayedCheck(slab, 30, 1000);
        Assert.assertTrue(isDefaultTabDisplayed);
        return this;
    }

    public MapPage slabCountVerificationAfterFilterApply() {
        int numberOfSlabs = totalSlabs.size();
        Assert.assertEquals(numberOfSlabs, 1);
        return this;
    }

    public MapPage clickOnStationSearch() {
        Actions.clickElement(stationSearch, 30, 1000);
        return this;
    }

    public MapPage clearStationName() {
        Actions.clearElement(stationName, 30, 1000);
        return this;
    }

    public MapPage enterStationName() {
        Actions.sendText(stationName, Constants.LOCATION_TO_SEARCH, 30, 1000);
        return this;
    }

    public MapPage selectStationName() {
        Actions.clickElement(search, 30, 1000);
        return this;
    }

    public MapPage isRecommendedDisplayed() {
        Assert.assertTrue(Actions.isDisplayedCheck(recommented, 30, 1000));
        return this;
    }

    public MapPage isPrestoAcceptedDisplayed() {
        Assert.assertTrue(Actions.isDisplayedCheck(prestoAcceptedText, 30, 1000));
        return this;
    }
    public MapPage clickOnRecommended() {
        Actions.clickElement(recommented, 30, 1000);
        return this;
    }
    public MapPage clickOnPrestoAccepted() {
        Actions.clickElement(prestoAcceptedText, 30, 1000);
        return this;
    }
    public MapPage clickOnRecommendedChargePoint() throws InterruptedException {
      //  boolean ischarge=Actions.isDisplayedCheck(recommentedChargePoint,60,100);
        for(int i=1;i<=10;i++)
        {
            Actions.swipeFromOneCoordinateToOtherUsingUserProvidedCord();
          //  Thread.sleep(1000);
            if(Actions.isDisplayedCheck(recommentedChargePoint,60,100))
            {
                System.out.println("element found");
                Thread.sleep(1000);
                Actions.clickElement(recommentedChargePoint,60,100);
                Thread.sleep(1000);
                Actions.clickElement(recommentedChargePoint,60,100);
                break;

            }
        }
       // Actions.swipeFromOneCoordinateToOtherUsingUserProvidedCord();
        return this;
    }

    //Search location with and without station script

    public MapPage enterLocationName_NoStation() {
        Actions.sendText(stationName, Constants.LOCATION_NO_STATION, 30, 1000);
        return this;
    }

    public MapPage selectLocationName_NoStation() {
        Actions.clickElement(pickNoStation, 30, 1000);
        return this;
    }

    public MapPage NoStationToastValidation() {
        Assert.assertTrue(Actions.isDisplayedCheck(noStationToast, 30, 1000));
        String noStationToastMessage = Actions.getAtributeValue(noStationToast, 30, 1000, "content-desc");
        Assert.assertEquals(noStationToastMessage, Constants.NO_STATION_TOAST_MESSAGE);
             return this;
         }

    public MapPage isHowToChargeSlabDisplayed() {
      Assert.assertTrue(Actions.isDisplayedCheck(howToChargeSlab, 30, 1000));
        return this;
    }
    public MapPage enterStationNameWithDeniedStation() {
        Actions.sendText(stationName,Constants.LOCATION_TO_SEARCH_DENIED, 30, 1000);
        return this;
    }
    public MapPage selectStationNameDenied() {
        Actions.clickElement(searchDenied, 30, 1000);
        return this;
    }
    public MapPage enterStationNameForFilter() {
        Actions.sendText(stationName, Constants.LOCATION_TO_SEARCH_FOR_FILTER, 30, 1000);
        return this;
    }
    public MapPage selectStationNameFilter() {
        Actions.clickElement(searchFilter, 30, 1000);
        return this;
    }
    public MapPage verifyBottomNavBar() {
        Assert.assertTrue(Actions.isDisplayedCheck(mapPageTab1, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(mapPageTab2, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(mapPageTab3, 30, 1000));

        return this;
    }
    public MapPage verifyTextInVideo(){
        Assert.assertTrue(Actions.isDisplayedCheck(howToChargeWithPrestoText, 30, 1000));
        return this;
    }
    public MapPage verifyCloseBtInVideo(){
        Log.info("Close the Welcome Tutorial Video");
        Assert.assertTrue(Actions.isDisplayedCheck(closeBtnInVideo, 30, 1000));
        Actions.clickElement(closeBtnInVideo,30,1000);
        return this;
    }
    public MapPage verifyPlayBtInVideo(){
        Assert.assertTrue(Actions.isDisplayedCheck(playBtnInVideo, 30, 1000));
        return this;
    }
    public MapPage clickOnVideoScrn() {
        Actions.clickElement(videoScrn, 30, 1000);
        return this;
    }
    public MapPage clickOnPlayAndPauseBtn() {
        Actions.clickElement(playBtnInVideo, 30, 1000);
        return this;
    }
    public MapPage clickOnPlayAndPauseBtnAfter5sec() throws InterruptedException {
        Thread.sleep(5000);
        Actions.clickElement(playBtnInVideo, 30, 1000);
        return this;
    }


    public MapPage enterLocation() {
        Actions.sendText(stationName,Constants.LOCATION, 30, 1000);
        return this;
    }
    public MapPage clickNewYork() {
        Actions.clickElement(selectNewYork, 30, 1000);
        return this;
    }

}
