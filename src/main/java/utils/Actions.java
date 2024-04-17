package utils;

import config.WebDriverContext;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.AppiumFluentWait;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Duration;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;


import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

public class Actions {


    public static String getText(HashMap<String, By> locator, int timeoutInSec, int pollingIntervalInMilliSec) {
        By element = getElement(locator);
        WebElement clickable = getElement(ExpectedConditions.elementToBeClickable(element), timeoutInSec, pollingIntervalInMilliSec);
        if (clickable != null) {
            return clickable.getText();
        }
        return "";
    }

    public static void keyStoreEventOnAndroid() throws InterruptedException {
        Thread.sleep(1000);
        AndroidDriver androidDriver = (AndroidDriver) WebDriverContext.getDriver();
        androidDriver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
        Thread.sleep(500);
        androidDriver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
        Thread.sleep(500);
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
        Thread.sleep(500);
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
        Thread.sleep(500);
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
        Thread.sleep(500);
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
        Thread.sleep(2000);

    }
    public static void keyStoreEventOnAndroidPassword() throws InterruptedException {
        Thread.sleep(1000);
        AndroidDriver androidDriver = (AndroidDriver) WebDriverContext.getDriver();
        androidDriver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
        Thread.sleep(500);
        androidDriver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
        Thread.sleep(500);
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_1));
        Thread.sleep(500);
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_2));
        Thread.sleep(500);
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_3));
        Thread.sleep(500);
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_4));
        Thread.sleep(500);
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_5));
        Thread.sleep(500);
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_6));
        Thread.sleep(500);
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_7));
        Thread.sleep(500);
        androidDriver.pressKey(new KeyEvent(AndroidKey.DIGIT_8));
        Thread.sleep(2000);

    }

    public static void sendText(HashMap<String, By> locator, String text, int timeoutInSec, int pollingIntervalInMilliSec) {
        By element = getElement(locator);
        WebElement interacted = getElement(ExpectedConditions.elementToBeClickable(element), timeoutInSec, pollingIntervalInMilliSec);
        if (interacted != null && interacted.isEnabled()) {
            interacted.clear();
            interacted.sendKeys(text);
            return;
        }
        Assert.fail("unable to enter text on locator  >>>>>" + element.toString());
    }


    public static void clickElement(HashMap<String, By> locator, int timeoutInSec, int pollingIntervalInMilliSec) {
        By element = getElement(locator);
        WebElement clickable = getElement(ExpectedConditions.elementToBeClickable(element), timeoutInSec, pollingIntervalInMilliSec);
        if (clickable != null) {
            clickable.click();
            return;
        }
        Assert.fail("unable to click on locator  >>>>>" + element.toString());
    }

    public static WebElement getClickableElement(HashMap<String, By> locator, int timeoutInSec, int pollingIntervalInMilliSec) {
        return getElement(ExpectedConditions.elementToBeClickable(getElement(locator)), timeoutInSec, pollingIntervalInMilliSec);
    }

    private static By getElement(HashMap<String, By> locator) {
        return WebDriverContext.getDriver().getCapabilities().getPlatformName().name().toLowerCase().equalsIgnoreCase("Android") ? locator.get("Android") : locator.get("iOS");
    }

    private static WebElement getElement(Function func, int timeoutInSec, int pollingIntervalInMilliSec) {
        WebElement element;
        AppiumDriver driver = WebDriverContext.getDriver();
        String locator = func.toString().substring(func.toString().indexOf("By")); //hacky
        long startTime = System.currentTimeMillis();
        try {
            AppiumFluentWait wait = (AppiumFluentWait) new AppiumFluentWait<>(driver)
                    .ignoring(NoSuchElementException.class, WebDriverException.class)
                    .withTimeout(Duration.ofSeconds(timeoutInSec))
                    .pollingEvery(Duration.ofMillis(pollingIntervalInMilliSec));
            driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
            element = (WebElement) wait.until(By -> func.apply(By));
        } catch (Exception ex) {
            Log.error(locator + " >>>>>> Exception in identify the element" + ex.getMessage());
            return null;
        }
        long endTime = System.currentTimeMillis();
        Log.info(locator + " >>>>>> Identified in " + (endTime - startTime) + " ms");
        return element;
    }

    public static Boolean isDisplayedCheck(HashMap<String, By> locator, int timeoutInSec, int pollingIntervalInMilliSec) {
        By element = getElement(locator);
        WebElement displayCheck = getElement(ExpectedConditions.visibilityOfElementLocated(element), timeoutInSec, pollingIntervalInMilliSec);
        if (displayCheck != null) {
            return displayCheck.isDisplayed();
        }

        return false;
    }

    public static Boolean isSelectedCheck(HashMap<String, By> locator, int timeoutInSec, int pollingIntervalInMilliSec) {
        By element = getElement(locator);
        WebElement selectedCheck = getElement(ExpectedConditions.elementToBeClickable(element), timeoutInSec, pollingIntervalInMilliSec);
        if (selectedCheck != null) {
            //   return selectedCheck.isSelected();
            return selectedCheck.isSelected();
        }

        return false;
    }

    public static String getAttributeValue(HashMap<String, By> locator, int timeoutInSec, int pollingIntervalInMilliSec, String attributeName) {
        By element = getElement(locator);
        WebElement clickable = getElement(ExpectedConditions.visibilityOfElementLocated(element), timeoutInSec, pollingIntervalInMilliSec);
        if (clickable != null) {
            return clickable.getAttribute(attributeName);
        }
        return "";
    }

    public static void clearElement(HashMap<String, By> locator, int timeoutInSec, int pollingIntervalInMilliSec) {
        By element = getElement(locator);
        WebElement clearElement = getElement(ExpectedConditions.visibilityOfElementLocated(element), timeoutInSec, pollingIntervalInMilliSec);
        clearElement.clear();
    }

    public static void scrollElement(String element) {
        AppiumDriver driver = WebDriverContext.getDriver();
        driver.findElement(new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().descriptionContains(\"" + element + "\").instance(0))"));
    }

    public static String getAtributeValue(HashMap<String, By> locator, int timeoutInSec, int pollingIntervalInMilliSec, String atributename) {
        By element = getElement(locator);
        WebElement clickable = getElement(ExpectedConditions.elementToBeClickable(element), timeoutInSec, pollingIntervalInMilliSec);
        if (clickable != null) {
            return clickable.getAttribute(atributename);
        }
        return "";
    }
    public static void swipeFromOneCoordinateToOther(HashMap<String, By> locator, int timeoutInSec, int pollingIntervalInMilliSec) {
        AppiumDriver driver = WebDriverContext.getDriver();
        By element = getElement(locator);
        WebElement Element = getElement(ExpectedConditions.visibilityOfElementLocated(element), timeoutInSec, pollingIntervalInMilliSec);
        Point location = Element.getLocation();
        Dimension size = Element.getSize();
        int startX = location.getX() + size.getWidth() / 2;
        int startY = location.getY() + size.getHeight() / 2;
        int endX = location.getX() + size.getWidth() * 10 / 2;
        int endY = startY;
        TouchAction swipe = new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(startX, startY))
                .waitAction(waitOptions(ofMillis(800)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();

    }
    public static void swipeFromOneCoordinateToOtherUsingUserProvidedCord() {
        AppiumDriver driver = WebDriverContext.getDriver();
        int startX =780;
        int startY =1781;
        int endX =46;
        int endY =1762;
        TouchAction swipe = new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(startX, startY))
                .waitAction(waitOptions(ofMillis(800)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();

    }
    public static void swipeFromRightToLeft() {
        AppiumDriver driver = WebDriverContext.getDriver();
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.8);
        int startY = size.height / 2;
        int endX = (int) (size.width * 0.2);
        int endY = startY;
        TouchAction swipe = new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(startX, startY))
                .waitAction(waitOptions(ofMillis(800)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();
    }

    public static void hideKeyboard(){
        AndroidDriver androidDriver = (AndroidDriver) WebDriverContext.getDriver();
        androidDriver.hideKeyboard();
    }
    public static void lockDevice() {
        AndroidDriver androidDriver = (AndroidDriver) WebDriverContext.getDriver();
        androidDriver.lockDevice();
    }
    public static void unlockDevice() {
        AndroidDriver androidDriver = (AndroidDriver) WebDriverContext.getDriver();
        androidDriver.unlockDevice();
    }
    public static void waitFor(int timeToWait) {
        AppiumDriver driver = WebDriverContext.getDriver();
        driver.manage().timeouts().implicitlyWait(timeToWait,TimeUnit.SECONDS);
    }
    public static void keyClearOTP() throws InterruptedException {
        Thread.sleep(1000);
        AndroidDriver androidDriver = (AndroidDriver) WebDriverContext.getDriver();
        androidDriver.pressKey(new KeyEvent(AndroidKey.DPAD_LEFT));
        androidDriver.pressKey(new KeyEvent(AndroidKey.DEL));
        Thread.sleep(500);

        androidDriver.pressKey(new KeyEvent(AndroidKey.DEL));
        Thread.sleep(500);

        androidDriver.pressKey(new KeyEvent(AndroidKey.DEL));
        Thread.sleep(500);

        androidDriver.pressKey(new KeyEvent(AndroidKey.DEL));

    }
    public static void swipeUp() {
        AppiumDriver driver = WebDriverContext.getDriver();
        int startX =503;
        int startY =569;
        int endX =526;
        int endY =164;
        TouchAction swipe = new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(startX, startY))
                .waitAction(waitOptions(ofMillis(800)))
                .moveTo(PointOption.point(endX, endY))
                .release()
                .perform();

    }

}
