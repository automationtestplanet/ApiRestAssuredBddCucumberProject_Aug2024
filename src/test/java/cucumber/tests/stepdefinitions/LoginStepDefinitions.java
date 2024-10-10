package cucumber.tests.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

import java.util.List;

public class LoginStepDefinitions {


    @Given("Navigate to Login Page")
    public void user_navigate_to_application() {
        System.out.println("Navigated to Login Page");
    }

    @Given("User is on Login Page")
    public void launchLoginPage() {
        System.out.println("This is Login Page");
    }

    @When("User enter username as {string} and password as {string} and click Login button")
    public void login(String userName, String password) {
        System.out.println("Entered UserName as :" + userName + " Password as :" + password);
    }

    @Then("Login should successful")
    public void verifyLogin() {
        System.out.println("Login Successful");
    }

    @And("User Image should be displayed")
    public void verifyUserImage() {
        System.out.println("User Image is displayed");
    }

    @But("User Details should not be displayed")
    public void verifyUserDetails() {
        System.out.println("User Details not displayed");
    }

    @Then("Login should fail")
    public void login_should_fail() {
        System.out.println("Login Failed");
    }


}
