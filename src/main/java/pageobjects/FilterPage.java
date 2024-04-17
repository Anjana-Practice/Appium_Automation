package pageobjects;

import config.Constants;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;


import org.testng.Assert;
import utils.Actions;

import java.util.HashMap;

import static org.testng.Assert.*;

public class FilterPage extends BasePage {

    private final HashMap<String, By> filterIcon = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Search...\"]//following-sibling::android.widget.ImageView"));
        // (//android.widget.ImageView[@content-desc="Search..."]//following-sibling::android.widget.ImageView)[2]
        //((//android.view.View[contains(@content-desc,'Map')])[2]//preceding::android.widget.ImageView)[4]
        //(//*[@index])[20]
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> availableToggle = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Available']/android.widget.Switch"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> savedStationToggle = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Saved stations']/android.widget.Switch"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> ccsBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='CCS']"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> teslaBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='Tesla']"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> chademoBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='CHAdeMO']"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> desiredPlug = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Plug type\n" +
                "Add your vehicle to set the desired plug \"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> firstSpeed = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='up to 150 kW']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> secondSpeed = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='up to 350 kW']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> applyBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc='Apply']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> clearAll = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc='Clear all']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> closeBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Filters']//following-sibling::android.widget.Button[1]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> noStationMessage = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'No charging stations')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> filterIconAfterLogin = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]"));
        put("iOS", AppiumBy.xpath(""));
        ////android.widget.ImageView[@content-desc='How to charge with Presto? Learn more']//following-sibling::*[1]
        // /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[3]
        //(//*[@index])[20]
    }};
    private final HashMap<String, By> filterIconBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"android:id/content\"]/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]"));
        ///hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]
        put("iOS", AppiumBy.xpath(""));
    }};


    public FilterPage(AppiumDriver driver) {
        super(driver);
    }

    public FilterPage clickFilterIcon() {
        Actions.clickElement(filterIconBtn, 30, 1000);
        return this;
    }

    public FilterPage clickFilterIconAfterLogin() {
        Actions.clickElement(filterIconAfterLogin, 30, 1000);
        return this;
    }

    public FilterPage clickAvailableToggle() {
        Actions.clickElement(availableToggle, 30, 1000);
        return this;
    }

    public FilterPage clickSavedStationToggle() {
        Actions.clickElement(savedStationToggle, 30, 1000);
        return this;
    }

    public FilterPage isSavedStationToggleCleared(String input) {
        String isSavedStationToggleClearedCheck = Actions.getAttributeValue(savedStationToggle, 30, 1000, "checked");
        assertEquals(isSavedStationToggleClearedCheck, input);
        return this;
    }

    public FilterPage isApplyDisplayed() {
        boolean isApplyBtnDisplayed = Actions.isDisplayedCheck(applyBtn, 30, 1000);
        assertTrue(isApplyBtnDisplayed);
        return this;
    }

    public FilterPage isAvailableToggleCleared(String input) {
        String isAvailableClearedCheck = Actions.getAttributeValue(availableToggle, 30, 1000, "checked");
        assertEquals(isAvailableClearedCheck, input);
        return this;
    }

    public FilterPage isClearAllDisplayed() {
        boolean isClearAllDisplayed = Actions.isDisplayedCheck(clearAll, 30, 1000);
        assertTrue(isClearAllDisplayed);
        return this;
    }

    public FilterPage clickClearAll() {
        Actions.clickElement(clearAll, 30, 1000);
        return this;
    }

    public FilterPage clickApplyBtn() {
        Actions.clickElement(applyBtn, 30, 1000);
        return this;
    }

    public FilterPage getNoStationMessage() {
        String noStationMessageDisplayed = Actions.getAttributeValue(noStationMessage, 30, 1000, "content-desc");
        Assert.assertEquals(noStationMessageDisplayed, Constants.NO_STATION_MATCH_FILTER_MESSAGE);
        return this;
    }
    public FilterPage verifyNoAddVehicleBtn() {
        boolean isTextDisplayed = Actions.isDisplayedCheck(desiredPlug, 30, 1000);
        Assert.assertFalse( isTextDisplayed);
        return this;
    }

}
