package pageobjects;

import config.Constants;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Actions;
import utils.Log;

import java.util.HashMap;

public class YourPassesPage extends BasePage {

    private final HashMap<String, By> prestoPlanMessage = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Your previous PrestoPass plans']"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> prestoPassFirstEntry = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.widget.ImageView[contains(@content-desc,'PrestoPass')])[1]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> prestoPassName = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='PrestoPass']"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> planName = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[17]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> energy = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[18]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> prestoLogo = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath(" (//*[@index='1'])[3]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> purchaseDate = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[22]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> price = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[24]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> tax = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[26]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> creditCard = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[28]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> invoiceId = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[30]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> message = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[31]"));
        put("iOS", AppiumBy.xpath(""));

    }};
    private final HashMap<String, By> mail = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[32]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> notPurchasedPlanText = new HashMap<String, By>() {{
            put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'You have not purchased')]"));
            put("iOS", AppiumBy.xpath(""));
        }};
    private final HashMap<String, By> yourPassesIcon = new HashMap<String, By>() {{
            put("Android", AppiumBy.className("android.widget.ImageView"));
            put("iOS", AppiumBy.xpath(""));
        }};
    private final HashMap<String, By> seePrestoPassBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"See PrestoPass\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> seePrestoPassPlansBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"See PrestoPass plans\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> selectPlanText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Select plan\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> payAsYouGoText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"You are using Presto FlexPay. Switch to a PrestoPass to save extra on charging.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> prestoPassDetailsText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"PrestoPass details\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> AroundTownPlanName = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Around Town\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> AroundTownEnergy = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"100 / 100 kwh\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> paymentDetailsText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Payment details\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> prestoPassAroundTown = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.widget.ImageView[contains(@content-desc,'PrestoPass Around Town')])"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> proUnlimitedPurchaseDetails = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.widget.ImageView[contains(@content-desc,'PrestoPass Pro Unlimited')])"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> proUnlimitedPrice = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"$70.49\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> proUnlimitedTax = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"$ 5.49\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> noTaxValue = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"$ 0.00\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> backBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Back\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargingTax = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"$0.17\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> totalPaid = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"$2.17\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};


    public YourPassesPage(AppiumDriver driver) {
        super(driver);
    }

    public YourPassesPage prestoPlanTextValidation() {
        Assert.assertTrue(Actions.isDisplayedCheck(prestoPlanMessage, 30, 1000));
        return this;
    }

    public YourPassesPage clickOnLatestPlan() {
        Actions.clickElement(prestoPassFirstEntry, 30, 1000);
        return this;
    }
    public YourPassesPage prestoPassNameValidation() {
        Assert.assertTrue(Actions.isDisplayedCheck(prestoPassName, 30, 1000));
        String passName=Actions.getAttributeValue(prestoPassName,30,1000,"content-desc");
        Assert.assertEquals(passName,Constants.PASS_NAME);
        return this;
    }
    public YourPassesPage planNameValidation() {
        Assert.assertTrue(Actions.isDisplayedCheck(planName, 30, 1000));
        return this;
    }
    public YourPassesPage energyValidation() {
        Assert.assertTrue(Actions.isDisplayedCheck(energy, 30, 1000));
        return this;
    }
    public YourPassesPage paymentDetails() {
        Assert.assertTrue(Actions.isDisplayedCheck(purchaseDate, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(price, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(tax, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(creditCard, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(invoiceId, 30, 1000));
        return this;
    }
    public YourPassesPage footerElementValidation() {

        Assert.assertTrue(Actions.isDisplayedCheck(message, 30, 1000));
        String passMessage = Actions.getAttributeValue(message,30,1000,"content-desc");
        Assert.assertEquals(passMessage,Constants.TEXT_YOURPASS);
        return this;
    }
    public YourPassesPage verifyNoYourPasses() {
        Assert.assertTrue(Actions.isDisplayedCheck(notPurchasedPlanText, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(yourPassesIcon, 30, 1000));
        return this;
    }
    public YourPassesPage clickSeePrestoPassPlansBtn() {
        Actions.clickElement(seePrestoPassPlansBtn, 30, 1000);
        return this;
    }
    public YourPassesPage clickSeePrestoPlanBtn() {
        Actions.clickElement(seePrestoPassBtn, 30, 1000);
        return this;
    }
    public YourPassesPage verifyPlanListingPage() {
        Assert.assertTrue(Actions.isDisplayedCheck(selectPlanText, 30, 1000));
        return this;
    }
    public YourPassesPage VerifyPayAsYouGo() {
        String flexPayText=Actions.getAttributeValue(payAsYouGoText,30,1000,"content-desc");
        Assert.assertEquals(flexPayText,Constants.PAY_AS_YOU_GO_TEXT);
        return this;
    }
    public YourPassesPage clickOnAroundTownPlan() {
        Actions.clickElement(prestoPassAroundTown, 30, 1000);
        return this;
    }
    public YourPassesPage VerifyPrestoPassDetails() {
        Actions.scrollElement("PrestoPass Around Town");
        clickOnAroundTownPlan();
        prestoPassNameValidation();
        String isText=Actions.getAttributeValue(prestoPassDetailsText,30,1000,"content-desc");
        Assert.assertEquals(isText,Constants.PRESTO_PASS_DETAILS);
        String AroundTown=Actions.getAttributeValue(AroundTownPlanName,30,1000,"content-desc");
        Assert.assertEquals(AroundTown,Constants. PURCHASED_PLAN_NAME);
        Assert.assertEquals(Actions.getAttributeValue(AroundTownEnergy, 30, 1000, "content-desc"), Constants.PURCHASED_ENERGY_AROUNDTOWN);
        Assert.assertEquals(Actions.getAttributeValue(paymentDetailsText, 30, 1000, "content-desc"), Constants.PAYMENT_DETAILS_TEXT);
        paymentDetails();
        return this;
    }
    public YourPassesPage clickOnProUnlimitedPurchaseDetails() {
        Actions.clickElement(proUnlimitedPurchaseDetails, 30, 1000);
        return this;
    }
    public YourPassesPage VerifyProUnlimitedPriceAndTax() {
        Log.info("Verify the tax value");
        Assert.assertEquals(Actions.getAttributeValue(proUnlimitedTax, 30, 1000, "content-desc"), Constants.PRO_UNLIMITED_TAX_STRING);
        Log.info("Verify the total value including tax");
        Assert.assertEquals(Actions.getAttributeValue(proUnlimitedPrice, 30, 1000, "content-desc"), Constants.PRO_UNLIMITED_PRICES_STRING);
        return this;

    }
    public YourPassesPage VerifyZeroTaxValue() {
        Log.info("Verify the tax value");
        Assert.assertEquals(Actions.getAttributeValue(noTaxValue, 30, 1000, "content-desc"), Constants.NO_TAX_STRING);
        return this;
    }
    public YourPassesPage VerifyChargingHistoryTax() {
        Log.info("Verify the tax value");
        Assert.assertEquals(Actions.getAttributeValue(chargingTax, 30, 1000, "content-desc"), Constants.CHARGING_TAX_STRING);
        return this;
    }
    public YourPassesPage VerifyTotalPaidAmnt() {
        Actions.scrollElement("Total paid");
        Log.info("Verify the total paid including tax");
        Assert.assertEquals(Actions.getAttributeValue(totalPaid, 30, 1000, "content-desc"), Constants.TOTAL_PAID_STRING);
        return this;
    }
    public YourPassesPage clickOnBackBtn() {
        Actions.clickElement(backBtn, 30, 1000);
        return this;
    }



}
