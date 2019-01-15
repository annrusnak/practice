package mobile;

import org.testng.annotations.Test;
import utils.CSVReader;

public class Tester extends BaseAndroidTest {


    @Test
    public void test() {
        loginBO.act_login(CSVReader.read("userEmail"),CSVReader.read("userPassword"));
    }
}

