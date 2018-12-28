package mobile;

import driver.DriverSettings;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pageObjects.androidPageObjects.LoginPO;

public class BaseAndroidTest {

    LoginPO loginPO;

    @BeforeTest
    public void initDriver() {
        loginPO = new LoginPO();
    }

    @AfterTest
    public void closeDriver() {
        DriverSettings.closeAndroidDriver();
    }
}


