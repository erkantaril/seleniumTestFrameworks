package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/java/features",
        glue = {"utility", "stepDefinitions"},
        dryRun = false,
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-report.json"},
        monochrome = true


)
public class TestRunner {
}
