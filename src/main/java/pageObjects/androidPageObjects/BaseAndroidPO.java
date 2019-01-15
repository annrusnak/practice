package pageObjects.androidPageObjects;

import driver.DriverSettings;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;


class BaseAndroidPO {
    BaseAndroidPO() {
        PageFactory.initElements(DriverSettings.getAndroidDriver(), this);
    }
    final static Logger log = Logger.getLogger(BaseAndroidPO.class);






}
