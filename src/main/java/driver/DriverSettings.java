package driver;

import io.appium.java_client.android.AndroidDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DriverSettings {
    private static AndroidDriver androidDriver;
    private final static Logger log = Logger.getLogger(DriverSettings.class);


    public static WebDriver getAndroidDriver() {
        if (androidDriver == null) {
            try {
                androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), CapabilitiesSettings.getAndroidDesiredCapabilities());
                androidDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                log.info("Android driver started");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return androidDriver;
    }

    private static WebDriverWait getWait() {
        return (new WebDriverWait(androidDriver, 45));
    }

    public static WebElement waitToBeClickable(WebElement element) {
        return getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void closeAndroidDriver() {
        if (androidDriver != null) {
            try {
                androidDriver.quit();
                log.info("Android driver closed");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
