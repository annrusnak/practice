package pageObjects.androidPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BaseAndroidPO {

    @FindBy(id = "com.microsoft.office.outlook:id/btn_splash_start")
    private WebElement getStartedBtn;

    public LoginPO act_clickGetStartedBtn() {
        getStartedBtn.click();
        return this;
    }

}
