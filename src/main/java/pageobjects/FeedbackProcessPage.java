package pageobjects;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import listeners.TestNGListener;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Actions;

import java.util.HashMap;
import java.util.Map;

import static org.testng.Assert.assertTrue;

public class FeedbackProcessPage extends BasePage {


    public FeedbackProcessPage(AppiumDriver driver) {
        super(driver);
    }


    private final HashMap<String, By> positiveFeedbackIcon = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@index='0']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> reviewPopUp = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@content-desc=\"Thanks for reviewing!\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};


    private final HashMap<String, By> negativeFeedbackIcon = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageView[@index='1']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> close = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[1]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> negativeReviewBox = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"What could have been better?\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> selectReviewTile1 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Charging speed\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> selectReviewTile2 = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Session start\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> feedbackSubmitBtn = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Submit feedback\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> inputFeedback = new HashMap<String, By>() {{
        put("Android", AppiumBy.className("android.widget.EditText"));
        put("iOS", AppiumBy.xpath(""));
    }};


    public FeedbackProcessPage clickPositiveReview(){
        Actions.clickElement(positiveFeedbackIcon, 30, 1000);
        return this;
    }
    public FeedbackProcessPage clickNegativeReview() {
        Actions.clickElement(negativeFeedbackIcon, 30, 1000);
        return this;
    }
    public FeedbackProcessPage verifyReviewPopUp(){
        boolean isShown = Actions.isDisplayedCheck(reviewPopUp, 30, 1000);
        assertTrue(isShown,"Review pop up not found");
        return this;
    }
    public FeedbackProcessPage verifyReviewBox(){
        boolean isShown = Actions.isDisplayedCheck(negativeReviewBox, 30, 1000);
        assertTrue(isShown,"Review box not found");
        return this;
    }
    public FeedbackProcessPage clickReviewTile1() {
        Actions.clickElement(selectReviewTile1, 30, 1000);
        return this;
    }
    public FeedbackProcessPage clickReviewTile2() {
        Actions.clickElement(selectReviewTile2, 30, 1000);
        return this;
    }

    public FeedbackProcessPage clickSubmitBtn() {
        Actions.clickElement(feedbackSubmitBtn, 30, 1000);
        return this;
    }
    public FeedbackProcessPage enterFeedback(String feedback) {
        Actions.sendText(inputFeedback, feedback, 30, 10000);
        return this;
    }


    public FeedbackProcessPage clickInputFeedback() {
        Actions.clickElement(inputFeedback, 30, 1000);
        return this;
    }

}
