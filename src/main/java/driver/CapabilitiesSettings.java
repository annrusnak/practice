package driver;

import org.openqa.selenium.remote.DesiredCapabilities;
import utils.CSVReader;

class CapabilitiesSettings {
    private static DesiredCapabilities androidCapabilities;

    static DesiredCapabilities getAndroidDesiredCapabilities() {
        if (androidCapabilities == null) {
            androidCapabilities = new DesiredCapabilities();
        }
        androidCapabilities.setCapability("deviceName", "02e7d80f212ff612");
        androidCapabilities.setCapability("platformName", "Android");
        androidCapabilities.setCapability("appPackage", "com.microsoft.office.outlook");
        androidCapabilities.setCapability("appActivity", "com.acompli.acompli.CentralActivity");
        androidCapabilities.setCapability("fullReset", "false");
        return androidCapabilities;
    }
}
