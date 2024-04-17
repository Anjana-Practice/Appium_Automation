package utils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.relevantcodes.extentreports.LogStatus;
import config.WebDriverContext;
import report.ExtentReport;


public class Report {

    public static void addScreenShot(String message) {
        String base64Image = "data:image/png;base64,"
                + ((TakesScreenshot) WebDriverContext.getDriver()).getScreenshotAs(OutputType.BASE64);
        ExtentReport.getCurrentTest().log(LogStatus.INFO, message,
                ExtentReport.getCurrentTest().addScreenCapture(base64Image));
    }

    public static void addScreenShot(LogStatus status, String message) {
        String base64Image = "data:image/png;base64,"
                + ((TakesScreenshot) WebDriverContext.getDriver()).getScreenshotAs(OutputType.BASE64);
        ExtentReport.getCurrentTest().log(status, message,
                ExtentReport.getCurrentTest().addScreenCapture(base64Image));
    }

    public static void logMessage(String message, String details) {
        ExtentReport.getCurrentTest().log(LogStatus.INFO, message, details);
    }

    public static void logMessage(LogStatus status, String message, String details) {
        ExtentReport.getCurrentTest().log(status, message, details);
    }
}
