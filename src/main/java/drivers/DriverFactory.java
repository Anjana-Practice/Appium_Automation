package drivers;

import config.WebDriverContext;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import utils.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class DriverFactory {

    private DriverFactory() {
    }

    public static AppiumDriver getDriver(String config, Map<String, String> testParameters,String testName) throws Exception {
        AppiumDriver driver;
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", config.split(":")[1]);
        capabilities.setCapability("platformVersion", config.split(":")[2]);
        capabilities.setCapability("platformName", "android");
        capabilities.setCapability("geoLocation", "IN");
        capabilities.setCapability("gpsLocation", "11.09240,75.88557");


        if (testName.contains("lossyNetwork")) {
            capabilities.setCapability("networkProfile", "4g-lte-advanced-lossy");
            //4g-lte-high-latency

        }
        if (config.contains("Android") && testParameters.get("host").equals("local")) {
            capabilities.setCapability("automationName", "UiAutomator2");
            capabilities.setCapability("app", testParameters.get("androidApp"));
        } else if (config.contains("iOS") && testParameters.get("host").equals("local")) {
            capabilities.setCapability("automationName", "XCUITest");
            capabilities.setCapability("app", testParameters.get("iosApp"));
        } else if (testParameters.get("host").equals("BrowserStack")) {
            System.out.println("loop inside");
            if (System.getenv().containsKey("GITHUB_ACTIONS"))
                testParameters = getDataFromEnv(testParameters);
            capabilities.setCapability("app", config.contains("Android") ? testParameters.get("browserStackAndroidApp")
                    : testParameters.get("BrowserStackiOSApp"));
            capabilities.setCapability("project", testParameters.get("projectName"));
            capabilities.setCapability("build", testParameters.get("build"));
            capabilities.setCapability("name",
                    new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss").format(Calendar.getInstance().getTime()));
            capabilities.setCapability("browserstack.debug", "true");

        } else {
            throw new IllegalStateException(
                    "Parameter executionPlatforms configuration looks wrong in the testng xml! Please revisit and fix it!");
        }
        for (Map.Entry<String, String> entry : testParameters.entrySet()) {
            Log.info("<"+ entry.getKey() + ">:<" + entry.getValue()+ ">");
        }
        capabilities.setCapability("platformName", "android");
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
        browserstackOptions.put("appiumVersion", "1.21.0");
        capabilities.setCapability("bstack:options", browserstackOptions);
        driver = getDriver(capabilities, new URL(testParameters.get("endpoint")), config.split(":")[0]);
        WebDriverContext.setDriver(driver);
        return driver;
    }

    private static AppiumDriver getDriver(DesiredCapabilities capabilities, URL url, String platformName) throws MalformedURLException {
        AppiumDriver driver;
        Log.info("driver information >>>>>>" + capabilities.toString());
        if (platformName.equalsIgnoreCase("Android")) {
            System.out.println("url is " + url);
        //    String test= "https://anjanaprakash_7YqjtF:GGTPtZApzycqFRLLpx68@hub.browserstack.com/wd/hub";
            String test= "https://anjanaprakash_hHWeNt:t5KuKWzMqgRpyWCLhm87@hub.browserstack.com/wd/hub";
            System.out.println(capabilities);
            System.out.println(new URL(test));
            driver = new AndroidDriver(new URL(test), capabilities);
        } else {
            driver = new IOSDriver(url, capabilities);
        }
        return driver;
    }

    private static Map<String, String> getDataFromEnv(Map<String, String> testData) {
        if (!testData.isEmpty()) {
            testData.put("browserStackAndroidApp", System.getenv("ANDROID_BUILD"));
            testData.put("BrowserStackiOSApp", System.getenv("IOS_BUILD"));
            testData.put("endpoint", System.getenv("BROWSER_STACK_HUB_URL"));
            testData.put("build", "Regression on "+ new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime())+ "("+ System.getenv("GITHUB_RUN_NUMBER") +")");
        }
        return testData;
    }

}
