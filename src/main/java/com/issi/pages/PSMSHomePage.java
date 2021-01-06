package com.issi.pages;

import com.issi.enums.WaitStrategy;
import org.openqa.selenium.By;

public final class PSMSHomePage extends BasePage {
    private final By userActionsBtn = By.xpath("//div[@class='form-inline my-2 my-lg-0 text-right']/div/button[@title='User Actions']");
    private final By logoutlink = By.xpath("//li[contains(text(),'Logout')]");

    private final By masterModuleBtn = By.xpath("//button[@name='btn-Master']");
    private final By clientTypeslink = By.xpath("//*[@id='menu-MasterBar']/div[3]/ul/a[1]/li");

    private final By addRecordbtn = By.xpath("//button[@title='Add Record']");
    private final By clientTypeText = By.xpath("//input[@name='nm_client_type']");
    private final By closeBtn = By.xpath("//button/span[@aria-hidden='true']");

    public PSMSHomePage clickOnMastermodulebtn(){
        clickOn(masterModuleBtn, WaitStrategy.CLICKABLE,"Master module button");
        return this;
    }
    public PSMSHomePage clickOnClientTypeslink(){
        clickOn(clientTypeslink,WaitStrategy.CLICKABLE,"Client types link");
        return this;
    }
    public PSMSHomePage clickOnAddRecordBtn(){
        clickOn(addRecordbtn,WaitStrategy.CLICKABLE,"Add record button");
        return this;
    }

    public PSMSHomePage enterClientTypeText(){
        enterValue(clientTypeText,"Raja",WaitStrategy.PRESENCE,"Client type");
        return this;
    }
    public PSMSHomePage clickOnCloseBtn(){
        clickOn(closeBtn,WaitStrategy.CLICKABLE,"close button");
        return this;
    }
    public PSMSHomePage cickUserActions(){
        clickOn(userActionsBtn,WaitStrategy.CLICKABLE," User actions");
        return this;
    }
    public PSMSLoginPage cickLogoutLink(){
        clickOn(logoutlink,WaitStrategy.CLICKABLE," Logout link");
        return new PSMSLoginPage();

    }


    public String get_Title() {
        return getPageTitle();
    }



}
