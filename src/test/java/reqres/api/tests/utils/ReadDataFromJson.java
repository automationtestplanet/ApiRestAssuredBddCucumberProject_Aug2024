package reqres.api.tests.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import reqres.api.tests.models.userservice.CreateUser;

import java.nio.file.Paths;

public class ReadDataFromJson {

    public static final String BASE_PATH = System.getProperty("user.dir");
    static ObjectMapper objMapper = new ObjectMapper();

    public static CreateUser createUserData(String filePath) {
        try {
            return objMapper.readValue(Paths.get(BASE_PATH + filePath).toFile(), CreateUser.class);
        } catch (Exception e) {
            System.out.println("Exception occurred while reading the data from Create User Json: " + e.getMessage());
        }
        return null;
    }
}
