package mobile;

import driver.DriverSettings;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.androidPageObjects.BaseAndroidPO;
import pageObjects.androidPageObjects.LoginPO;

public class BaseAndroidTest {

    protected LoginPO loginPO;

    @BeforeTest
    public void initDriver() {
        loginPO = new LoginPO();
        //PageObjects init
    }

    @AfterTest
    public void closeDriver() {
        DriverSettings.closeAndroidDriver();
    }
}


