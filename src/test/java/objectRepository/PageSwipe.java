package objectRepository;


import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class PageSwipe {

    By page_swipe = By.xpath("//android.widget.ScrollView[@content-desc='Swipe-screen']");
    By icon_robot = By.xpath("//android.widget.ImageView[@content-desc='WebdriverIO logo']");
    By scroll_toCompatible = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).setAsHorizontalList().scrollIntoView(textContains(\"COMPATIBLE\"))");
    By scroll_toRobot = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(descriptionContains(\"WebdriverIO logo\"))");

    public By getPage_swipe() {
        return page_swipe;
    }

    public By getScroll_toCompatible() {
        return scroll_toCompatible;
    }

    public By getIcon_robot() {
        return icon_robot;
    }

    public By getScroll_toRobot() {
        return scroll_toRobot;
    }
}
