package pageobjects;

import config.Constants;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Actions;

import java.util.HashMap;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ChargingCompletedPage extends BasePage {

    private final HashMap<String, By> illustrationIcon = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[13]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> summaryText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Summary']]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> viewInterimReceipt = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='View interim receipt']"));
        //android.view.View[contains(@content-desc,'ChargeP')]
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> timer = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'min')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> energy = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[contains(@content-desc,'kWh')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> speed = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.view.View[contains(@content-desc,'kW')])[2]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> energyLbl = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Energy']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> dollarEnergy = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.view.View[contains(@content-desc,'$')])[1]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> sessionFee = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Session fee']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> sessionFeeDollar = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.view.View[contains(@content-desc,'$')])[2]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> tax = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Tax']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> taxDollar = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.view.View[contains(@content-desc,'$')])[3]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> total = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Total']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> totalDollar = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//android.view.View[contains(@content-desc,'$')])[4]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> done = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc='Done']"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> chargingCompletedTextInSummary = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Charging completed']"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> prestoPassMessage = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Congrats on saving with PrestoPass!']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    public ChargingCompletedPage(AppiumDriver driver) {
        super(driver);
    }

    public ChargingCompletedPage isIllustrationIconDisplayed() {
        Actions.isDisplayedCheck(illustrationIcon, 30, 1000);
        return this;
    }
    public ChargingCompletedPage isSummaryDisplayed() {
        Actions.isDisplayedCheck(summaryText, 30, 1000);
        Actions.isDisplayedCheck(viewInterimReceipt, 30, 1000);
        return this;
    }
    public ChargingCompletedPage iconCheck() {
        Actions.isDisplayedCheck(timer, 30, 1000);
        Actions.isDisplayedCheck(energy, 30, 1000);
        Actions.isDisplayedCheck(speed, 30, 1000);
        return this;
    }
    public ChargingCompletedPage feeSectionCheck() {
        Actions.isDisplayedCheck(energy, 30, 1000);
        Actions.isDisplayedCheck(sessionFee, 30, 1000);
        Actions.isDisplayedCheck(tax, 30, 1000);
        Actions.isDisplayedCheck(total, 30, 1000);
        Actions.isDisplayedCheck(dollarEnergy, 30, 1000);
        Actions.isDisplayedCheck(sessionFeeDollar, 30, 1000);
        Actions.isDisplayedCheck(taxDollar, 30, 1000);
        Actions.isDisplayedCheck(totalDollar, 30, 1000);
        return this;
    }
    public ChargingCompletedPage doneButtonValidation() {
        Actions.isDisplayedCheck(done, 30, 1000);
        return this;
    }

    public ChargingCompletedPage viewInterimReceipt() {
        Actions.isDisplayedCheck(viewInterimReceipt, 30, 1000);
        Actions.clickElement(viewInterimReceipt, 30, 1000);
        return this;
    }
    public ChargingCompletedPage prestoPassMessageValidation() {
       String prestoMessage= Actions.getAtributeValue(prestoPassMessage, 30, 1000,"content-desc");
        Assert.assertEquals(prestoMessage,Constants.PRESTOPASS_MESSAGE);
        return this;
    }
    public ChargingCompletedPage clickOnDone() {
        Actions.clickElement(done, 30, 1000);
        return this;
    }
}
