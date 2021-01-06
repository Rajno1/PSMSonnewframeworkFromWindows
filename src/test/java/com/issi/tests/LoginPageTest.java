package com.issi.tests;

import com.issi.enums.ConfigProperties;
import com.issi.pages.PSMSHomePage;
import com.issi.pages.PSMSLoginPage;
import com.issi.reports.ExtentReport;
import com.issi.utils.PropertyUtils;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

import java.util.Map;

public final class LoginPageTest extends BaseTest {
    /**
     * We have made LoginPageTest class as final and created
     * private constructor to avoid extending & creating object
     * to this class.
     */
    private LoginPageTest() {
    }

    @Test
    public static void loginTest() {
        ExtentReport.createExtentTest("Login test");
        String title = new PSMSLoginPage()
                .enterUserName(PropertyUtils.getValue(ConfigProperties.USERNAME))
                .enterPassword(PropertyUtils.getValue(ConfigProperties.PASSWORD))
                .clickLogin()
                .get_Title();

        Assertions.assertThat(title)
                .isEqualTo("PSMS");
    }
    @Test
    public static void logoutTest() {
        ExtentReport.createExtentTest("Logout test");
        String title = new PSMSHomePage()
                .cickUserActions()
                .cickLogoutLink()
                .get_Title();

        Assertions.assertThat(title)
                .isEqualTo("PSMS");
    }

}
