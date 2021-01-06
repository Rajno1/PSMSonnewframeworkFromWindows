package com.issi.tests;

import com.issi.pages.PSMSmasterModulePage;
import org.testng.annotations.Test;

public class MasterModuelTest {
   // @Test
    public void addClientTypeRecordTest(){
        new PSMSmasterModulePage()
                .clickOnMastermodulebtn()
                .clickOnClientTypeslink()
                .clickOnAddRecordBtn();
    }
}
