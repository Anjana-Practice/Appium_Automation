package pageobjects;

import config.Constants;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Actions;
import utils.Log;

import java.util.HashMap;

import static org.testng.Assert.assertTrue;

public class AccountSettingsPage extends BasePage {
    private final HashMap<String, By> paymentMethod = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Payment method\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> creditCard = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'4242')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> updatePaymentMethodPopup = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Update Payment method?')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> updateCardBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Update Card\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> closeBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Update Payment method?\n" +
                "Enter details to replace your existing card.\"]/android.widget.Button[1]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> enterCardDetailsText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Enter Card Details\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> cardNumberField = new HashMap<String, By>() {{
        put("Android", AppiumBy.id(
                "com.chargepass.presto.qa:id/et_card_number"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> monthYearField = new HashMap<String, By>() {{
        put("Android", AppiumBy.id(
                "com.chargepass.presto.qa:id/et_expiry"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> cvcField = new HashMap<String, By>() {{
        put("Android", AppiumBy.id("com.chargepass.presto.qa:id/et_cvc"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> postCodeField = new HashMap<String, By>() {{
        put("Android", AppiumBy.id(
                "com.chargepass.presto.qa:id/postal_code"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> countryField = new HashMap<String, By>() {{
        put("Android", AppiumBy.className("android.widget.Spinner"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> wrongCardError = new HashMap<String, By>() {{
        put("Android", AppiumBy.id(
                "com.chargepass.presto.qa:id/errors"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> saveBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath(
                "//android.widget.Button[@content-desc=\"Save\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> successMessage = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@index='0']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> rentalCompanyOrFleet = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Rental company / fleet\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> btnHertzTNCSelect = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Hertz TNC\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> btnSallySelect = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Sally\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> FleetPageText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Fleets & plans')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> applyBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Apply\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> oregonRegion = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Oregon\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> norcalRegion = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"NorCal\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> hertz = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Hertz\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> sally = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView[3]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> voucherCodeError = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Invalid voucher code.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> verifySally = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Sally\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> notificationToggle = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Notifications']/android.widget.Switch"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> locationToggle = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Location\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> logOut = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Log out\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> deleteAccount = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Delete account\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> accountSettings = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Account settings\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> deleteMessage = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'This action is irreversible and will result in the loss of information stored in your account')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> deleteConfirm = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc='Delete']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chatLinkButton = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Intercom launcher\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chatLinkPageStartConversation = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ScrollView/android.view.View[2]/android.view.View"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> prestoFleet = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView[2]"));
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
    private final HashMap<String, By> selectSally = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Sally')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectHertz = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Hertz')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> referButton = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Refer a friend\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> referTextLink = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.TextView[@text=\"Hey there! Use Presto to make charging magically easy! Use my referral link to get discounts when you subscribe to a plan - https://prestocharging.sng.link/Aecz9/hexm/r_b0e3f9bd7e\"]"));
        put("iOS", AppiumBy.xpath(""));

    }};
    private final HashMap<String, By> nameBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Name')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> nameFieldEdit = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.EditText"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> emailBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Email')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> emailField = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.widget.EditText"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> accountUpdatedToast = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Account updated!\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    public AccountSettingsPage(AppiumDriver driver) {
        super(driver);
    }

    public AccountSettingsPage verifyPaymentMethodText() {
        boolean isPaymenttext = Actions.isDisplayedCheck(paymentMethod, 30, 1000);
        assertTrue(isPaymenttext, "Unable to locate payment method text");
        return this;
    }
    public AccountSettingsPage verifyCreditCard() {
        boolean isCardDetail = Actions.isDisplayedCheck(creditCard, 30, 1000);
        assertTrue(isCardDetail, "Unable to locate card details");
        return this;
    }
    public AccountSettingsPage clickCreditCard() {
        Actions.clickElement(creditCard, 30, 2000);
        return this;
    }
    public AccountSettingsPage verifyUpdatePaymentPopup() {
        boolean isPopup = Actions.isDisplayedCheck(updatePaymentMethodPopup, 30, 1000);
        assertTrue(isPopup, "Unable to locate Payment method pop up");
        return this;
    }
    public AccountSettingsPage verifyUpdateCardBtn() {
        boolean isUpdateCardBtn = Actions.isDisplayedCheck(updateCardBtn, 30, 1000);
        assertTrue(isUpdateCardBtn, "Unable to locate button");
        return this;
    }
    public AccountSettingsPage clickCloseBtn() {
        Actions.clickElement(closeBtn, 30, 2000);
        return this;
    }
    public AccountSettingsPage clickUpdateCard() {
        Actions.clickElement(updateCardBtn, 30, 2000);
        return this;
    }
    public AccountSettingsPage verifyEnterCardDetails() {
        boolean isCardText = Actions.isDisplayedCheck(enterCardDetailsText, 30, 1000);
        assertTrue(isCardText, "Unable to locate Enter card details text");
        return this;
    }
    public AccountSettingsPage enterCardDetailsValidation() {
        Assert.assertTrue(Actions.isDisplayedCheck(cardNumberField, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(monthYearField, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(cvcField, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(postCodeField, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(countryField, 30, 1000));
        return this;
    }
    public AccountSettingsPage verifyError() {
        boolean isCardError = Actions.isDisplayedCheck(wrongCardError, 30, 1000);
        assertTrue(isCardError, "Unable to locate card error");
        return this;
    }
    public AccountSettingsPage enterCardNumber(String cardNumber) {
        Actions.sendText(cardNumberField, cardNumber, 30, 10000);
        return this;
    }
    public AccountSettingsPage enterMonthYear(String monthYear) {
        Actions.sendText(monthYearField, monthYear, 30, 10000);
        return this;
    }
    public AccountSettingsPage enterCVC(String cvc) {
        Actions.sendText(cvcField, cvc, 30, 10000);
        return this;
    }
    public AccountSettingsPage enterPostalCode(String postalCode) {
        Actions.sendText(postCodeField, postalCode, 30, 10000);
        return this;
    }
    public AccountSettingsPage clickCardNumber() {
        Actions.clickElement(cardNumberField, 30, 2000);
        return this;
    }
    public AccountSettingsPage clickMonthYear() {
        Actions.clickElement(monthYearField, 30, 2000);
        return this;
    }
    public AccountSettingsPage clickCvc() {
        Actions.clickElement(cvcField, 30, 2000);
        return this;
    }
    public AccountSettingsPage clickPostalCode() {
        Actions.clickElement(postCodeField, 30, 2000);
        return this;
    }
    public AccountSettingsPage clickOutside() {
        Actions.clickElement(enterCardDetailsText, 30, 2000);
        return this;
    }
    public AccountSettingsPage clickSaveBtn() {
        Actions.clickElement(saveBtn, 30, 2000);
        return this;
    }
    public AccountSettingsPage verifySuccessMessage() {
        boolean isMessage = Actions.isDisplayedCheck(successMessage, 30, 1000);
        assertTrue(isMessage, "Unable to locate card message");
        return this;
    }
    public AccountSettingsPage verifyRentalFleetText() {
        boolean isText = Actions.isDisplayedCheck(rentalCompanyOrFleet, 30, 1000);
        assertTrue(isText, "Unable to locate text");
        return this;
    }
    public AccountSettingsPage clickSelectHertzBtn() {
        Actions.clickElement(btnHertzTNCSelect, 30, 2000);
        return this;
    }
    public AccountSettingsPage clickSelectSallyBtn() {
        Actions.clickElement(btnSallySelect, 30, 2000);
        return this;

    }
    public AccountSettingsPage verifyYourFleetText() {
        assertTrue(Actions.isDisplayedCheck(FleetPageText, 30, 1000));
        return this;
    }
    public AccountSettingsPage clickOregonDropdown() {
        Actions.clickElement(oregonRegion, 30, 2000);
        return this;
    }
    public AccountSettingsPage clickNorcalDropdown() {
        Actions.clickElement(norcalRegion, 30, 2000);
        return this;
    }
    public AccountSettingsPage SelectRegionOregon(){
        Actions.clickElement(selectRegionOregon, 50, 2000);
        return this;
    }
    public AccountSettingsPage SelectRegionNorCal(){
        Actions.clickElement(selectRegionNorCal, 50, 2000);
        return this;
    }
    public AccountSettingsPage selectCustomSallyFleet(){
        Actions.clickElement(selectSally, 50, 2000);
        return this;
    }
    public AccountSettingsPage clickApplyBtn() {
        Actions.clickElement(applyBtn, 30, 2000);
        return this;
    }
    public AccountSettingsPage selectHertz() {
        Actions.clickElement(selectHertz, 30, 2000);
        return this;
    }
    public AccountSettingsPage verifyVoucherCodeError() {
        boolean isError = Actions.isDisplayedCheck(voucherCodeError, 30, 1000);
        assertTrue(isError, "Unable to locate text");
        return this;
    }
    public AccountSettingsPage verifySallyAfterSelection() {
        boolean isSally = Actions.isDisplayedCheck(verifySally, 30, 1000);
        assertTrue(isSally, "Unable to found sally fleet");
        return this;
    }
    public AccountSettingsPage isLocationToggleEnabledWhenLocationOn() {
        Actions.scrollElement("Location");
        Assert.assertTrue(Actions.isDisplayedCheck(locationToggle, 30, 1000));
        boolean isLocationCheckedOn = Boolean.parseBoolean(Actions.getAttributeValue(locationToggle, 30, 1000, "enabled"));
        System.out.println("location on" + isLocationCheckedOn);
        Assert.assertTrue(isLocationCheckedOn);
        return this;
    }
    public AccountSettingsPage clickLogout() {
        Actions.clickElement(logOut, 50, 2000);
        return this;
    }
    public AccountSettingsPage verifyDeleteAccountText() {
        boolean isText = Actions.isDisplayedCheck(deleteAccount, 30, 1000);
        assertTrue(isText, "Delete account text is not found");
        return this;
    }
    public AccountSettingsPage isLocationToggleDisabledWhenLocationOff() {
        boolean isLocationCheckedOff = Boolean.parseBoolean(Actions.getAttributeValue(locationToggle, 30, 1000, "checked"));
        System.out.println("location on" + isLocationCheckedOff);
        Assert.assertFalse(isLocationCheckedOff);
        return this;
    }
    public AccountSettingsPage notificationToggle() {
        Assert.assertTrue(Actions.isDisplayedCheck(notificationToggle, 30, 1000));
        return this;
    }
    public AccountSettingsPage clickSally() {
        Actions.clickElement(prestoFleet, 50, 2000);
        Actions.clickElement(sally, 50, 2000);
        return this;
    }
    public AccountSettingsPage verifyAccountSettingsText() {
        Assert.assertTrue(Actions.isDisplayedCheck(accountSettings, 30, 1000));
        return this;
    }
    public AccountSettingsPage clickOnDelete() {
        Actions.scrollElement("Delete account");
        Actions.clickElement(deleteAccount, 50, 1000);
        /*String actualDeleteMessage = Actions.getAttributeValue(deleteMessage, 30, 1000, "content-desc");
        System.out.println("delete message" + actualDeleteMessage);
        Assert.assertEquals(actualDeleteMessage, Constants.DELETE_ACCOUNT_MESSAGE_EXPECTED);*/
        Assert.assertTrue(Actions.isDisplayedCheck(deleteMessage, 30, 1000));
        return this;
    }
    public AccountSettingsPage clickOnConfirmDelete() {
        Actions.clickElement(deleteConfirm, 50, 1000);
        return this;
    }
    public AccountSettingsPage verifyChatLink() {
        Actions.clickElement(chatLinkButton, 50, 1000);
        Log.info("Verify Start a conversation text");
        Assert.assertTrue(Actions.isDisplayedCheck(chatLinkPageStartConversation, 30, 1000));
        return this;
    }
    public AccountSettingsPage clickReferButton() {
        Assert.assertTrue(Actions.isDisplayedCheck(referButton, 30, 1000));
        Actions.clickElement(referButton, 50, 1000);
        return this;
    }
    public AccountSettingsPage verifyReferButton(){
        String referMessage = Actions.getAttributeValue(referTextLink,30,1000,"text");
        Assert.assertEquals(referMessage,Constants.TEXT_REFER_FRIEND);
       // Log.info(Actions.getAttributeValue(refertext,30,1000,"content-desc"));
        return this;
    }
    public AccountSettingsPage editName(){
        Actions.clickElement(nameBtn, 30, 1000);
        Actions.clickElement(nameFieldEdit,30,1000);
        Actions.clearElement(nameFieldEdit, 30, 1000);
        Actions.sendText(nameFieldEdit, Constants.UPDATED_USER_NAME, 30, 1000);
        Actions.clickElement(saveBtn, 30, 1000);
        return this;
    }
    public AccountSettingsPage verifyAccountUpdatedToastMsg(){
        Actions.isDisplayedCheck(accountUpdatedToast,30,1000);
        return this;
    }

    public AccountSettingsPage whenNotificationToggleisEnabled() {
        Actions.scrollElement("Notification");
        Assert.assertTrue(Actions.isDisplayedCheck(notificationToggle, 30, 1000));
        boolean isNotificationCheckedOn = Boolean.parseBoolean(Actions.getAttributeValue(notificationToggle, 30, 1000, "enabled"));
        System.out.println("notification on" + isNotificationCheckedOn);
        Assert.assertTrue(isNotificationCheckedOn);
        return this;
    }

    public AccountSettingsPage whenNotificationToggleisDisabled() {
        Actions.scrollElement ("Notifications");
        boolean isNotificationCheckedOff = Boolean.parseBoolean(Actions.getAttributeValue(notificationToggle, 30, 1000, "checked"));
        System.out.println("notification off" + isNotificationCheckedOff);
        Assert.assertFalse(isNotificationCheckedOff);
        return this;
    }

    public AccountSettingsPage editEmail(){
        Actions.clickElement(emailBtn, 30, 1000);
        Actions.clickElement(emailField,30,1000);
        Actions.clearElement(emailField, 30, 1000);
        Actions.sendText(emailField, Constants.UPDATED_USER_EMAIL, 30, 1000);
        Actions.clickElement(saveBtn, 30, 1000);
        return this;
    }
}

   
   



