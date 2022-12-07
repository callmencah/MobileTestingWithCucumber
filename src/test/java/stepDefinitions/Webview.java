package stepDefinitions;
import io.cucumber.java.en.When;
import objectRepository.PageWebview;

public class Webview extends Hooks{

    PageWebview PageWebview = new PageWebview();
    @When("user found text Native Mobile Support")
    public void user_found_text_native_mobile_support() {

        driver.findElement(PageWebview.getScroll_todown());
    }
}
