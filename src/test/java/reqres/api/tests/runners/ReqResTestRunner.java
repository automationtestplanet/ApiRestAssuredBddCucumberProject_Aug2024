package reqres.api.tests.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

    features = "ReqResFeatures",
        glue = "reqres.api.tests.stepdefs",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,
        tags = "@CreateUser"




)
public class ReqResTestRunner extends AbstractTestNGCucumberTests {
}
