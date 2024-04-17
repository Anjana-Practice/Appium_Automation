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

public class HomePage extends BasePage {

    private final HashMap<String, By> hamburgerIcon = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> hamburgerIconName = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath(" //android.widget.Switch[contains(@content-desc,\"Rayan\")]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    public HomePage(AppiumDriver driver) {
        super(driver);
    }

    public HomePage clickhamburgerIcon() {
        Actions.clickElement(hamburgerIcon, 30, 1000);
        return this;
    }

    public HomePage NameInHamburger() {
        Actions.isDisplayedCheck(hamburgerIconName, 30, 1000);
        return this;
    }
   /*  public HomePage selectPlanTextValidation() {
        String selectPlanTextValidation = Actions.getAttributeValue(selectPlanText, 30, 1000, "content-desc");
        Assert.assertEquals(selectPlanTextValidation, Constants.SELECT_PLAN_TEXT);
        return this;
    }*/

}