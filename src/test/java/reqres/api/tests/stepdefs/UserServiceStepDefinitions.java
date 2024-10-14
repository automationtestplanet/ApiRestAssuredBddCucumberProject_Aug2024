package reqres.api.tests.stepdefs;

import io.cucumber.java.en.*;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import reqres.api.tests.models.userservice.CreateUser;
import reqres.api.tests.services.Services;
import reqres.api.tests.services.UserService;
import reqres.api.tests.utils.ReadDataFromJson;
import reqres.api.tests.utils.Utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserServiceStepDefinitions {

    UserService userService = new UserService();

    public static final String USER_SERVICE_TEST_DATA = Utils.getProperty("test.data")+"UserService/";
    public static final String USERS_ENDPOINT =  Utils.getProperty("user.service");

    RequestSpecification rs;

    CreateUser createUserPayload;
    Map createUserResponse;

    List<Map<String, Object>> allUsersResponse;
    Map<String, Object> singleUsersResponse;

    @Given("Users endpoint")
    public void usersEndpoint() {
        rs = Services.getUserService();
    }

    @When("User get all user details with page no {string}")
    public void userGetAllUserDetailsWithPageNo(String pageNum) {
        Map<String, Object> queryParam = new HashMap<>();
        queryParam.put("page", pageNum);
        allUsersResponse = userService.getListOfUsers(rs, USERS_ENDPOINT, queryParam, 200);
    }

    @Then("user details must be fetched")
    public void userDetailsMustBeFetched() {
        Assert.assertFalse(allUsersResponse.isEmpty());
    }

    @When("User get single user details with id {string}")
    public void userGetSingleUserDetailsWithId(String id) {
        Map<String, Object> pathParam = new HashMap<>();
        pathParam.put("id", id);
        singleUsersResponse = userService.getSingleUser(rs, USERS_ENDPOINT, pathParam, 200);
    }

    @Then("user details must be fetched and id {string} should match")
    public void userDetailsMustBeFetchedAndIdShouldMatch(String id) {
        Assert.assertEquals(id, singleUsersResponse.get("id").toString());
    }

    @When("User creates the user with details with {string}")
    public void userCreatesTheUserWithDetailsWith(String fileName) {
        Map<String, Object> headers = new HashMap<>();
        headers.put("Accept", "*/*");
        headers.put("Content-Type", "application/json");
        createUserPayload = ReadDataFromJson.createUserData(USER_SERVICE_TEST_DATA + fileName);
        createUserResponse = userService.createUser(rs, USERS_ENDPOINT, headers, createUserPayload,
                201);
    }

    @Then("User must be created")
    public void userMustBeCreated() {
        Assert.assertEquals(createUserResponse.get("name"), createUserPayload.getName());
        Assert.assertEquals(createUserResponse.get("job"), createUserPayload.getJob());
        Assert.assertNotNull(createUserResponse.get("id"));
    }
}
