package cucumber.Options;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  // ✅ Correct path
        glue = "stepDefinitions", 
        tags = "@SortResults1",
        plugin = {"pretty", "html:target/cucumber-reports/html", "json:target/cucumber-reports/cucumber.json"}
)
public class TestRunner {
    // Empty class - used to run Cucumber tests
}
