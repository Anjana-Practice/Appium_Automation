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

public class PlanPage extends BasePage {

    private final HashMap<String, By> continueBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Continue\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectPlanText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Select plan\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> textWhenNoPlan = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"PrestoPass\n" +
                "    Choose prepaid PrestoPass plans for your convenience or pay-as-you-go with FlexPay. \"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> planIcon = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'PrestoPass')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> addPayment = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Add Payment\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};


    private final HashMap<String, By> aroundTownTile = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Around Town')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> roadTripTile = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Road Trip')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> proUnlimitedPlan = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Pro Unlimited')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> buyNow = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Buy now\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    //*[contains(@text,'Add your payment information')]
    private final HashMap<String, By> addPaymentTitle = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@text,'Add your payment information')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> cardNumber = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[16]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> monthYear = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.EditText[2]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> cvc = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View[1]/android.widget.EditText[3]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> zipCode = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View/android.widget.ScrollView/android.view.View[2]/android.widget.EditText"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> planMessage1 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@content-desc,'PrestoPass is ON')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> planMessage2 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@content-desc,'Your Around Town for 100')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> planMessageRoadTrip = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@content-desc,'Your Road Trip for')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> payBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@text,'Pay')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> closePaymentInterface = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Close sheet\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> cardNumberErrorText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.TextView[3]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> cardYearErrorText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.TextView[3]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> sallyPlan = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Pro Max')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> sallyPlanLite = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Pro Lite')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> hertzPlan1 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'FlexPay')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> hertzPlan2 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'Road Trip')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> planMessage3 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@content-desc,'Your Pro Max for 250')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> hertzplanMessage = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@content-desc,'Your Road Trip for 150')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> purchasedPlanNameAroundTown = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Around Town\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> excludedHoursMsg = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,\"Excluded hours: \")]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargingHistoryLbl = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Charging history\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> noHistoryText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Nothing here yet. Get started!\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> energyDuringPurchase = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"100 / 100 kwh\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> yourPlanText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Your plan\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> noPlanText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Save with Prepaid charging plans\n" +
                "or Pay-as-you-go with FlexPay\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> customizedPlansText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Interested to see customized plans?\n" +
                "Select your fleet\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> seeDetailsLink = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"See details\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};


    private final HashMap<String, By> detailsTitle = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Around Town Plan Details\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> detailsPoint1 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath(" //android.view.View[@content-desc=\"Lock in savings with a prepaid charging pass.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> detailsPoint2 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"No session fees.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> detailsPoint3 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"50 kWhs included on the pass at charging stations where Presto is accepted.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> roadTripDetailsPoint3 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"150 kWhs included on the pass at charging stations where Presto is accepted.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> detailsPoint4 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath(" //android.view.View[@content-desc=\"Pass valid for 30 days from purchase, unused kWhs on pass expire when pass expires.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> detailsPoint5 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Presto is only accepted in California at this time.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> detailsPoint6 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Taxes may apply.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> detailsPoint7 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Idle fees and parking fees charged by station owners may apply, example: $0.40/min starting 10 minutes post charging.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> detailsPoint8 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Savings estimates based on typical usage compared to retail rates at public charging networks. Actual savings will vary.  \"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> flexPayDetailsTitle = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"FlexPay Plan Details\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> flexPayDetails1 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Buy charging flexibly on a per kWh or per minute basis at stations where Presto is accepted.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> flexPayDetails2 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"No session fees.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> flexPayDetails3 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Taxes may apply.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> flexPayDetails4 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Idle fees and parking fees charged by station owners may apply, example: $0.40/min starting 10 minutes post charging.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> flexPayDetails5 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Presto is only accepted in California at this time.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> hertzRoadTripPlan = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'Road Trip')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> purchasedPlanNameRoadTrip = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Road Trip\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> energyDuringHertzPlanPurchase = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"150 / 150 kwh\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> roadTripDetailsTitle = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Road Trip Plan Details\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> closeBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> closeDetailsElement = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> paymentCancel = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'The payment has been canceled')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> planExpiredText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Expired\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> buyPlanBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Buy Plan\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> buyNewPlanBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Buy new plan\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> backBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Back\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> planCloseBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Close\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> planConfirmBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Confirm\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> buyPlanAgainText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Buy PrestoPass to start saving again\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> voucherCodeBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"I have a voucher code\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> enterVoucherCodeText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Enter voucher code\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> voucherCodeSubText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Enter a code to unlock special plans.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> voucherCodeField = new HashMap<String, By>() {{
        put("Android", AppiumBy.className("android.widget.EditText"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> closeModalBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@index='1']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> hertzSelectedFleetText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@index='0']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> hertzFlexPayPlan = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'FlexPay')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> maybeLaterButton = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Maybe later\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> enableBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Enable notifications\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> maybeLaterBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Maybe later\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> allowBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.id("com.android.permissioncontroller:id/permission_allow_button"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> dontAllowBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[contains(@text,'Don’t allow')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> addPaymentBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Add Payment\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> flexPayPlan = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[contains(@content-desc,'FlexPay')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> proMaxPlanBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Save up to 30%\n" +
                "Pro Max\n" +
                "$35\n" +
                "$60\n" +
                "50% off for new users - limited time only\n" +
                "Energy purchased (est. miles)\n" +
                "200kWh\n" +
                "(~600miles)\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
//    private final HashMap<String, By> dontAllowBtn = new HashMap<String, By>() {{
//        put("Android", AppiumBy.id(""));
//        put("iOS", AppiumBy.xpath(""));
//    }};
//    private final HashMap<String, By> getNotifiedTxt1 = new HashMap<String, By>() {{
//        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Get notified!\"]"));
//        put("iOS", AppiumBy.xpath(""));
//    }};
//    private final HashMap<String, By> getNotifiedTxt2 = new HashMap<String, By>() {{
//        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Allow push notifications to be notified when your plan is about to expire.\"]"));
//        put("iOS", AppiumBy.xpath(""));
//    }};

    public PlanPage(AppiumDriver driver) {
        super(driver);
    }

    public PlanPage clickOnContinue() {
        Actions.clickElement(continueBtn, 30, 1000);
        return this;
    }
    public PlanPage clickPlanIcon() {
        Actions.clickElement(planIcon, 30, 1000);
        return this;
    }
    public PlanPage selectPlanTextValidation() {
        String selectPlanTextValidation = Actions.getAttributeValue(selectPlanText, 30, 1000, "content-desc");
        Assert.assertEquals(selectPlanTextValidation, Constants.SELECT_PLAN_TEXT);
        return this;
    }
    public PlanPage buyNowTextValidation() {
        String buyNowTextValidation = Actions.getAttributeValue(buyNow, 30, 1000, "content-desc");
        Assert.assertEquals(buyNowTextValidation, Constants.BUY_NOW_TEXT);
        return this;
    }
    public PlanPage clickBuyNowForLogin() {
        Actions.clickElement(buyNow, 30, 1000);
        return this;
    }
    public PlanPage clickAroundTown() {
        Actions.scrollElement("Around Town");
        Actions.clickElement(aroundTownTile, 30, 1000);
        return this;
    }
    public PlanPage clickRoadTrip() {
        Actions.scrollElement("Road Trip");
        Actions.clickElement(roadTripTile, 30, 1000);
        return this;
    }
    public PlanPage clickProUnlimitedPlan() {
        Actions.scrollElement("Pro Unlimited");
        Actions.clickElement(proUnlimitedPlan, 30, 1000);
        return this;
    }
    public PlanPage clickOnBuyNow() {
        Actions.clickElement(buyNow, 30, 1000);
        return this;
    }
    public PlanPage clickOnConfirm() {
        Actions.clickElement(planConfirmBtn, 30, 1000);
        return this;
    }
    public PlanPage isBuyNowDisplayed() {
       Assert.assertTrue(Actions.isDisplayedCheck(buyNow,30,1000));
        return this;
    }
    public PlanPage isPaymentSectionDisplayed() {
        boolean paymentSection = Actions.isDisplayedCheck(addPaymentTitle, 30, 1000);
        Assert.assertTrue(paymentSection);
        return this;
    }
    public PlanPage enterPaymentDetails() {
        Actions.clickElement(cardNumber, 30, 1000);
        Actions.sendText(cardNumber, Constants.CARD_NUMBER, 30, 1000);
        Actions.clickElement(monthYear, 30, 1000);
        Actions.sendText(monthYear, Constants.MONTH_YEAR, 30, 1000);
        Actions.sendText(cvc, Constants.CVC_PLAN_PURCHASE, 30, 1000);
        Actions.clickElement(zipCode, 30, 1000);
        Actions.sendText(zipCode, Constants.POSTAL_CODE, 30, 1000);
        return this;
    }
    public PlanPage clickPayNow() {
        Actions.waitFor(60);
        Actions.clickElement(payBtn, 30, 1000);
        return this;
    }
    public PlanPage clickMaybeLater(){
        Actions.clickElement(maybeLaterButton, 30, 1000);
        return this;
    }
    public PlanPage clickCloseInPayment() {
        Actions.waitFor(60);
        Actions.clickElement(closeBtn, 30, 1000);
        return this;
    }
    public PlanPage paymentCancelValidation() {
        boolean isShown = Actions.isDisplayedCheck(paymentCancel, 30, 1000);
        assertTrue(isShown,"Payment cancel pop up not found");
      System.out.println("message of cancel"+ isShown);
        return this;
    }
    public PlanPage verifyBuyPlanMessage(String message) {
        Actions.waitFor(30);
        Assert.assertEquals(Actions.getAttributeValue(planMessage1, 30, 1000, "content-desc"), "PrestoPass is ON");
        Assert.assertEquals(Actions.getAttributeValue(planMessage2, 30, 1000, "content-desc"), message);
        return this;
    }
    public PlanPage verifyBuyPlanMessageRoadTrip(String message) {
        Actions.waitFor(30);
        Assert.assertEquals(Actions.getAttributeValue(planMessage1, 30, 1000, "content-desc"), "PrestoPass is ON");
        Assert.assertEquals(Actions.getAttributeValue(planMessageRoadTrip, 30, 1000, "content-desc"), message);
        return this;
    }
    public PlanPage verifyBuyPlanMessageOne() {
        Actions.waitFor(30);
        Assert.assertEquals(Actions.getAttributeValue(planMessage1, 30, 1000, "content-desc"), "PrestoPass is ON");
        return this;
    }
    public PlanPage enterWrongPaymentDetails() {
        Actions.clickElement(cardNumber, 30, 1000);
        Actions.sendText(cardNumber, Constants.WRONG_CARD_NUMBER, 30, 1000);
        String cardError = Actions.getAttributeValue(cardNumberErrorText, 60, 100, "text");
        assertEquals(cardError, Constants.CARD_ERROR_MESSAGE);
        Actions.hideKeyboard();
        Actions.clearElement(cardNumber, 30, 1000);
        Actions.clickElement(cardNumber, 30, 1000);
        Actions.sendText(cardNumber, Constants.CARD_NUMBER, 30, 1000);
        Actions.clickElement(monthYear, 30, 1000);
        Actions.sendText(monthYear, Constants.INVALID_MONTH_YEAR, 30, 1000);
        String monthYearError = Actions.getAttributeValue(cardYearErrorText, 60, 100, "text");
        assertEquals(monthYearError, Constants.CARD_DATE_ERROR_MESSAGE);
        return this;
    }
    public PlanPage clickPaymentClose() {
        Actions.waitFor(60);
        Actions.clickElement(closePaymentInterface, 30, 1000);
        return this;
    }
    public PlanPage selectPlan() {
        Actions.scrollElement("Pro Lite");
        Actions.clickElement(sallyPlanLite, 30, 1000);
        return this;
    }
    public PlanPage verifyPlanMessage() {
        Actions.waitFor(30);
        Assert.assertEquals(Actions.getAttributeValue(planMessage1, 30, 1000, "content-desc"), "PrestoPass is ON");
        String planBuyMessage=Actions.getAttributeValue(planMessage3, 30, 1000, "content-desc");
        Assert.assertEquals(planBuyMessage, Constants.SALLY_PLAN_BUY_MESSAGE);
        return this;
    }
    public PlanPage verifyPurchasedPageDetails() {
        Actions.waitFor(30);
        Assert.assertEquals(Actions.getAttributeValue(purchasedPlanNameAroundTown, 30, 1000, "content-desc"), Constants.PURCHASED_PLAN_NAME);
        Assert.assertTrue(Actions.isDisplayedCheck(excludedHoursMsg, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(chargingHistoryLbl, 30, 1000));
        Assert.assertEquals(Actions.getAttributeValue(energyDuringPurchase, 30, 1000, "content-desc"), Constants.PURCHASED_ENERGY_AROUNDTOWN);
        Actions.clickElement(seeDetailsLink, 30, 1000);
        Assert.assertEquals(Actions.getAttributeValue(detailsTitle, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_TITLE_AROUNDTOWN);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint1, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT1);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint2, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT2);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint3, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT3);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint4, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT4);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint5, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT5);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint6, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT6);
        return this;
    }

    public PlanPage closeDetails() {
        Actions.clickElement(closeDetailsElement, 30, 1000);
        return this;
    }
    public PlanPage verifySeeDetails() {
        Actions.clickElement(seeDetailsLink, 30, 1000);
        Assert.assertEquals(Actions.getAttributeValue(roadTripDetailsTitle, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_TITLE_ROAD_TRIP);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint1, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT1);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint2, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT2);
        Assert.assertEquals(Actions.getAttributeValue(roadTripDetailsPoint3, 30, 1000, "content-desc"), Constants.ROAD_TRIP_PLAN_DETAILS_POINT3);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint4, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT4);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint5, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT5);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint6, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT6);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint7, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT7);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint8, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT8);

        return this;
    }
    public PlanPage selectRoadTripPlan() {
        Actions.scrollElement("Road Trip");
        Actions.clickElement(hertzRoadTripPlan, 30, 1000);
        return this;
    }
    public PlanPage verifyHertzPlanMessage() {
        Actions.waitFor(30);
        Assert.assertEquals(Actions.getAttributeValue(planMessage1, 30, 1000, "content-desc"), "PrestoPass is ON");
        String planBuyMessage=Actions.getAttributeValue(hertzplanMessage, 30, 1000, "content-desc");
        Assert.assertEquals(planBuyMessage, Constants.HERTZ_PLAN_BUY_MESSAGE);
        return this;
    }
    public PlanPage verifyHertzPurchasedPageDetails() {
        Actions.waitFor(30);
        Assert.assertEquals(Actions.getAttributeValue(purchasedPlanNameRoadTrip, 30, 1000, "content-desc"), Constants.PRESTO_PLAN_NAME);
        Assert.assertTrue(Actions.isDisplayedCheck(excludedHoursMsg, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(chargingHistoryLbl, 30, 1000));
        Assert.assertEquals(Actions.getAttributeValue(energyDuringHertzPlanPurchase, 30, 1000, "content-desc"), Constants.PURCHASED_ENERGY_ROAD_TRIP);
        Actions.clickElement(seeDetailsLink, 30, 1000);
        Assert.assertEquals(Actions.getAttributeValue(roadTripDetailsTitle, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_TITLE_ROAD_TRIP);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint4, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT4);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint5, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT5);
        Assert.assertEquals(Actions.getAttributeValue(detailsPoint6, 30, 1000, "content-desc"), Constants.PLAN_DETAILS_POINT6);
        return this;
    }

    public PlanPage yourPlanTextValidation() {
        Assert.assertTrue(Actions.isDisplayedCheck(yourPlanText, 30, 1000));
        Assert.assertEquals(Actions.getAttributeValue(yourPlanText, 30, 1000, "content-desc"), Constants.YOUR_PLAN_TEXT);
        return this;
    }
    public PlanPage noPlanTextValidation() {
        Assert.assertTrue(Actions.isDisplayedCheck(noPlanText, 30, 1000));
        /*Assert.assertEquals(Actions.getAttributeValue(noPlanText , 30, 1000, "content-desc"), Constants.NO_PLAN_TEXT);*/
        return this;
    }
    public PlanPage customizedPlansTextValidation() {
        Assert.assertTrue(Actions.isDisplayedCheck(customizedPlansText, 30, 1000));
        return this;
    }
    public PlanPage verifyPlanBuyNowBtn() {
        Assert.assertTrue(Actions.isDisplayedCheck(buyNow, 30, 1000));
        return this;
    }
    public PlanPage verifyExpiredPlan() {
        Assert.assertEquals(Actions.getAttributeValue(planExpiredText, 30, 1000, "content-desc"), Constants.PLAN_EXPIRED_TEXT);
        Assert.assertEquals(Actions.getAttributeValue(planIcon, 30, 1000, "content-desc"), Constants.PASS_NAME);
        Assert.assertTrue(Actions.isDisplayedCheck(buyPlanBtn, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(buyNewPlanBtn, 30, 1000));
        Assert.assertEquals(Actions.getAttributeValue(buyPlanAgainText, 30, 1000, "content-desc"), Constants.BUY_PLAN_AGAIN_TEXT);
        return this;
    }
    public PlanPage NavigateToSelectPlan() {
        Actions.clickElement(buyNewPlanBtn, 30, 1000);
        Actions.clickElement(backBtn, 30, 1000);
        return this;
    }
    public PlanPage clickBuyPlan() {
        Actions.clickElement(buyPlanBtn, 30, 1000);
        return this;
    }
    public PlanPage clickBuyNewPlanBtn() {
        Actions.clickElement(buyNewPlanBtn, 30, 1000);
        return this;
    }
    public PlanPage verifyConfirmModal() {
        Assert.assertEquals(Actions.getAttributeValue(planCloseBtn, 30, 1000, "content-desc"), Constants.CLOSE_BTN_TEXT);
        Assert.assertEquals(Actions.getAttributeValue(planConfirmBtn, 30, 1000, "content-desc"), Constants.CONFIRM_BTN_TEXT);
        Actions.clickElement(planCloseBtn, 30, 1000);
        return this;
    }
    public PlanPage verifyVoucherCodeModal() {
        Assert.assertEquals(Actions.getAttributeValue(voucherCodeBtn, 30, 1000, "content-desc"), Constants.VOUCHER_CODE_TEXT);
        Actions.clickElement(voucherCodeBtn, 30, 1000);
        Assert.assertEquals(Actions.getAttributeValue(enterVoucherCodeText, 30, 1000, "content-desc"), Constants.ENTER_VOUCHER_CODE_TEXT);
        Assert.assertEquals(Actions.getAttributeValue(voucherCodeSubText, 30, 1000, "content-desc"), Constants.VOUCHER_CODE_SUB_TEXT);
        Assert.assertTrue(Actions.isDisplayedCheck(voucherCodeField, 30, 1000));
        Assert.assertEquals(Actions.getAttributeValue(planConfirmBtn, 30, 1000, "content-desc"), Constants.CONFIRM_BTN_TEXT);
        Actions.clickElement(closeModalBtn, 30, 1000);
        return this;
    }

    public PlanPage verifyValidVoucherCode(String voucherCode) {
        Actions.clickElement(voucherCodeBtn, 30, 1000);
        Actions.clickElement(voucherCodeField, 30, 1000);
        Actions.sendText(voucherCodeField, voucherCode, 30, 10000);
        Actions.clickElement(planConfirmBtn, 30, 1000);
        Assert.assertTrue(Actions.isDisplayedCheck(sallyPlanLite, 30, 1000));
        Actions.scrollElement("Pro Max");
        Assert.assertTrue(Actions.isDisplayedCheck(sallyPlan, 30, 1000));
        return this;
    }
    public PlanPage verifyHertzValidVoucherCode(String voucherCode) {
        Actions.clickElement(voucherCodeBtn, 30, 1000);
        Actions.clickElement(voucherCodeField, 30, 1000);
        Actions.sendText(voucherCodeField, voucherCode, 30, 10000);
        Actions.clickElement(planConfirmBtn, 30, 1000);
        Assert.assertTrue(Actions.isDisplayedCheck(hertzPlan1, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(hertzPlan2, 30, 1000));
        return this;
    }
    public PlanPage verifyHertzPlanList() {
        Assert.assertTrue(Actions.isDisplayedCheck(hertzSelectedFleetText, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(hertzRoadTripPlan, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(hertzFlexPayPlan, 30, 1000));
        return this;
    }
    public PlanPage verifySallyPlanList() {
        Assert.assertTrue(Actions.isDisplayedCheck(hertzSelectedFleetText, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(sallyPlanLite, 30, 1000));
        Actions.scrollElement("Pro Max");
        Assert.assertTrue(Actions.isDisplayedCheck(sallyPlan, 30, 1000));
        return this;
    }
    public PlanPage verifyGetNotifiedPopUp(){
        Assert.assertTrue(Actions.isDisplayedCheck(enableBtn, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(maybeLaterBtn, 30, 1000));
        // Assert.assertTrue(Actions.isDisplayedCheck(getNotifiedTxt1, 30, 1000));
        // Assert.assertEquals(Actions.getAttributeValue(getNotifiedTxt2, 30, 1000, "content-desc"), Constants.GET_NOTIFICATION_POPUP_TEXT);
        return this;
    }
    public PlanPage clickEnablePushNotification(){
        Actions.clickElement(enableBtn,30,1000);
        return this;
    }
    public PlanPage selectFlexPay() {
        boolean isFlexPayDisplayed = Actions.isDisplayedCheck(flexPayPlan,30,1000);
        System.out.println(isFlexPayDisplayed);
        if (!isFlexPayDisplayed) {
            Actions.swipeUp();
            Actions.clickElement(flexPayPlan, 30, 1000);
            return this;
        }
        Actions.clickElement(flexPayPlan, 30, 1000);
        return this;
    }
    public PlanPage clickAllowBtn(){
        Actions.clickElement(allowBtn,30,1000);
        // Assert.assertTrue(Actions.isDisplayedCheck(allowBtn, 30, 1000));
        //Assert.assertTrue(Actions.isDisplayedCheck(dontAllowBtn, 30, 1000));
        return this;
    }
    public PlanPage clickDontAllowBtn() {
        Actions.clickElement(dontAllowBtn, 30, 1000);
        return this;
    }
    public PlanPage clickAddPaymentBtn() {
        Actions.clickElement(addPaymentBtn, 30, 1000);
        return this;
    }
    public PlanPage clickProMaxPlan(){
        Actions.clickElement(proMaxPlanBtn,30,1000);
        return this;
    }
    public PlanPage clickSeeDetailsLink() {
        Assert.assertTrue(Actions.isDisplayedCheck(seeDetailsLink,30,1000));
        Actions.clickElement(seeDetailsLink,30,1000);
        return this;
    }

    public PlanPage verifySeeDetailsLink() {
        Assert.assertTrue(Actions.isDisplayedCheck(flexPayDetailsTitle,30,1000));
        Assert.assertTrue(Actions.isDisplayedCheck(flexPayDetails1,30,1000));
        Assert.assertTrue(Actions.isDisplayedCheck(flexPayDetails2,30,1000));
        Assert.assertTrue(Actions.isDisplayedCheck(flexPayDetails3,30,1000));
        Assert.assertTrue(Actions.isDisplayedCheck(flexPayDetails4,30,1000));
        Assert.assertTrue(Actions.isDisplayedCheck(flexPayDetails5,30,1000));
        return this;
    }
    public PlanPage clickOnCloseDetailsElement() {
        Assert.assertTrue(Actions.isDisplayedCheck(closeDetailsElement,30,1000));
        Actions.clickElement(closeDetailsElement,30,1000);
        return this;
    }

}