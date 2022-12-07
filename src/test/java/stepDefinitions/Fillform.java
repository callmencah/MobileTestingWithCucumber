package stepDefinitions;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.cucumber.java.en.And;
import org.junit.Assert;
import objectRepository.PageFillform;

public class Fillform extends Hooks {

    PageFillform PageFillform = new PageFillform();
    @And("user fill input field")
    public void user_fill_input_field() {
        String input = "Ujang";
        String inputResult;
        driver.findElement(PageFillform.getTextinput()).sendKeys(input);
        inputResult = driver.findElement(PageFillform.getTxt_inputResult()).getAttribute("text");
        Assert.assertEquals(inputResult, input);
    }
    @And("user change switch state")
    public void user_change_switch_state() {
        driver.findElement(PageFillform.getClickswitch()).click();
    }
    @And("user choose dropdown field")
    public void user_choose_dropdown_field() {
        driver.findElement(PageFillform.getDropdown()).click();
        driver.findElement(PageFillform.getChosedropdown()).click();
        }
    @And("user click active button")
    public void user_click_active_button() {

        // Scroling to text "Active"
        MobileElement element = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0))" +
                        ".scrollIntoView(new UiSelector().text(\"Active\"))"));
        driver.findElement(PageFillform.getClickbutton()).click();
    }
    @And("user click ok")
    public void user_click_ok() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(PageFillform.getClickok()).click();
    }


}
