package mobile;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Tester extends BaseAndroidTest {

    private final static Logger log = Logger.getLogger(Tester.class);

    @Test
    public void test() {
        loginPO.act_clickGetStartedBtn();
        log.info("Success!");
    }
}

