package cucumber.tests.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(
        features = "Features",
        glue = "cucumber.tests.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false
//        tags = "@ValidCredentials"
//        tags = "@ValidCredentials and @SmokeTest"
//        tags = "@ValidCredentials or @Test"
//        tags = "@RegistrationFeature"

)

public class TestRunner extends AbstractTestNGCucumberTests {
}
