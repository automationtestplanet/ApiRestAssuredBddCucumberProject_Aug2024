package reqres.api.tests.utils;

import javax.mail.util.SharedFileInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Utils {

    public static Properties appProperties = new Properties();
    public static String propertiesFilePath = System.getProperty("user.dir") + "/src/test/resources/application.properties";

    static {
        try {
            appProperties.load(new FileInputStream(new File(propertiesFilePath)));
        } catch (Exception e) {
            System.out.println("Exception occurred while reading the properties file" + e.getMessage());
        }
    }

    public static String getProperty(String propertyName) {
        return appProperties.getProperty(propertyName);
    }
}
