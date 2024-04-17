package pageobjects;

import config.Constants;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Actions;
import utils.Log;

import javax.swing.*;
import java.util.HashMap;

import static org.testng.Assert.assertTrue;

public class AccountPage extends BasePage {

    private final HashMap<String, By> accountIcon = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Account')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectedAccountIcon = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Account\n" +
                "Tab 3 of 3\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> accountPageLoginSlab = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Want to charge')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> logoutLink = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Log out')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> settings = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='Settings']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> accountProfile = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Your account\"]//preceding-sibling::android.view.View"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> vehicle = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Vehicle\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargingHistory = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='Charging history']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> yourPasses = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='Your passes']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> faq = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='FAQ']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> contactSupport = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='Contact support']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> aboutUs = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='About us']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> privacyPolicy = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='Privacy policy']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> privacyPolicyText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.TextView[@text=\"Privacy Policy\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> termsOfService = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc='Terms of service']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> termsOfServiceText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.TextView[@text=\"Terms Of Service\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> yourAccountSection = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Your account']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> helpSection = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Help']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> about = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='About']"));
        put("iOS", AppiumBy.xpath(""));
    }};


    private final HashMap<String, By> login = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Log in or sign up\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> logout = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Log out\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> addVehicle = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Add your vehicle\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};


    private final HashMap<String, By> firstFromHistory = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.view.View[contains(@content-desc,'AM TEST STN US AM AUTO')])[1]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    //Settings - Personal info
    private final HashMap<String, By> name = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Name')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> testPhoneNumber = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Phone number')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> testEmail = new HashMap<String, By>() {
        {
            put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Email')]"));
            put("iOS", AppiumBy.xpath(""));
        }};
    private final HashMap<String, By> contactSupportPage = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> howToStartCharging = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.TextView[9]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> startChargingDetailsTile = new HashMap<String, By>() {{
        put("Android", AppiumBy.className("android.webkit.WebView"));
               put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> aboutUsPageHeadText = new HashMap<String, By>() {
        {
            put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Thanks for choosing Presto! \"]"));
            put("iOS", AppiumBy.xpath(""));
        }};
    private final HashMap<String, By> supportMail = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='support@prestocharging.com']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> websiteLink = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Website\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> backBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Back\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> vehicleText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Vehicle\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargingHistoryText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Charging history\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> yourPassesText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Your passes\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargingHistoryIcon= new HashMap<String, By>() {{
        put("Android", AppiumBy.className("android.widget.ImageView"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> noChargingHistoryText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"No charging history yet.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> prestoWebsiteText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.TextView[@text=\"Magically Simple EV Charging\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> FAQ = new HashMap<String,By>(){{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"FAQ\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> getHelp = new HashMap<String,By>(){{
        put("Android", AppiumBy.xpath("//android.widget.TextView[@text=\"Get help\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> textGeneralInHelpPage = new HashMap<String,By>(){{
        put("Android", AppiumBy.xpath("//android.widget.TextView[@text=\"General\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> textAccountInHelpPage = new HashMap<String,By>(){{
        put("Android", AppiumBy.xpath("//android.widget.TextView[@text=\"General\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> textPaymentAndPricingInHelpPage = new HashMap<String,By>(){{
        put("Android", AppiumBy.xpath("//android.widget.TextView[@text=\"General\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> textNavigationAndWayfindingInHelpPage = new HashMap<String,By>(){{
        put("Android", AppiumBy.xpath("//android.widget.TextView[@text=\"General\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> textChargingInHelpPage = new HashMap<String,By>(){{
        put("Android", AppiumBy.xpath("//android.widget.TextView[@text=\"General\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> textRecieptsAndMoreInHelpPage = new HashMap<String,By>(){{
        put("Android", AppiumBy.xpath("//android.widget.TextView[@text=\"General\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> showOption = new HashMap<String,By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Show:')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> showThisWeek = new HashMap<String,By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"This week\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> videoTutorialTab = new HashMap<String,By>(){{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Watch a 1 minute video tutorial on how to charge with Presto\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> howToChargeWithPrestoTextInVideo = new HashMap<String, By>() {{
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
    private final HashMap<String, By> playAndPauseIcon = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView"));
        put("iOS", AppiumBy.xpath(""));
    }};

    public AccountPage(AppiumDriver driver) {
        super(driver);
    }

    public AccountPage clickOnAccountIcon() {
        Actions.clickElement(accountIcon, 30, 1000);
        return this;
    }

    public AccountPage clickOnLoginSlab() {
        Actions.clickElement(accountPageLoginSlab, 30, 1000);
        return this;
    }

    public AccountPage isLoginSlabDisplayed() {
        boolean isLoginSlabDisplayedCheck = Actions.isDisplayedCheck(accountPageLoginSlab, 30, 1000);
        Assert.assertTrue(isLoginSlabDisplayedCheck, "Login bar is displayed");
        return this;
    }

    public AccountPage isYourAccountSectionDisplayed() {
        boolean isYourAccountSectionDisplayedCheck = Actions.isDisplayedCheck(yourAccountSection, 30, 1000);
        Assert.assertTrue(isYourAccountSectionDisplayedCheck, "Account section displayed");
        return this;
    }

    public AccountPage isHelpSectionDisplayed() {
        boolean isHelpSectionDisplayedCheck = Actions.isDisplayedCheck(helpSection, 30, 1000);
        Assert.assertTrue(isHelpSectionDisplayedCheck, "Help section displayed");
        return this;
    }

    public AccountPage isAboutSectionDisplayed() {
        boolean isAboutSectionDisplayedCheck = Actions.isDisplayedCheck(about, 30, 1000);
        Assert.assertTrue(isAboutSectionDisplayedCheck);
        return this;
    }

    public AccountPage isSettingsSectionDisplayed() {
        boolean isSettingsSectionDisplayedCheck = Actions.isDisplayedCheck(settings, 30, 1000);
        Assert.assertTrue(isSettingsSectionDisplayedCheck, "settings section displayed");
        return this;
    }

    public AccountPage isVehicleSectionDisplayed() {
        boolean isVehicleSectionDisplayedCheck = Actions.isDisplayedCheck(vehicle, 30, 1000);
        Assert.assertTrue(isVehicleSectionDisplayedCheck, "Vehicle section displayed");
        return this;
    }

    public AccountPage isChargingSectionDisplayed() {
        boolean isChargingSectionDisplayedCheck = Actions.isDisplayedCheck(chargingHistory, 30, 1000);
        Assert.assertTrue(isChargingSectionDisplayedCheck, "Charging section displayed");
        return this;
    }

    public AccountPage isYourPassesSectionDisplayed() {
        boolean isYourPassesSectionDisplayedCheck = Actions.isDisplayedCheck(yourPasses, 30, 1000);
        Assert.assertTrue(isYourPassesSectionDisplayedCheck, "your passess displayed");
        return this;
    }

    public AccountPage isFAQSectionDisplayed() {
        boolean isFAQSectionDisplayedCheck = Actions.isDisplayedCheck(faq, 30, 1000);
        Assert.assertTrue(isFAQSectionDisplayedCheck, "FAQ is displayed");
        return this;
    }

    public AccountPage isContactSupportSectionDisplayed() {
        boolean isContactSupportSectionDisplayedCheck = Actions.isDisplayedCheck(contactSupport, 30, 1000);
        Assert.assertTrue(isContactSupportSectionDisplayedCheck, "contact support displayed ");
        return this;
    }

    public AccountPage isaboutUsSectionDisplayed() {
        boolean isaboutUsSectionDisplayedCheck = Actions.isDisplayedCheck(aboutUs, 30, 1000);
        Assert.assertTrue(isaboutUsSectionDisplayedCheck);
        return this;
    }

    public AccountPage isprivacyPolicySectionDisplayed() {
        boolean isprivacyPolicySectionDisplayedCheck = Actions.isDisplayedCheck(privacyPolicy, 30, 1000);
        Assert.assertTrue(isprivacyPolicySectionDisplayedCheck, "privacy policy displayed");
        return this;
    }

    public AccountPage isTermsOfServicePassesSectionDisplayed() {
        boolean isTermsOfServicePassesSectionDisplayedCheck = Actions.isDisplayedCheck(termsOfService, 30, 1000);
        Assert.assertTrue(isTermsOfServicePassesSectionDisplayedCheck, "Terms of service displayed");
        return this;
    }

    public AccountPage firstSectionNameValidation() {
        String section1 = Actions.getAttributeValue(yourAccountSection, 30, 1000, "content-desc");
        Assert.assertEquals(section1, "Your account");

        return this;
    }

    public AccountPage secondSectionNameValidation() {
        String section2 = Actions.getAttributeValue(helpSection, 30, 1000, "content-desc");
        Assert.assertEquals(section2, "Help");

        return this;
    }

    public AccountPage thirdSectionNameValidation() {
        String section3 = Actions.getAttributeValue(about, 30, 1000, "content-desc");
        Assert.assertEquals(section3, "About");
        return this;
    }

    public AccountPage clickOnChargingHistory() {
        Actions.clickElement(chargingHistory, 30, 1000);
        return this;
    }

    public AccountPage clickOnShowOption() {
        Actions.clickElement(showOption, 30, 1000);
        return this;
    }
    public AccountPage clickOnShowThisWeek() {
        Actions.clickElement(showThisWeek, 30, 1000);
        return this;
    }

    public AccountPage selectFirstItemFromHistory() {

        Actions.clickElement(firstFromHistory, 30, 1000);
        return this;
    }


    public AccountPage clickSettingsTab() {
        Actions.clickElement(settings, 30, 2000);
        return this;
    }

    public AccountPage clickAccountProfileTab() {
        Actions.clickElement(accountProfile, 30, 2000);
        return this;
    }

    public AccountPage clickVehicleTab() {
        Actions.clickElement(vehicle, 30, 2000);
        return this;
    }

    public AccountPage clickLogin() {
        Actions.clickElement(login, 30, 2000);
        return this;
    }
    public AccountPage isLoginDisplayed() {
       Assert.assertTrue(Actions.isDisplayedCheck(login, 30, 2000));
        return this;
    }


    public AccountPage clickLogout() {
        Actions.clickElement(logout, 30, 2000);
        return this;
    }

    public AccountPage clickAddVehicle() {
        Actions.clickElement(addVehicle, 30, 2000);
        return this;
    }

    public AccountPage clickChargingHistory() {
        Actions.clickElement(chargingHistory, 30, 2000);
        return this;
    }

    public AccountPage clickYourPass() {
        Actions.clickElement(yourPasses, 30, 2000);
        return this;
    }
    public AccountPage isLogoutLinkDisplayed() {
        Assert.assertTrue(Actions.isDisplayedCheck(logoutLink, 30, 1000));
        return this;
    }
    //settings tab validation
    public AccountPage personalInfoValidation() {
        String userName = Actions.getAttributeValue(name, 30, 1000, "content-desc");
        String actualUserName = userName.substring(4).trim();
        Assert.assertEquals(actualUserName, Constants.NAME_CUSTOMER);
        String phoneNumber = Actions.getAttributeValue(testPhoneNumber, 30, 1000, "content-desc");
        String actualPhoneNumber = phoneNumber.substring(12).trim();
        Assert.assertEquals(actualPhoneNumber, Constants.PHONE_CUSTOMER);
        String email = Actions.getAttributeValue(testEmail, 30, 1000, "content-desc");
        String actualEmail = email.substring(5).trim();
        Assert.assertEquals(actualEmail, Constants.EMAIL_CUSTOMER);
        return this;
    }
    public AccountPage clickOnYourPassess() {
        Actions.clickElement(yourPasses, 30, 1000);
        return this;
    }
    public AccountPage clickAboutUs() {
        Actions.scrollElement("About Us");
        Actions.clickElement(aboutUs, 30, 1000);
        return this;
    }

    public AccountPage verifyAboutUsPage() {
        Assert.assertTrue(Actions.isDisplayedCheck(aboutUsPageHeadText, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(websiteLink, 30, 1000));
        String supportMailValue= Actions.getAttributeValue(supportMail,30,1000,"content-desc");
        Assert.assertEquals(supportMailValue, Constants.SUPPORT_MAIL);
        return this;
    }
    public AccountPage clickBackBtn() {
        Actions.clickElement(backBtn, 30, 1000);
        return this;
    }
    public AccountPage verifyVehicleText() {
        Assert.assertTrue(Actions.isDisplayedCheck(vehicleText, 30, 1000));
        return this;
    }
    public AccountPage verifyChargingHistoryText() {
        Assert.assertTrue(Actions.isDisplayedCheck(chargingHistoryText, 30, 1000));
        String isChargingHistory=Actions.getAttributeValue(chargingHistoryText,30,1000,"content-desc");
        Assert.assertEquals(isChargingHistory,Constants.CHARGING_HISTORY);
        String isNoChargingHistoryText=Actions.getAttributeValue(noChargingHistoryText,30,1000,"content-desc");
        Assert.assertEquals(isNoChargingHistoryText,Constants.NO_CHARGING_HISTORY);
        Assert.assertTrue(Actions.isDisplayedCheck(chargingHistoryIcon, 30, 1000));
        return this;
    }
    public AccountPage verifyYourPassesText() {
        Assert.assertTrue(Actions.isDisplayedCheck(yourPassesText, 30, 1000));
        return this;
    }

    public AccountPage clickContactSupport() {
        Actions.clickElement(contactSupport, 30, 2000);
        return this;
    }
    public AccountPage verifyContactSupprtChatScreen() {
        boolean isChatScreen = Actions.isDisplayedCheck(contactSupportPage, 30, 1000);
        Assert.assertTrue(isChatScreen, "Chat screen not found");
        return this;
    }
    public AccountPage clickHowToStartCharge() {
        Actions.clickElement(howToStartCharging, 30, 2000);
        return this;
    }
    public AccountPage clickStartChargeDetailsTile() {
        Actions.clickElement(startChargingDetailsTile, 30, 2000);
        return this;
    }
    public AccountPage verifyAddYourVehicleBtn() {
        Assert.assertTrue(Actions.isDisplayedCheck(addVehicle, 30, 1000));
        return this;
    }
    public AccountPage clickAboutUsWebsitelink() {
        Assert.assertTrue(Actions.isDisplayedCheck(websiteLink, 30, 1000));
        Actions.clickElement(websiteLink, 30, 1000);
        return this;
    }

    public AccountPage verifyAboutUsWebsitelink() {
        Assert.assertTrue(Actions.isDisplayedCheck(prestoWebsiteText, 30, 1000));
        return this;
    }
    public AccountPage verifyAccountIconSelected(){
        boolean isAccountIconSelected = Boolean.parseBoolean(Actions.getAttributeValue(selectedAccountIcon,30,1000,"selected"));
        Assert.assertTrue(isAccountIconSelected);
        return this;
    }

    public AccountPage clickPrivacyPolicy() {
        Actions.scrollElement("Privacy Policy");
        Assert.assertTrue(Actions.isDisplayedCheck(privacyPolicy, 30, 1000));
        Actions.clickElement(privacyPolicy,30,1000);
        return this;
    }

    public AccountPage verifyPrivacyPolicy() {
        Assert.assertTrue(Actions.isDisplayedCheck(privacyPolicyText, 30,1000));
        return this;
    }

    public AccountPage clickTermsOfService() {
        Actions.scrollElement("Terms of service");
        Assert.assertTrue(Actions.isDisplayedCheck(termsOfService, 30, 1000));
        Actions.clickElement(termsOfService,30,1000);
        return this;
    }

    public AccountPage verifyTermsOfService() {
        Assert.assertTrue(Actions.isDisplayedCheck(termsOfServiceText, 30,1000));
        return this;
    }
    public AccountPage verifyFAQ(){
        Actions.scrollElement("FAQ");
        Assert.assertTrue(Actions.isDisplayedCheck(FAQ,30,1000));
        Actions.clickElement(FAQ,30,1000);
        Assert.assertTrue(Actions.isDisplayedCheck(getHelp,30,1000));
        Assert.assertTrue(Actions.isDisplayedCheck(textGeneralInHelpPage,30,1000));
        Assert.assertTrue(Actions.isDisplayedCheck(textAccountInHelpPage,30,1000));
        Assert.assertTrue(Actions.isDisplayedCheck(textPaymentAndPricingInHelpPage,30,1000));
        Assert.assertTrue(Actions.isDisplayedCheck(textNavigationAndWayfindingInHelpPage,30,1000));
        Assert.assertTrue(Actions.isDisplayedCheck(textChargingInHelpPage,30,1000));
        Assert.assertTrue(Actions.isDisplayedCheck(textRecieptsAndMoreInHelpPage,30,1000));
        return this;
    }
    public AccountPage verifyVideoTutorialTab() {
        Actions.scrollElement("Watch a 1 minute video tutorial on how to charge with Presto");
        Assert.assertTrue((Actions.isDisplayedCheck(videoTutorialTab,30,1000)));
        return this;
    }
    public AccountPage clickOnVideoTutorialTab() {
        Actions.scrollElement("Watch a 1 minute video tutorial on how to charge with Presto");
        Assert.assertTrue((Actions.isDisplayedCheck(videoTutorialTab,30,1000)));
        Actions.clickElement(videoTutorialTab,30,1000);
        return this;
    }
    public AccountPage verifyVideoTutorial() {
        Assert.assertTrue(Actions.isDisplayedCheck(videoScrn,30,1000));
        Assert.assertTrue(Actions.isDisplayedCheck(closeBtnInVideo,30,1000));
        Assert.assertTrue(Actions.isDisplayedCheck(howToChargeWithPrestoTextInVideo,30,1000));
        return this;
    }
}
   
  