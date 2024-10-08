package cucumber.tests.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(
    features = "Features",
        glue = "cucumber.tests.stepdefinitions"
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
