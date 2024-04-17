package listeners;

import config.WebDriverContext;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.json.simple.JSONObject;
import com.relevantcodes.extentreports.LogStatus;
import report.ExtentReport;
import utils.Log;
import utils.Report;

public class ReportListener implements ITestListener {

    public String getTestName(ITestResult result) {
        return result.getTestName() != null ? result.getTestName()
                : result.getMethod().getConstructorOrMethod().getName();
    }

    public String getTestDescription(ITestResult result) {
        return result.getMethod().getDescription() != null ? result.getMethod().getDescription() : getTestName(result);
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentReport.startTest(getTestName(result), getTestDescription(result));
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        if(WebDriverContext.getDriver().getRemoteAddress().toString().contains("browserstack.com")){
            final JavascriptExecutor jse = (JavascriptExecutor) WebDriverContext.getDriver();
            JSONObject executorObject = new JSONObject();
            JSONObject argumentsObject = new JSONObject();
            argumentsObject.put("name", "<test-name>");
            argumentsObject.put("status", "passed");
            executorObject.put("action", "setSessionStatus");
            executorObject.put("arguments", argumentsObject);
            jse.executeScript(String.format("browserstack_executor: %s", executorObject));
            String testName = String.format("browserstack_executor: {\"action\": \"setSessionName\", \"arguments\": {\"name\":\"%s \" }}", result.getMethod().getMethodName()+"["+ result.getMethod().getDescription() +"]");
            jse.executeScript(testName);
        }
        Report.addScreenShot(LogStatus.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Throwable t = result.getThrowable();
        String failureMessage = "";
        if (t != null)
            failureMessage = t.getMessage();
        Report.addScreenShot(LogStatus.FAIL, "Test Failed : " + failureMessage);
        Log.error("Failure stackTrace message >>>>> "+failureMessage);
        if(WebDriverContext.getDriver().getRemoteAddress().toString().contains("browserstack.com")) {
            final JavascriptExecutor jse = (JavascriptExecutor) WebDriverContext.getDriver();
            JSONObject executorObject = new JSONObject();
            JSONObject argumentsObject = new JSONObject();
            argumentsObject.put("status", "failed");
            argumentsObject.put("reason", failureMessage);
            executorObject.put("action", "setSessionStatus");
            executorObject.put("arguments", argumentsObject);
            jse.executeScript(String.format("browserstack_executor: %s", executorObject));
            String testName = String.format("browserstack_executor: {\"action\": \"setSessionName\", \"arguments\": {\"name\":\"%s \" }}", result.getMethod().getMethodName()+"["+ result.getMethod().getDescription() +"]");
            jse.executeScript(testName);
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReport.endCurrentTest();
        ExtentReport.getExtentReports().flush();
    }

}
