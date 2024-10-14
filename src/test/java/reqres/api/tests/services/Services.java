package reqres.api.tests.services;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import reqres.api.tests.utils.Utils;

public class Services {

    public static final String BASE_URL = Utils.getProperty(Utils.getProperty("environment")+".base.url");

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
