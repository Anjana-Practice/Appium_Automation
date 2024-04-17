package pageobjects;

import config.Constants;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.Actions;

import java.util.HashMap;

public class ChatBubblePage extends BasePage {

    private final HashMap<String, By> chatBubbleIcon = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.ImageButton[@content-desc='Intercom launcher']"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> hiThereText = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@text,'Hi there')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> howCanWeHelp = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@text,'How can we help?')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> messagesSection = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@text,'Messages')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> backButtonFromMessage = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[18]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> backButtonFromHelpAndAskQuestion = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[24]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> backButtonFromAskQuestionInMessagesection = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.view.View[@content-desc='Back']"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> startConversation = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@text,'Start a conversation')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> helpSection = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@text,'Help')]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    //*[contains(@text,'Get help')]
    private final HashMap<String, By> getHelpSection = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@text,'Get help')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    //*[contains(@text,'We typically reply in under 4 minutes')]
    private final HashMap<String, By> askAquestionNextPage = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.TextView[contains(@content-desc,\"Hi there! This is Presto bot. I'm here to answer any questions you have. How can I help you today?\")]"));
        put("iOS", AppiumBy.xpath(""));
    }};
    private final HashMap<String, By> searchForHelp = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("(//*[@index])[28]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> searchForHelpTextBox = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@text,'Search for help')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> howDoIStartChargingFromList = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//android.widget.TextView[contains(@text,'\u200DHow do I start charging?')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    private final HashMap<String, By> howDoIStartChargingSolution = new HashMap<String, By>() {{
        put("Android", AppiumBy.xpath("//*[contains(@text,'How do I start charging? | Presto Charging Help Center')]"));
        put("iOS", AppiumBy.xpath(""));
    }};

    public ChatBubblePage(AppiumDriver driver) {
        super(driver);
    }

    public ChatBubblePage clickOnChatBubble() {
        Actions.clickElement(chatBubbleIcon, 30, 1000);
        return this;
    }

    public ChatBubblePage clickOnBackButton() {
        Actions.clickElement(backButtonFromAskQuestionInMessagesection, 30, 1000);
        return this;
    }

    public ChatBubblePage chatPagetitleValidation() {
        Assert.assertTrue(Actions.isDisplayedCheck(hiThereText, 30, 1000));
        Assert.assertTrue(Actions.isDisplayedCheck(howCanWeHelp, 30, 1000));
        return this;
    }

    public ChatBubblePage messageSectionValidation() {
        Assert.assertTrue(Actions.isDisplayedCheck(messagesSection, 30, 1000));
        Actions.clickElement(messagesSection, 30, 1000);
        String askAQuestionText = Actions.getAttributeValue(startConversation, 30, 1000, "text");
        Assert.assertEquals(askAQuestionText, Constants.START_CONVERSATION_TEXT);
        Actions.clickElement(startConversation, 30, 1000);
        Assert.assertTrue(Actions.isDisplayedCheck(askAquestionNextPage, 30, 1000));
        return this;
    }

    public ChatBubblePage helpSectionValidation() {
        Assert.assertTrue(Actions.isDisplayedCheck(helpSection, 30, 1000));
        Actions.clickElement(helpSection, 30, 1000);
        String getHelpText = Actions.getAttributeValue(getHelpSection, 30, 1000, "text");
        Assert.assertEquals(getHelpText, Constants.GET_HELP_TEXT);
        return this;
    }

    public ChatBubblePage startConversationValidation() {
        Assert.assertTrue(Actions.isDisplayedCheck(startConversation, 30, 1000));
        Actions.clickElement(startConversation, 30, 1000);
        Assert.assertTrue(Actions.isDisplayedCheck(askAquestionNextPage, 30, 1000));
        return this;
    }

    public ChatBubblePage searchForHelpValidation() {
        Assert.assertTrue(Actions.isDisplayedCheck(searchForHelp, 30, 1000));
        Actions.clickElement(searchForHelp, 30, 1000);
        Actions.clickElement(searchForHelpTextBox, 30, 1000);
        Actions.sendText(searchForHelpTextBox, Constants.HELP_DESK_QUESTION, 30, 1000);
        Actions.clickElement(howDoIStartChargingFromList, 30, 1000);
        Assert.assertTrue(Actions.isDisplayedCheck(howDoIStartChargingSolution, 30, 1000));
        return this;
    }
}
   
  