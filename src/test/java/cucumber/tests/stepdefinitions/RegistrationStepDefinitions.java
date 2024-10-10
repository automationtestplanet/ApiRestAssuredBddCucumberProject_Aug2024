package cucumber.tests.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;

public class RegistrationStepDefinitions {

    @Given("Navigate to Register Page")
    public void user_navigate_to_application() {
        System.out.println("Navigated to Register Page");
    }

    @Given("User is on Registration Page")
    public void userIsOnRegistrationPage() {
        System.out.println("Registration Page is availble");
    }

    @When("User enters multiple users details")
    public void userEntersMultipleUsersDetails(DataTable dataTable) {

        List<List<String>> allLists = dataTable.asLists(String.class);
//        allLists.forEach(eachList -> System.out.println(eachList.get(0)) );

//        for(List<String> eachList :allLists){
//            for(String eachData :eachList){
//                System.out.println(eachData);
//            }
//        }
        List<Map<String, String>> allData = dataTable.asMaps(String.class, String.class);

        Map<String, String> table = null;
        for (Map<String, String> eachMap : allData) {
            table = eachMap;
            System.out.println(table.get("Name"));
            System.out.println(table.get("Qualification"));
        }


    }

    @Then("User registration should successful")
    public void userRegistrationShouldSuccessful() {
        System.out.println("Registration Sucessful");
    }

}
