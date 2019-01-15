package businessObjects;

import org.apache.log4j.Logger;
import pageObjects.androidPageObjects.LoginPO;

public class LoginBO {
    private LoginPO loginPO;
    private final static Logger log = Logger.getLogger(LoginBO.class);

    public LoginBO() {
        loginPO = new LoginPO();
    }

    public void act_login(String email, String pass) {
        loginPO.act_clickGetStartedButton()
                .act_clickNextStepButton()
                .act_enterEmail(email)
                .act_clickContinue()
                .act_enterPassword(pass)
                .act_clickSignIn()
                .act_clickSkipButton()
                .act_clickSkipProductTourButton()
                .ver_inboxHeaderVisibility();
        log.info("Login successful");
    }
}
