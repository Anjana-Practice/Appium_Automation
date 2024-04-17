package config;

import utils.Actions;

public class Constants {
    public final static String WORKING_DIRECTORY = System.getProperty("user.dir");
    public final static String REPORT_DIRECTORY = WORKING_DIRECTORY + "/ExtentReports/AutomationResult.html";
    public final static String EXTENT_CONFIG_PATH = WORKING_DIRECTORY + "/src/main/java/config/extent-config.xml";
    public final static String PROJECT_NAME = "CARE_CROWN APPIUM TEST AUTOMATION";
    public final static String PROPERTY_FILE_PATH = WORKING_DIRECTORY + "/src/main/java/config/test.properties";

    /////crown
    public final static String EMAIL = "rayantest@gmail.com";
    public final static String INVALID_EMAIL = "test@gmail.com";
    public final static String PASSWORD = "12345678";
    public final static String TEXT_AFTER_LOGGEDIN = "Welcome to the team, Rayan!";
    public final static String INVALID_LOGIN_ERROR = "We didn't recognize this email or password.";
    public final static String NO_STATION_MATCH_FILTER_MESSAGE = "No charging stations that match filters. Reset filters";
    public final static String PHONE_NUMBER = "7034629231";
    public final static String ZERO_BALANCE_PHONE_NUMBER = "9047164052";
    public final static String NO_PLAN_PHONE_NUMBER = "9048271481";
    public final static String PHONE_COUNTRY_CODE = "91";

    public final static String LOCATION_TO_SEARCH = " 56 st marks";
    public final static String CONNECTING_CHARGER_TEXT = "Connecting to charger...";
    public final static String MAKESURE_TEXT = "Make sure you are plugged into the selected charger to successfully charge. ";
    public final static String CONNECTED_TO_TEXT = "Connected to";
    public final static String CONNECTED_TO_MESSAGE1 = "Just a moment while we start your charge and receive your session data from the charger.";

    public final static String CONNECTED_TO_MESSAGE2 = "Make sure you are plugged into the selected charger to successfully charge.";
    public final static String CHARGING_INPROGRESS_TEXT = "Charging in progress";
    public final static String CHARGING_COMPLETED_HEADING = "Charging finished";
    public final static String CHARGING_COMPLETED_TEXT = "Disconnect your EV. Charging is completed";
    public final static String REVIEW_MESSAGE_TEXT = "How was your charging experience?";


    //Search station validation constants
    public final static String LOCATION_NO_STATION = "Thrissur";
    public final static String NO_STATION_TOAST_MESSAGE = "Presto is not yet available here";

    public final static String PRESTOPASS_MESSAGE = "Congrats on saving with PrestoPass!";
    //interim receipt
    public final static String ENERGY_FEE_TEXT = "Included with PrestoPass";
    public final static String SESSION_FEE_TEXT = "Included with PrestoPass";
    public final static String PRESTO_PLAN_NAME = "Road Trip";
    public final static String PRESTO_PLAN_TEXT = "You are on the Road Trip plan";
    public final static String HAVE_QUESTION_TEXT = "Have questions regarding your receipt? Reach out to \n" +
            "support.";

    public final static String SUPPORT_MAIL = "support@prestocharging.com";

    public final static String ADDITIONAL_FEE_TEXT = "Additional fees may apply and be billed later";
    public final static String WRONG_CARD_NUMBER = "6588852322822282";
    public final static String CARD_NUMBER = "4242424242424242";
    public final static String MONTH_YEAR = "0225";
    public final static String CVC = "2566";
    public final static String POSTAL_CODE = "34555";
    public final static String INVALID_VOUCHER_CODE = "GYTHYG";
    public final static String VALID_VOUCHER_CODE = "ZBV78Q";
    public final static String HERTZ_VOUCHER_CODE = "FG12JK";
    //Accountpage-Personal info
    public final static String NAME_CUSTOMER = "test";
    public final static String PHONE_CUSTOMER = "+91 703-462-9231";
    public final static String EMAIL_CUSTOMER = "test@gmail.com";
    //Accountpage-Your Passes
    public final static String PASS_NAME = "PrestoPass";
    public final static String TEXT_YOURPASS = "Have questions regarding your receipt? Reach out to \n" +
           "support.";
    public final static String TEXT_REFER_FRIEND = "Hey there! Use Presto to make charging magically easy! Use my referral link to get discounts when you subscribe to a plan - https://prestocharging.sng.link/Aecz9/hexm/r_b0e3f9bd7e";
    public final static String PASS_EMAIL = "support@prestocharging.com";

    public final static String PASS_SUPPORT_LINK = "support";
    public final static String VEHICLE_BRAND = "Audi";
    public final static String AUDI_MODEL = "Q4 e-tron";

    //Chat bubble

    public final static String HELP_DESK_QUESTION = "How do I start charging?";

    public final static String GET_HELP_TEXT = "Get help";
    public final static String START_CONVERSATION_TEXT = "Start a conversation";
    //Charging denied constants
    public final static String DENIED_TEXT = "Charging denied";
    public final static String DENIED_MESSAGE = "The chargers at this location seem to be unavailable. Please find another location on the Presto app.";
    public final static String TIME_OUT_TEXT = "Charging request timed out";
    public final static String FAILED_TIMED_OUT_MESSAGE= "Unable to communicate with charger. Please check that the Charger ID on Presto matches the ID on the station. To retry - unplug, wait for the station to show as available in Presto, plug back in and swipe to start in Presto";
    public final static String FIND_NEW_LOCATION_BTN = "Find new location";
    public final static String TRY_AGAIN_BTN = "Try again";
    public final static String CONTACT_SUPPORT_BTN = "Contact support";
    public final static String LOCATION_TO_SEARCH_DENIED = "7-Eleven, 901 Palomar Airport Rd, Carlsbad";
    public final static String LOCATION = "New York";
    //Plan page
    public final static String SELECT_PLAN_TEXT = "Select plan";
    public final static String BUY_NOW_TEXT = "Buy now";
    public final static String YOUR_PLAN_TEXT = "Your plan";

    public final static String NO_PLAN_TEXT = "Save with Prepaid charging plans or Pay-as-you-go with FlexPay";
    //No balance card error
    public final static String NO_BALANCE_CARD_ERROR = "The payment hasn't been processed. Please update your card in settings and try again.";

    //New user sign up

    public final static String NEW_USER_PHONE_NUMBER = "9048187016";
    public final static String NEW_USER_PHONE_NUMBER_2 = "9961881504";
    public final static String NEW_USER_NAME = "john";
    public final static String NEW_USER_EMAIL = "john@test.in";

    public final static String PAY_AS_YOU_GO = "Pay As You Go";

    //Delete Account
    public final static String DELETE_ACCOUNT_MESSAGE_EXPECTED = "This action is irreversible and will result in the loss of information stored in your account.";
    //Purchase card details
    public final static String CVC_PLAN_PURCHASE = "123";
    //Plan purchase wrong card details
    public final static String INVALID_MONTH_YEAR = "521";
    public final static String CARD_ERROR_MESSAGE = "Your card's number is invalid.";
    public final static String CARD_DATE_ERROR_MESSAGE = "Your card's expiration year is invalid.";
    public final static String AROUNDTOWN_BUY_PLAN_MESSAGE = "Congrats! Your Around Town for 100 kWh is ready for use.";
    public final static String ROUNDTRIP_BUY_PLAN_MESSAGE = "Congrats! Your Road Trip for 150 kWh is ready for use.";
    public final static String PRO_UNLIMITED_BUY_PLAN_MESSAGE = "Congrats! Your Pro Unlimited for 900 kWh is ready for use.";
    public final static String SALLY_PLAN_BUY_MESSAGE = "Congrats! Your Pro Max for 250 kWh is ready for use.";
    public final static String HERTZ_PLAN_BUY_MESSAGE = "Congrats! Your Road Trip for 150 kWh is ready for use.";
    //Charging history
    public final static String CHARGING_HISTORY = "Charging history";
    public final static String NO_CHARGING_HISTORY = "No charging history yet.";
    //Purchased Screen plan details

    public final static String PURCHASED_PLAN_NAME = "Around Town";

    public final static String NO_HISTORY_TEXT_PURCHASED_PAGE = "Nothing here yet. Get started!";

    public final static String PURCHASED_ENERGY_AROUNDTOWN = "100 / 100 kwh";
    public final static String PURCHASED_ENERGY_ROAD_TRIP = "150 / 150 kwh";
    public final static String PLAN_DETAILS_TITLE_AROUNDTOWN = "Around Town Plan Details";
    public final static String PLAN_DETAILS_POINT1 = "Lock in savings with a prepaid charging pass.";
    public final static String PLAN_DETAILS_POINT2 = "No session fees.";
    public final static String PLAN_DETAILS_POINT3 = "50 kWhs included on the pass at charging stations where Presto is accepted.";
    public final static String ROAD_TRIP_PLAN_DETAILS_POINT3 = "150 kWhs included on the pass at charging stations where Presto is accepted.";
    public final static String PLAN_DETAILS_POINT4 = "Pass valid for 30 days from purchase, unused kWhs on pass expire when pass expires.";
    public final static String PLAN_DETAILS_POINT5 = "Presto is only accepted in California at this time.";
    public final static String PLAN_DETAILS_POINT6 = "Taxes may apply.";
    public final static String PLAN_DETAILS_POINT7 = "Idle fees and parking fees charged by station owners may apply, example: $0.40/min starting 10 minutes post charging.";
    public final static String PLAN_DETAILS_POINT8 = "Savings estimates based on typical usage compared to retail rates at public charging networks. Actual savings will vary.  ";
    public final static String PAY_AS_YOU_GO_TEXT = "You are using Presto FlexPay. Switch to a PrestoPass to save extra on charging.";
    //Login Invalid
    public final static String ERROR_MSG_WHEN_LOGIN_WITHOUTPHONE = "enter a valid phone number";

    //Filter location
    public final static String LOCATION_TO_SEARCH_FOR_FILTER = "Calicut";
    public final static String PLAN_DETAILS_TITLE_ROAD_TRIP = "Road Trip Plan Details";
    public final static String CHAT_LINK = " chat. ";
    //Invalid OTP
    public final static String OTP_EXCEED_PH_NUMBER = "7148265503";
    public final static String PAYMENT_CANCEL_MESSAGE = "The payment has been canceled";

    public final static String INVALID_OTP_MESSAGE = "Invalid OTP. Please check and try again.";
    public final static String OTP_ERROR_POP_UP = "You have exceeded the limit for OTP verification attempts. Please try again after 30 minutes.";
    //Plan expire scenario
    public final static String PLAN_EXPIRE_PHONE_NUMBER = "9048187015";
    public final static String PLAN_EXPIRED_TEXT = "Expired";
    public final static String PRESTO_PASS_DETAILS = "PrestoPass details";
    public final static String PAYMENT_DETAILS_TEXT = "Payment details";
    public final static String BUY_PLAN_AGAIN_TEXT = "Buy PrestoPass to start saving again";
    public final static String SEND_AGAIN_OTP_ERROR_POP_UP = "You have exceeded the limit for OTP attempts. Please try again after 30 minutes.";
    public final static String CONFIRM_BTN_TEXT = "Confirm";
    public final static String CLOSE_BTN_TEXT = "Close";
    public final static String VOUCHER_CODE_TEXT = "I have a voucher code";
    public final static String ENTER_VOUCHER_CODE_TEXT = "Enter voucher code";
    public final static String VOUCHER_CODE_SUB_TEXT = "Enter a code to unlock special plans.";
    public final static String CHARGERS_TAB = "Chargers";
    public final static String PRICES_TAB = "Prices";
    public final static String ROAD_TRIP_PLAN = "Road Trip plan";
    public final static String FLEX_PAY_TEXT = "FlexPay";
    public final static String UNLOCK_CUSTOM_PLANS_TEXT = "Unlock customized plans";

    //Updated details
    public final static String UPDATED_USER_NAME = "Daniel";
    public final static String UPDATED_USER_EMAIL = "daniel@gmail.com";

    //SalesTaxes
    public final static double PRO_UNLIMITED_PLAN_PRICE = 65;
    //public final static String PRO_UNLIMITED_PLAN_TAX_AMT = "$ 5.49";


    public final static double STATE_SALES_TAX = 0.0695;
    public final static double COUNTRY_SALES_TAX = 0.015;
    public final static double CITY_SALES_TAX = 0;
    public final static double PRO_UNLIMITED_TAX_CALCULATION = Constants.PRO_UNLIMITED_PLAN_PRICE * (Constants.STATE_SALES_TAX + Constants.COUNTRY_SALES_TAX + Constants.CITY_SALES_TAX);
    public final static double PRO_UNLIMITED_TAX_ROUNDED = Math.round(Constants.PRO_UNLIMITED_TAX_CALCULATION*100.0)/100.0;
    public final static String PRO_UNLIMITED_TAX_STRING = "$ " + Constants.PRO_UNLIMITED_TAX_ROUNDED;
    public final static String NO_TAX_STRING = "$ 0.00";
    public final static double PRO_UNLIMITED_PLAN_PRICE_CALCULATION = Constants.PRO_UNLIMITED_PLAN_PRICE+Constants.PRO_UNLIMITED_TAX_ROUNDED;
    public final static String PRO_UNLIMITED_PRICES_STRING = "$"+Constants.PRO_UNLIMITED_PLAN_PRICE_CALCULATION;

   //Tax from Charging History
   public final static double ENERGY_FEE_BLACKOUT_PEAK = 2.00;
    public final static double CHARGING_TAX_CALCULATION = Constants.ENERGY_FEE_BLACKOUT_PEAK * (Constants.STATE_SALES_TAX + Constants.COUNTRY_SALES_TAX + Constants.CITY_SALES_TAX);
    public final static double CHARGING_TAX_ROUNDED = Math.round(Constants.CHARGING_TAX_CALCULATION*100.0)/100.0;
    public final static String CHARGING_TAX_STRING = "$"+Constants.CHARGING_TAX_ROUNDED;
    public final static double TOTAL_PAID_AMT_CALCULATION = Constants.ENERGY_FEE_BLACKOUT_PEAK+Constants.CHARGING_TAX_ROUNDED;
    public final static String TOTAL_PAID_STRING = "$"+Constants.TOTAL_PAID_AMT_CALCULATION;

}
