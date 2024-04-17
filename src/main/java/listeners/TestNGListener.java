package listeners;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import config.WebDriverContext;
import drivers.DriverType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import drivers.DriverFactory;

import org.testng.xml.XmlTest;
import utils.Log;

@Listeners({ ReportListener.class, LogListener.class })
public class TestNGListener {

    @BeforeSuite(alwaysRun = true)
    public void globalSetup() {
        Log.setTestCaseName("suite");
        Log.info("************************** Test Suite Started ************************************");
    }

    @AfterSuite(alwaysRun = true)
    public void wrapAllUp() {
        Log.info("************************** Test Suite Finished ************************************");
    }

    @BeforeTest
    protected void setup(ITestContext context) {
        Log.info("************************** Class <"+ context.getCurrentXmlTest().getName() +"> started ************************************");
    }

    @BeforeMethod
    protected void setupBeforeMethod(Method method, ITestContext context,  ITestResult result){
        try{
            Log.info("============================ Method <"+ method.getName() +"{"+ result.getParameters()[0] +"}" +"> started ==============================");
            String nameOfTest=   result.getTestName() != null ? result.getTestName()
                    : result.getMethod().getConstructorOrMethod().getName();
            System.out.println("nameOfTest"+nameOfTest);
            DriverFactory.getDriver((String)result.getParameters()[0], context.getCurrentXmlTest().getAllParameters(),nameOfTest);
        }catch(Exception ex){
            Log.error("exception occurred in launching the driver....!!!!"+ ex.getMessage());
            Log.error(Arrays.stream(ex.getStackTrace())
                    .map(StackTraceElement::toString)
                    .collect(StringBuilder::new, (sb, str) -> sb.append(str).append("\n"), StringBuilder::append)
                    .toString());
            Assert.fail("Exception in the driver launch ---> "+ ex.getMessage());
        }
    }

    @AfterMethod
    protected void methodTearDown(Method method, ITestResult result){
        WebDriverContext.getDriver().quit();
        WebDriverContext.removeDriver();
        Log.info("============================ Method <"+ method.getName()+"{"+ result.getParameters()[0] +"}"  +"> ended ==============================");
    }

    @AfterTest
    public void tearDown(ITestContext context, XmlTest xmlTest) {
        Log.info("************************** Class <"+ context.getCurrentXmlTest().getName()  +"> ended ************************************");
    }

    @DataProvider (name= "platforms")
    public Object[][] provideExecutionPlatforms(ITestContext context){
        String[] platforms;
        if(System.getenv().containsKey("GITHUB_ACTIONS"))
            platforms = System.getenv("DEVICE_LIST").split(",");
        else
            platforms = context.getCurrentXmlTest().getParameter("executionPlatforms").split(",");
        Log.info(Arrays.toString(platforms));
        Object[][] allPlatform = new Object[platforms.length][1];
        for (int i = 0; i < platforms.length; i++) {
            allPlatform[i][0] = platforms[i];
        }
        return allPlatform;
    }

}
