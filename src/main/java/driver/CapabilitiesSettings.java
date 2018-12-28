package driver;

import org.openqa.selenium.remote.DesiredCapabilities;
import utils.CSVReader;

class CapabilitiesSettings {
    private static DesiredCapabilities androidCapabilities;

    private static void setCapability(String param) {
        androidCapabilities.setCapability(param, CSVReader.read(param));
    }

    static DesiredCapabilities getAndroidDesiredCapabilities() {
        if (androidCapabilities == null) {
            androidCapabilities = new DesiredCapabilities(); }
        CapabilitiesSettings.setCapability("deviceName");
        CapabilitiesSettings.setCapability("platformName");
        CapabilitiesSettings.setCapability("appPackage");
        CapabilitiesSettings.setCapability("appActivity");
        CapabilitiesSettings.setCapability("fullReset");
        return androidCapabilities;
    }
}
