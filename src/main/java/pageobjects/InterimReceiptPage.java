package pageobjects;

import config.Constants;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Actions;

import java.util.HashMap;

public class InterimReceiptPage extends BasePage {

    private final HashMap<String, By> chargingdateAndTime = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[14]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> chargePointLabel = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='ChargePoint']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> stationName = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index='1'])[3]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> totalPaidLbl = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Total paid']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> totalPaidAmount = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.view.View[contains(@content-desc,'$')])[1]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> additionalFeesText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Additional fees may apply and be billed later']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> sessionDetailsLbl = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Session details']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> timerValue = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'min')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> energyValue = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'kWh')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> costSummaryLbl = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Cost summary']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> energyFeeLbl = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Energy fee']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> energyFeeText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.view.View[@content-desc='Included with PrestoPass'])[1]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> energyFeeAmount = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.view.View[contains(@content-desc,'$')])[2]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> sessionFeeLbl = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Session fee']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> sessionFeeText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.view.View[@content-desc='Included with PrestoPass'])[2]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> sessionFeeAmount = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.view.View[contains(@content-desc,'$')])[3]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> taxLbl = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Tax']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> taxAmount = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.view.View[contains(@content-desc,'$')])[4]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> transactionInfoLbl = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Transaction info']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> creditCrdLbl = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Credit card']"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> creditcardNumber = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[@index='18']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> prestoPlanLbl = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Presto plan']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> prestoplanName = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Road Trip']"));
        ////*[@index='20']
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> receiptLbl = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Receipt ID']"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> receiptId = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'CP-')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> haveQuestionText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Have questions regarding your receipt? Reach out to \n" +
                "support.\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> supportMail = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='support@prestocharging.com']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> backButton = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc='Back']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> downloadReceiptBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Download receipt\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> downloadReceiptImage = new HashMap<String, By>() {{
        put("Android", AppiumBy.id("android:id/content_preview_image_1_large"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> downloadReceiptModalQuickShare = new HashMap<String, By>() {{
        put("Android", AppiumBy.id("android:id/chooser_nearby_button"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> downloadReceiptModalEditBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.id("android:id/chooser_edit_button"));
        put("iOS", AppiumBy.xpath(""));
    }};
    public InterimReceiptPage(AppiumDriver driver) {
        super(driver);
    }

    public InterimReceiptPage sessionDetailsValidation() {
       Assert.assertTrue(Actions.isDisplayedCheck(sessionDetailsLbl, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(timerValue, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(energyValue, 30, 1000));
        return this;
    }
    public InterimReceiptPage elementBeforeSessionDetails() {
        Assert.assertTrue(Actions.isDisplayedCheck(chargingdateAndTime, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(stationName, 30, 1000));
        String additionalFeeText= Actions.getAttributeValue(additionalFeesText,30,1000,"content-desc");
        Assert.assertEquals(additionalFeeText, Constants.ADDITIONAL_FEE_TEXT);
        Assert.assertTrue(Actions.isDisplayedCheck(totalPaidLbl, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(totalPaidAmount, 30, 1000));
        return this;
    }
    public InterimReceiptPage costSummaryValidation() {
        Actions.scrollElement("Road Trip");
        Assert.assertTrue(Actions.isDisplayedCheck(costSummaryLbl, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(energyFeeLbl, 30, 1000));
      // String energytext= Actions.getAttributeValue(energyFeeText,30,1000,"content-desc");
        //Assert.assertEquals(energytext, Constants.ENERGY_FEE_TEXT);
        Assert.assertTrue(Actions.isDisplayedCheck(energyFeeAmount, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(sessionFeeLbl, 30, 1000));
       // String sessiontext= Actions.getAttributeValue(sessionFeeText,30,1000,"content-desc");
        //Assert.assertEquals(sessiontext, Constants.SESSION_FEE_TEXT);
        Assert.assertTrue(Actions.isDisplayedCheck(sessionFeeAmount, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(taxLbl, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(taxAmount, 30, 1000));
        return this;
    }
    public InterimReceiptPage transactionInfo() {
        Actions.scrollElement("Have questions regarding your receipt? Reach out to");
        Assert.assertTrue(Actions.isDisplayedCheck(creditCrdLbl, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(creditcardNumber, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(prestoPlanLbl, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(prestoplanName, 30, 1000));
        String planName= Actions.getAttributeValue(prestoplanName,30,1000,"content-desc");
        System.out.println("plan name"+planName);
        Assert.assertEquals(planName, Constants.PRESTO_PLAN_NAME);
        Assert.assertTrue(Actions.isDisplayedCheck(receiptLbl, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(receiptId, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(haveQuestionText, 30, 1000));
        String haveAQuestion= Actions.getAttributeValue(haveQuestionText,30,1000,"content-desc");
        Assert.assertEquals(haveAQuestion, Constants.HAVE_QUESTION_TEXT);
//        Assert.assertTrue(Actions.isDisplayedCheck(supportMail, 30, 1000));
//        String supportMailValue= Actions.getAttributeValue(supportMail,30,1000,"content-desc");
//        Assert.assertEquals(supportMailValue, Constants.SUPPORT_MAIL);
        return this;
    }
    public InterimReceiptPage clickOnBackButton() {
        Actions.clickElement(backButton,30,1000);
        return this;
    }
    public InterimReceiptPage VerifyDownloadReceiptBtn() {
        Actions.isDisplayedCheck(downloadReceiptBtn,30,1000);
        return this;
    }
    public InterimReceiptPage clickDownloadReceiptBtn() {
        Actions.scrollElement("support");
        Actions.clickElement(downloadReceiptBtn,30,1000);
        return this;
    }
    public InterimReceiptPage VerifyDownloadReceiptModal() {
        Actions.isDisplayedCheck(downloadReceiptImage,30,1000);
        Actions.isDisplayedCheck(downloadReceiptModalQuickShare,30,1000);
        Actions.isDisplayedCheck(downloadReceiptModalEditBtn,30,1000);
        return this;
    }
}
