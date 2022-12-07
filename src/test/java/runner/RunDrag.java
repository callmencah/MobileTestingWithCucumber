package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/openDrag.feature",
        glue = "stepDefinitions",
        plugin = "html:target/HTML_report.html"
)
public class RunDrag {
}
