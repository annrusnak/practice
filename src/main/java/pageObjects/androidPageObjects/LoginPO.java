package pageObjects.androidPageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static driver.DriverSettings.waitToBeClickable;

public class LoginPO extends BaseAndroidPO {

    @FindBy(id = "com.microsoft.office.outlook:id/btn_splash_start")
    private WebElement getStartedBtn;
    @FindBy(id = "com.microsoft.office.outlook:id/sso_next_step_button")
    private WebElement nextStepButton;
    @FindBy(id="com.microsoft.office.outlook:id/edit_text_email")
    private WebElement emailInputField;
    @FindBy(id ="com.microsoft.office.outlook:id/btn_continue")
    private WebElement continueButton;
    @FindBy(id="passwordInput")
    private WebElement passwordInputFieldEpamPage;
    @FindBy(id="submitButton")
    private WebElement signInButton;
    @FindBy(id="com.microsoft.office.outlook:id/btn_skip")
    private WebElement skipButton;
    @FindBy(id="com.microsoft.office.outlook:id/product_tour_skip_btn")
    private WebElement skipProductTourButton;
    @FindBy(id="com.microsoft.office.outlook:id/toolbar")
    private WebElement inboxHeader;



    public LoginPO act_clickGetStartedButton() {
        getStartedBtn.click();
        log.info("Get started button clicked");
        return this;
    }
    public LoginPO act_clickNextStepButton() {
        nextStepButton.click();
        log.info("Next step button clicked");
        return this;
    }
    public LoginPO act_enterEmail(String email) {
        emailInputField.sendKeys(email);
        log.info(String.format("Email %s is entered", email));
        return this;
    }
    public LoginPO act_clickContinue() {
        continueButton.click();
        log.info("Continue button clicked");
        return this;
    }
    public LoginPO act_enterPassword(String pass) {
        passwordInputFieldEpamPage.sendKeys(pass);
        log.info(String.format("Password %s is entered", pass));
        return this;
    }
    public LoginPO act_clickSignIn() {
        signInButton.click();
        log.info("Sign in button clicked");
        return this;
    }
    public LoginPO act_clickSkipButton() {
        skipButton.click();
        log.info("Skip button clicked");
        return this;
    }
    public LoginPO act_clickSkipProductTourButton() {
        skipProductTourButton.click();
        log.info("Skip product tour button clicked");
        return this;
    }
    public LoginPO ver_inboxHeaderVisibility() {
        waitToBeClickable(inboxHeader);
        log.info("Inbox header is visible");
        return this;
    }


}
