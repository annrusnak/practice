package mobile;

import businessObjects.LoginBO;
import driver.DriverSettings;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseAndroidTest {

    LoginBO loginBO;

    @BeforeTest
    public void initDriver() {
        loginBO = new LoginBO();
    }

    @AfterTest
    public void closeDriver() {
        DriverSettings.closeAndroidDriver();
    }
}


