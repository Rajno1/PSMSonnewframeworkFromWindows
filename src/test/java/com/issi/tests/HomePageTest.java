package com.issi.tests;

import com.issi.pages.PSMSHomePage;
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
    public void masterModuleTest() {
       new PSMSHomePage()
               .clickOnMastermodulebtn()
               .clickOnClientTypeslink()
               .clickOnAddRecordBtn()
               .enterClientTypeText()
               .clickOnCloseBtn();
    }

}
