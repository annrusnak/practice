package mobile;

import org.testng.annotations.Test;

public class Tester extends BaseAndroidTest {
    @Test
    public void test() {
        loginPO.act_clickGetStartedBtn();
        System.out.println("OK");
    }
}

