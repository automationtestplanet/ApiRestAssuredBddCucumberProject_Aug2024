package reqres.api.tests.services;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Services {

    public static final String BASE_URL = "https://reqres.in";

    public static RequestSpecification getUserService(){
        return RestAssured.given().baseUri(BASE_URL);
    }

    public static RequestSpecification getRegisterService(){
        return RestAssured.given().baseUri(BASE_URL);
    }

    public static RequestSpecification RequestSpecification(){
        return RestAssured.given().baseUri(BASE_URL);
    }
}
