package pageobjects;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Actions;

import java.util.HashMap;

public class AccountVehiclePage extends BasePage{
    private final HashMap<String, By> editVehicle = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@index=\"2\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> bmw = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"BMW\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> audi = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Audi\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> bmwi4Vehicle = new HashMap<String, By>(){{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"i4\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> editYourVehicleText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Edit your vehicle\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> audiModel = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc=\"Q4 e-tron\"]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> vehicleSearchBar = new HashMap<String, By>() {{
        put("Android", AppiumBy.className("android.widget.ImageView"));
        put("iOS", AppiumBy.xpath(""));
    }};
    public AccountVehiclePage(AppiumDriver driver) {
        super(driver);
    }
    public AccountVehiclePage clickVehicleToEdit() {
        Actions.clickElement(editVehicle, 30, 2000);
        return this;
    }

    public AccountVehiclePage clickBmw() {
        Actions.clickElement(bmw, 30, 2000);
        return this;
    }

    public AccountVehiclePage clickAudi() {
        Actions.clickElement(audi, 30, 2000);
        return this;
    }
    public AccountVehiclePage verifyEditVehicleText() {
        Assert.assertTrue(Actions.isDisplayedCheck(editYourVehicleText, 30, 1000));
        return this;
    }
    public AccountVehiclePage selectBmwModel() {
        Actions.clickElement(bmwi4Vehicle, 30, 2000);
        return this;
    }
    public AccountVehiclePage clickSearchField() {
        Actions.clickElement(vehicleSearchBar, 30, 2000);
        return this;
    }
    public AccountVehiclePage clickAudiModel() {
        Actions.clickElement(audiModel, 30, 2000);
        return this;
    }
    public AccountVehiclePage enterVehicleName(String vehicleBrand) {
        Actions.sendText(vehicleSearchBar, vehicleBrand, 30, 10000);
        return this;
    }
}
