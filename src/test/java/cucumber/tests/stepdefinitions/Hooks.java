package cucumber.tests.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

    @Before
    public void browserLaunchAndOpenUrl() {
        System.out.println("Browser is launched and navigated to the Application");
    }

    @After
    public void logoutAndCloseBrowser() {
        System.out.println("Application Logout and closed the browser");
    }

//    @BeforeStep
    public void recordTheStepDescriptionInResultFile() {
        System.out.println("Recorded the step description in results");
    }

//    @AfterStep
    public void takeScreenshotOfTheStep() {
        System.out.println("Screenshot Captured");
    }

    @Before("@Database")
    public void openDatabase(){
        System.out.println("Database is opened");
    }

    @After("@Database")
    public void closeDataBase() {
        System.out.println("Database is Closed");
    }
}
