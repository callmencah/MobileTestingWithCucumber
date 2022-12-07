package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.cucumber.java.en.When;
import objectRepository.PageDrag;
import org.openqa.selenium.WebElement;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class DragAndDrop extends Hooks{
    TouchAction t = new TouchAction(driver);
    PageDrag PageDrag = new PageDrag();
    @When("user Drag And Drop")
    public void user_drag_and_drop() throws InterruptedException {
        WebElement from1 = driver.findElement(PageDrag.getDrag_1bawah());
        WebElement to1 = driver.findElement(PageDrag.getDrag_1atas());
        t.longPress(longPressOptions().withElement(element(from1)).withDuration(ofSeconds(30))).moveTo(element(to1)).release().perform();

        WebElement from2 = driver.findElement(PageDrag.getDrag_2bawah());
        WebElement to2 = driver.findElement(PageDrag.getDrag_2atas());
        t.longPress(longPressOptions().withElement(element(from2)).withDuration(ofSeconds(30))).moveTo(element(to2)).release().perform();

        WebElement from3 = driver.findElement(PageDrag.getDrag_3bawah());
        WebElement to3 = driver.findElement(PageDrag.getDrag_3atas());
        t.longPress(longPressOptions().withElement(element(from3)).withDuration(ofSeconds(30))).moveTo(element(to3)).release().perform();

        WebElement from4 = driver.findElement(PageDrag.getDrag_4bawah());
        WebElement to4 = driver.findElement(PageDrag.getDrag_4atas());
        t.longPress(longPressOptions().withElement(element(from4)).withDuration(ofSeconds(30))).moveTo(element(to4)).release().perform();

        WebElement from5 = driver.findElement(PageDrag.getDrag_5bawah());
        WebElement to5 = driver.findElement(PageDrag.getDrag_5atas());
        t.longPress(longPressOptions().withElement(element(from5)).withDuration(ofSeconds(30))).moveTo(element(to5)).release().perform();

        WebElement from6 = driver.findElement(PageDrag.getDrag_6bawah());
        WebElement to6 = driver.findElement(PageDrag.getDrag_6atas());
        t.longPress(longPressOptions().withElement(element(from6)).withDuration(ofSeconds(30))).moveTo(element(to6)).release().perform();

        WebElement from7 = driver.findElement(PageDrag.getDrag_7bawah());
        WebElement to7 = driver.findElement(PageDrag.getDrag_7atas());
        t.longPress(longPressOptions().withElement(element(from7)).withDuration(ofSeconds(30))).moveTo(element(to7)).release().perform();

        WebElement from8 = driver.findElement(PageDrag.getDrag_8bawah());
        WebElement to8 = driver.findElement(PageDrag.getDrag_8atas());
        t.longPress(longPressOptions().withElement(element(from8)).withDuration(ofSeconds(30))).moveTo(element(to8)).release().perform();

        WebElement from9 = driver.findElement(PageDrag.getDrag_9bawah());
        WebElement to9 = driver.findElement(PageDrag.getDrag_9atas());
        t.longPress(longPressOptions().withElement(element(from9)).withDuration(ofSeconds(30))).moveTo(element(to9)).release().perform();

        Thread.sleep(30);
        driver.findElement(PageDrag.getCongratulations()).isDisplayed();
        driver.findElement(PageDrag.getBtn_retry()).click();
    }
}
