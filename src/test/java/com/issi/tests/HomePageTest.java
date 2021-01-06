package com.issi.tests;

import org.testng.annotations.Test;

public final class HomePageTest extends BaseTest {
    /**
     * We have made HomePageTest class as final and created
     * private constructor to avoid extending & creating object
     * to this class.
     */
    private HomePageTest() {
    }

    @Test
    public void demoTest() {
        System.out.println("Demo Test");
//            new OrangeHRMHomePage()
//                    .cickAdminModule()
//                    .cickUserManagementLink()
//                    .enterUsernametoseach()
//                    .cickOnSearchBtn();
    }

}
