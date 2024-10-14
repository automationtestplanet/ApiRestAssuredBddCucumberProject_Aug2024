package reqres.api.tests.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

    features = "ReqResFeatures",
        glue = "reqres.api.tests.stepdefs",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        dryRun = false,
        tags = "@Users"




)
public class ReqResTestRunner extends AbstractTestNGCucumberTests {
}
