package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utils.Log;

public class LogListener implements ITestListener {

    public String getTestName(ITestResult result) {
        return result.getTestName() != null ? result.getTestName()
                : result.getMethod().getConstructorOrMethod().getName();
    }

    public String getTestDescription(ITestResult result) {
        return result.getMethod().getDescription() != null ? result.getMethod().getDescription() : getTestName(result);
    }

    @Override
    public void onTestStart(ITestResult result) {
        Log.info(getTestName(result) + ": Test started");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        Log.info(getTestName(result) + " : Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Throwable t = result.getThrowable();
        String failureReason = "";
        if (t != null)
            failureReason = t.getMessage();
        Log.getLogger().error(getTestName(result) + " : Test Failed : " + failureReason);
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        Log.info(getTestName(result) + " : Test Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    @Override
    public void onStart(ITestContext context) {
    }

    @Override
    public void onFinish(ITestContext context) {
    }

}