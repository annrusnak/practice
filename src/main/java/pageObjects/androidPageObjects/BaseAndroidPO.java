package pageObjects.androidPageObjects;

import driver.DriverSettings;
import org.openqa.selenium.support.PageFactory;


public class BaseAndroidPO {
    public BaseAndroidPO() {
        PageFactory.initElements(DriverSettings.getAndroidDriver(), this);
    }

}
