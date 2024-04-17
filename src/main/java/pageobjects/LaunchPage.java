package pageobjects;

import config.Constants;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import listeners.TestNGListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.Actions;
import utils.Log;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertTrue;

public class LaunchPage extends BasePage {

    private final HashMap<String, By> btnGetStarted = new HashMap<String,By>(){{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Get started\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> btnLogin = new HashMap<String,By>(){{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Log in\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};























    //////////////////////artifacts////////////////////////////////
    private final HashMap<String, By> btnContinue = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Continue\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> btnPermissionAllowed = new HashMap<String, By>(){{
        put("Android", AppiumBy.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> btnNotAllow = new HashMap<String, By>(){{
        put("Android", AppiumBy.id("com.android.permissioncontroller:id/permission_deny_button"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> allowNotification = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("(//*[contains(@text,'Allow')])[2]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> permissionMessage = new HashMap<String, By>(){{
        put("Android", AppiumBy.id("com.android.permissioncontroller:id/permission_message"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> defaultPrestoLogo = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.ImageView"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> planTab = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Plans\n" +
                "Tab 2 of 3\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> nameField = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.EditText[@index='1']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> emailField = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.EditText[@index='2']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> createAccountBtn = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Create account\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> invalidEmailError = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Enter a valid Email address\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> emptyNameError = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Enter a valid name\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> skip = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Skip\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> fleetScreen = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Fleets & plans\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> sally = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@index='2']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> voucherCodeField = new HashMap<String, By>() {{
        put("Android", AppiumBy.className("android.widget.EditText"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> applyBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Apply\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> hertzFleet = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@index='3']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> SignUpvoucherCodeField = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.EditText[@index='3']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> customPlanText = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Unlock customized plans\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectText1 = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Select your region\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectText2 = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Select your region\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectRegionBtn = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Select region\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectRegionPopUpText = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Select region\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectRegionOregon = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Oregon\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectRegionNorCal = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"NorCal\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectRegionNorCalOnPlanPage = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"NorCal\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectHertz = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'short description')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectSally = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Sally')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    public LaunchPage(AppiumDriver driver) {
        super(driver);
    }

    public LaunchPage clickGetStarted(){
        Actions.clickElement(btnGetStarted, 30, 1000);
        return this;
    }

    public LaunchPage clickLogin(){
        Actions.clickElement(btnLogin, 30, 1000);
        return this;
    }























    public LaunchPage clickContinue(){
        Actions.clickElement(btnContinue, 30, 1000);
        return this;
    }

    public LaunchPage clickAllow(){
        Actions.clickElement(btnPermissionAllowed, 30, 1000);
    //    Actions.clickElement(allowNotification,30,1000);
        boolean isPermissionDisplayed=Actions.isDisplayedCheck(permissionMessage,30,1000);
        System.out.println("isPermissionDisplayed");
        if(isPermissionDisplayed==true)
      {
          Actions.clickElement(allowNotification,30,1000);
      }
       return this;
    }
    public LaunchPage clickNotAllow(){
        Actions.clickElement(btnNotAllow, 50, 2000);
             boolean isPermissionDisplayed=Actions.isDisplayedCheck(permissionMessage,30,1000);
        System.out.println("isPermissionDisplayed");
        if(isPermissionDisplayed==true)
      {
          Actions.clickElement(allowNotification,30,1000);
      }
        return this;
    }
    public LaunchPage verifyDefaultLogo(){
        boolean isLogo = Actions.isDisplayedCheck(defaultPrestoLogo, 30, 1000);
        assertTrue(isLogo,"Logo not found");
        return this;
    }
    public LaunchPage clickPlanTab(){
        Actions.clickElement(planTab, 50, 2000);
        return this;
    }
    public LaunchPage verifyGetStarted(){
        boolean isGetStarted = Actions.isDisplayedCheck(btnGetStarted, 30, 1000);
        assertTrue(isGetStarted,"Get started not found");
        return this;
    }
    public LaunchPage clickName(){
        Actions.clickElement(nameField, 50, 2000);
        return this;
    }
    public LaunchPage clickEmail(){
        Actions.clickElement(emailField, 50, 2000);
        return this;
    }
    public LaunchPage enterName(String name){
        Actions.sendText(nameField,name,50, 2000);
        return this;
    }
    public LaunchPage enterEmail(String email){
        Actions.sendText(emailField,email,50, 2000);
        return this;
    }
    public LaunchPage clickCreateAccount(){
        Actions.clickElement(createAccountBtn, 50, 2000);
        return this;
    }
    public LaunchPage clickSkipBtn(){
        Actions.clickElement(skip, 50, 2000);
        return this;
    }
    public LaunchPage verifyFleetAndPlans(){
        Assert.assertTrue(Actions.isDisplayedCheck(fleetScreen, 30, 1000));
        Assert.assertEquals(Actions.getAttributeValue(customPlanText, 30, 1000, "content-desc"), Constants.UNLOCK_CUSTOM_PLANS_TEXT);
        Assert.assertTrue(Actions.isDisplayedCheck(selectText1, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(selectText2, 30, 1000));
        return this;
    }
    public LaunchPage clickRegion(){
        Actions.clickElement(selectRegionBtn, 50, 2000);
        return this;
    }
    public LaunchPage VerifySelectRegionPopUp(){
        Assert.assertTrue(Actions.isDisplayedCheck(selectRegionPopUpText, 30, 1000));
        Actions.clickElement(selectRegionNorCal, 50, 2000);
        return this;
    }
    public LaunchPage SelectRegionOregon(){
        Actions.clickElement(selectRegionOregon, 50, 2000);
        return this;
    }
    public LaunchPage SelectRegionNorcal(){
        Actions.clickElement(selectRegionNorCal, 50, 2000);
        return this;
    }
    public LaunchPage verifyInvalidEmailError(){
        Assert.assertTrue(Actions.isDisplayedCheck(invalidEmailError, 30, 1000));

        return this;
    }
    public LaunchPage verifyInvalidNameError(){
        Assert.assertTrue(Actions.isDisplayedCheck(emptyNameError, 30, 1000));

        return this;
    }
    public LaunchPage clickSally(){
        Actions.clickElement(sally, 50, 2000);
        return this;
    }
    public LaunchPage clickVoucherCode(){
        Actions.clickElement(voucherCodeField, 50, 2000);
        return this;
    }
    public LaunchPage enterVoucherCode(String code) {
        Actions.sendText(voucherCodeField, code, 30, 10000);
        return this;
    }
    public LaunchPage clickApplyBtn(){
        Actions.clickElement(applyBtn, 50, 2000);
        return this;
    }
    public LaunchPage selectHertzFleet(){
        Actions.clickElement(hertzFleet, 50, 2000);
        return this;
    }
    public LaunchPage selectVoucherCodeField(){
        Actions.clickElement(SignUpvoucherCodeField, 50, 2000);
        return this;
    }
    public LaunchPage typeVoucherCode(String email){
        Actions.sendText(SignUpvoucherCodeField,email,50, 2000);
        return this;
    }
    public LaunchPage selectCustomSallyFleet(){
        Actions.clickElement(selectSally, 50, 2000);
        return this;
    }
    public LaunchPage selectCustomHertzFleet(){
        Actions.clickElement(selectHertz, 50, 2000);
        return this;
    }
    public LaunchPage selectCustomRegion(){
        Log.info("Click on NorCal to open region selector");
        Actions.clickElement(selectRegionNorCalOnPlanPage, 50, 2000);
        Log.info("Click on Oregon from the region dropdown");
        Actions.clickElement(selectRegionOregon, 50, 2000);
        return this;
    }

}
