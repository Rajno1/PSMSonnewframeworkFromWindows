package com.issi.tests;

import com.issi.pages.PSMSHomePage;
import com.issi.utils.DataProviderUtils;
import org.testng.annotations.Test;

import java.util.Map;

public final class HomePageTest extends BaseTest {
    /**
     * We have made HomePageTest class as final and created
     * private constructor to avoid extending & creating object
     * to this class.
     */
    private HomePageTest() {
    }

    @Test
    public void masterModuleTest(Map<String,String> data) {
       new PSMSHomePage()
               .clickOnMastermodulebtn()
               .clickOnClientTypeslink()
               .clickOnAddRecordBtn()
               .enterClientTypeText(data.get("clienttype"))
                .enterDescriptiontext(data.get("descriptiontext"))
               .clickOnSaveChangesBtn();
            //   .clickOnCloseBtn();
    }

}
