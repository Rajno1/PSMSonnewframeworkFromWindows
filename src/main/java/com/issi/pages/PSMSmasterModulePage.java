package com.issi.pages;

import com.issi.enums.WaitStrategy;
import org.openqa.selenium.By;

public class PSMSmasterModulePage extends BasePage{
    private final By masterModuleBtn = By.xpath("//button[@name='btn-Master']");
    private final By clientTypeslink = By.xpath("//*[@id='menu-MasterBar']/div[3]/ul/a[1]/li");

    private final By addRecordbtn = By.xpath("//button[@title='Add Record']");

    public PSMSmasterModulePage clickOnMastermodulebtn(){
        clickOn(masterModuleBtn, WaitStrategy.CLICKABLE,"Master module button");
        return this;
    }
    public PSMSmasterModulePage clickOnClientTypeslink(){
        clickOn(clientTypeslink,WaitStrategy.CLICKABLE,"Client types link");
        return this;
    }
    public void clickOnAddRecordBtn(){
        clickOn(addRecordbtn,WaitStrategy.CLICKABLE,"Add record button");
    }
}
