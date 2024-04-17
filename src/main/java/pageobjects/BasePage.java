package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import listeners.TestNGListener;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected AppiumDriver driver;

    public BasePage(AppiumDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
