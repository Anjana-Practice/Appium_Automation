package tests;

import config.Constants;
import drivers.PageFactory;
import listeners.TestNGListener;
import org.testng.annotations.Test;
import pageobjects.*;
import pageobjects.AccountPage;
import pageobjects.AccountSettingsPage;
import pageobjects.LaunchPage;
import pageobjects.SignInPage;
import utils.Actions;
import utils.Log;

public class LoginTest extends TestNGListener {
    LaunchPage launchPage;
    FilterPage filter;
    SignInPage login;
    MapPage map;
    ChargingProcessPage chargeProcess;
    AccountPage account;
    HomePage home;
    AccountSettingsPage settings;
    @Test(dataProvider = "platforms", testName = "Login Functionality-Valid", description = "care crown login validation with valid credentials")
    public void loginIntoApplicationValidCase(String platform) throws InterruptedException {
        launchPage = PageFactory.getInstance(LaunchPage.class);
        login = PageFactory.getInstance(SignInPage.class);
        filter = PageFactory.getInstance(FilterPage.class);
        chargeProcess = PageFactory.getInstance(ChargingProcessPage.class);
        map = PageFactory.getInstance(MapPage.class);
        account = PageFactory.getInstance(AccountPage.class);
        home = PageFactory.getInstance(HomePage.class);

        LaunchPage launchPage = PageFactory.getInstance(LaunchPage.class);
        launchPage.clickGetStarted().clickLogin();
        login.enterEmail(Constants.EMAIL).enterPassword();
        Actions.keyStoreEventOnAndroidPassword();
        login.clickContinue();
        if (login.welcomeNoteDisplay()) {
            login.loggedInValidation();
        } else {
            home.clickhamburgerIcon().NameInHamburger();
        }
    }
    @Test(dataProvider = "platforms", testName = "Login Functionality-Invalid", description = "care crown login validation with invalid credentials")
    public void loginIntoApplicationInvalidCase(String platform) throws InterruptedException {
        launchPage = PageFactory.getInstance(LaunchPage.class);
        login = PageFactory.getInstance(SignInPage.class);
        home = PageFactory.getInstance(HomePage.class);

        LaunchPage launchPage = PageFactory.getInstance(LaunchPage.class);
        launchPage.clickGetStarted().clickLogin();
        login.enterEmail(Constants.INVALID_EMAIL).enterPassword();
        Actions.keyStoreEventOnAndroidPassword();
        login.clickContinue();
        login.invalidLoginValidation();
    }
}

