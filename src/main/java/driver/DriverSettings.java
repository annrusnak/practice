package driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverSettings {
    private static AndroidDriver androidDriver;

    public static WebDriver getAndroidDriver() {
        if (androidDriver == null) {
            try {
                androidDriver = new AndroidDriver(new URL("http://localhost:6723/wd/hub"), CapabilitiesSettings.getAndroidDesiredCapabilities());
                androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return androidDriver;
    }

    public static void closeAndroidDriver() {
        if (androidDriver != null) {
            try {
                androidDriver.quit();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
