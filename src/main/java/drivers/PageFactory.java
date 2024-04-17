package drivers;

import java.lang.reflect.InvocationTargetException;

import config.WebDriverContext;
import io.appium.java_client.AppiumDriver;
import pageobjects.BasePage;

public class PageFactory {

    public static <T extends BasePage> T getInstance(Class<T> type) {
        try {
            return type.getConstructor(AppiumDriver.class).newInstance(WebDriverContext.getDriver());
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                 | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }
}
