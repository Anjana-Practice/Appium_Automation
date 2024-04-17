package pageobjects;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import utils.Actions;

import java.util.HashMap;
import org.testng.Assert;
public class MapScreen extends BasePage {

    private final HashMap<String, By> lnkLogin = new HashMap<String,By>(){{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='Want to charge with Presto? Log in']"));
        put("iOS", AppiumBy.xpath(""));
    }};


    private final HashMap<String, By> btnPermissionOnlyThisTime = new HashMap<String, By>(){{
        put("Android", AppiumBy.id("com.android.permissioncontroller:id/permission_allow_one_time_button"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> clickOutsideModal = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Scrim\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> btnNotAllow = new HashMap<String, By>(){{
        put("Android", AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> verifyMapLocNotAllowCase = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Google Map\"]/android.view.View[5]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> btnCurrentLocation = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[3]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    //Verify location share modal
    private final HashMap<String, By> verifyLocShareModal = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Enable location sharing\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    //Open settings when location is off

    private final HashMap<String, By> verifyOpenSettingsModal = new HashMap<String, By>(){{
        put("Android", AppiumBy.className("android.widget.Button"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> verifySettingsScreen = new HashMap<String, By>(){{
        put("Android", AppiumBy.id("com.android.settings:id/switch_text"));
        put("iOS", AppiumBy.xpath(""));
    }};

    //Internet is off case

    private final HashMap<String, By> noInternet = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Retry\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    // Verify station marker and selected station

    private final HashMap<String, By> clickStationMarker = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Google Map\"]/android.view.View[6]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> verifyStation = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"EVgo\n" +
                "LA Kretz Tech Center\n" +
                "1/2 available\n" +
                "  fast\n" +
                "0.70\n" +
                "/kWh\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    // Verify station tile

    private final HashMap<String, By> verifyStationTile = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'ChargePoint')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    //Check available charger

    private final HashMap<String, By> checkAllAvailablecharger = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'1/1 available')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> checkAllChargerStationDetails = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'1/1')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> recommendedPill = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Recommended\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> prestoAcceptedPill = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath(
                "//android.view.View[@content-desc=\"Presto accepted\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> navigationIcon = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath(
                "//android.widget.ImageView[@content-desc=\"4 min\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
  // Hamon center charging station and click on navigation
  private final HashMap<String, By> clickNavigation = new HashMap<String, By>(){{
      put("Android", AppiumBy.xpath(
              "//android.widget.ImageView[@content-desc=\"1 min\"]"));
      put("iOS", AppiumBy.xpath(""));
  }};

    private final HashMap<String, By> locateGoogleMap = new HashMap<String, By>(){{
        put("Android", AppiumBy.id(
                "com.google.android.apps.maps:id/home_bottom_sheet_container"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> noAvialableStationMarker = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Google Map\"]/android.view.View[2]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> verifyAllInUseStation = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'all in use')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> prestoAcceptedText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Presto accepted\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};



    public MapScreen(AppiumDriver driver) {
        super(driver);
    }

    public MapScreen clickLoginMap(){
        Actions.clickElement(lnkLogin, 30, 1000);
        return this;
    }


    public MapScreen clickOnlyThisTime(){
        Actions.clickElement(btnPermissionOnlyThisTime, 30, 2000);
        return this;
    }

    public MapScreen clickOutside(){
        Actions.clickElement(clickOutsideModal, 50, 2000);
        return this;
    }

    public MapScreen clickNotAllow(){
        Actions.clickElement(btnNotAllow, 50, 2000);
        return this;
    }

    // verify location for Don't allow case
    public MapScreen verifyLoc(){
        boolean isLosAngels=!verifyMapLocNotAllowCase.isEmpty();
        Assert.assertTrue(isLosAngels);
        return this;
    }
    public MapScreen clickCurrentLocation(){
        Actions.clickElement(btnCurrentLocation, 60, 3000);
        return this;
    }
    public MapScreen verifyLocShareModal(){
        boolean isModal=!verifyLocShareModal.isEmpty();
        Assert.assertTrue(isModal);
        return this;
    }

    public MapScreen clickOpenSettings(){
        Actions.clickElement(verifyOpenSettingsModal, 60, 3000);
        return this;
    }

    public MapScreen verifySettingScreen(){
        boolean isSettings=!verifySettingsScreen.isEmpty();
        Assert.assertTrue(isSettings);
        return this;
    }

    public MapScreen verifyNoInternet(){
        boolean isSettings=!noInternet.isEmpty();
        Assert.assertTrue(isSettings);
        return this;
    }
    public MapScreen verifyStationMarker(){
        Actions.clickElement(clickStationMarker, 60, 3000);
        return this;
    }
    public MapScreen verifySelectStation(){
        boolean isStation=!verifyStation.isEmpty();
        Assert.assertTrue(isStation);
        return this;
    }
    public MapScreen verifyStation(){
        boolean isStationTile=!verifyStationTile.isEmpty();
        Assert.assertTrue(isStationTile);
        return this;
    }
    public MapScreen verifyRecommended(){
        boolean isRecommended=!recommendedPill.isEmpty();
        Assert.assertTrue(isRecommended);
        return this;
    }
    public MapScreen verifyPrestoAccepted(){
        boolean isPrestoAccepted=!prestoAcceptedPill.isEmpty();
        Assert.assertTrue(isPrestoAccepted);
        return this;
    }

    public MapScreen verifyNavigation(){
        boolean isNavigation=!navigationIcon.isEmpty();
        Assert.assertTrue(isNavigation);
        return this;
    }
    public MapScreen enterIntoStationDetails(){
        Actions.clickElement(verifyStationTile, 60, 4000);
        return this;
    }
    public MapScreen clickOnPrestoAccepted() {
        Actions.clickElement(prestoAcceptedText, 30, 1000);
        return this;
    }

    public MapScreen clickHamonChargerNavigation(){
        Actions.clickElement(clickNavigation, 60, 4000);
        return this;
    }
    public MapScreen locateGoogleMap(){
        boolean isGoogleMap=!locateGoogleMap.isEmpty();
        Assert.assertTrue(isGoogleMap);
        return this;
    }
    public MapScreen checkAllAvailable(){
        Actions.clickElement(checkAllAvailablecharger, 60, 4000);
        return this;
    }
    public MapScreen stationAllCharger(){
        boolean isAllCharger=!checkAllChargerStationDetails.isEmpty();
        Assert.assertTrue(isAllCharger);
        return this;
    }
    public MapScreen clickNoAvailableChargerMarker(){
        Actions.clickElement(noAvialableStationMarker, 60, 4000);
        return this;
    }

    public MapScreen checkAllInUseStation(){
        boolean isAllInUse=!verifyAllInUseStation.isEmpty();
        Assert.assertTrue(isAllInUse);
        return this;
    }

}