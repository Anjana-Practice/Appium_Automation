package pageobjects;

import config.Constants;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Actions;

import java.util.HashMap;


public class SignInPage extends BasePage {
    private final HashMap<String, By> txtEmail = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.widget.EditText"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> txtPassword = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ScrollView/android.view.View[3]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> btnContinue = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.Button[@content-desc=\"Continue\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> lblLogged = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Welcome to the team, Rayan!\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};

private final HashMap<String, By> LblErrorInvalidLogin = new HashMap<String, By>() {{
    put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"We didn't recognize this email or password.\"]"));
    put("iOS", AppiumBy.xpath(""));
}};
    public SignInPage(AppiumDriver driver) {
        super(driver);
    }

    public SignInPage enterEmail(String email) {
        Actions.clickElement(txtEmail, 30, 10000);
        Actions.sendText(txtEmail, email, 30, 10000);
        return this;
    }

    public SignInPage enterPassword() {
        Actions.clickElement(txtPassword, 30, 10000);
        return this;
    }
//android.widget.Button[@content-desc="Continue"]
   public SignInPage clickContinue() {
        Actions.scrollElement("Continue");
    Actions.clickElement(btnContinue, 30, 10000);
    return this;
    }
    public boolean welcomeNoteDisplay() {
        boolean isWelcomeDisplayed=Actions.isDisplayedCheck(lblLogged, 30, 10000);
        return isWelcomeDisplayed;
    }
    public SignInPage loggedInValidation() {
       Assert.assertEquals(Actions.getAttributeValue(lblLogged, 30, 10000,"content-desc"),Constants.TEXT_AFTER_LOGGEDIN);
        return this;
    }
    public SignInPage invalidLoginValidation() {
        Assert.assertEquals(Actions.getAttributeValue(LblErrorInvalidLogin, 30, 10000,"content-desc"),Constants.INVALID_LOGIN_ERROR);
        return this;
    }
}
