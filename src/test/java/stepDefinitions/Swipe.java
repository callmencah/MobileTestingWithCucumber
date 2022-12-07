package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import objectRepository.PageSwipe;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Swipe extends Hooks {

    PageSwipe PageSwipe = new PageSwipe();
    @When("user found Compatible menu")
    public void user_found_compatible_menu() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageSwipe.getPage_swipe())
        );
        driver.findElement(PageSwipe.getScroll_toCompatible()).isDisplayed();
    }

    @And("user found robot")
    public void user_found_robot() {
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageSwipe.getPage_swipe())
        );
        driver.findElement(PageSwipe.getScroll_toRobot());
        driver.findElement(PageSwipe.getIcon_robot()).isDisplayed();
    }
}
