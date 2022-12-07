package objectRepository;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
public class PageWebview {

        By scroll_todown = MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true))" +
                ".scrollIntoView(new UiSelector().text(\"Native Mobile Support\"))");

    public By getScroll_todown() {
        return scroll_todown;
    }
}
