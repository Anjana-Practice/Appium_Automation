package config;

import io.appium.java_client.AppiumDriver;

public class WebDriverContext {
    private static InheritableThreadLocal<AppiumDriver> driverinstance = new InheritableThreadLocal<>();

    public static AppiumDriver getDriver() {
        if (driverinstance.get() == null)
            throw new IllegalStateException(
                    "WebDriver has not been set, Please set WebDriver instance by WebDriverContext.setDriver...");
        else
            return driverinstance.get();
    }

    public static void setDriver(AppiumDriver driver) {
        driverinstance.set(driver);
    }

    public static void removeDriver() {
        driverinstance.remove();
    }
}