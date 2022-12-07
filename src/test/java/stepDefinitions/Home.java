package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import objectRepository.PageHome;
import java.net.MalformedURLException;

public class Home extends Hooks {


    PageHome PageHome = new PageHome();

    @Given("user is on app home")
    public void user_is_on_app_home() throws MalformedURLException {
        before();
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(PageHome.getPage_home())
        );
    }
    @When("user access form page")
    public void user_access_form_page() {
        driver.findElement(PageHome.getBtn_form()).click();
    }

    @When("user access swipe page")
    public void user_access_swipe_page() {
        driver.findElement(PageHome.getBtn_swipe()).click();
    }
    @When("user access webview page")
    public void user_access_webview_page() {
        driver.findElement(PageHome.getBtn_webview()).click();
    }

}
