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
    private final By descriptionText = By.xpath("//textarea[@name='client_desc']");
//    private final By fi_validYes_rdbtn = By.xpath("//input[@name='fl_valid' and @value='Y']");
//    private final By fi_validNo_rdbtn = By.xpath("//input[@name='fl_valid' and @value='N']");
    private final By savechangesbtn = By.id("id_btnsubmit");



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

    public PSMSHomePage enterClientTypeText(String value){
        enterValue(clientTypeText,value,WaitStrategy.PRESENCE,"Client type");
        return this;
    }

    public PSMSHomePage enterDescriptiontext(String value){
        enterValue(descriptionText,value,WaitStrategy.PRESENCE,"Client type");
        return this;
    }

    public PSMSHomePage clickOnSaveChangesBtn(){
        clickOn(savechangesbtn,WaitStrategy.CLICKABLE,"Save Changes");
        return this;
    }

//    public PSMSHomePage selectfiValidbtn(String value){
//        if (value.equalsIgnoreCase("yes")){
//            clickOn(fi_validYes_rdbtn,WaitStrategy.CLICKABLE," fi_valid Yes");
//        }else if (value.equalsIgnoreCase("no")){
//            clickOn(fi_validNo_rdbtn,WaitStrategy.CLICKABLE,"fi_valid No");
//        }
//        return this;
//    }




    public PSMSHomePage clickOnCloseBtn(){
        clickOn(closeBtn,WaitStrategy.CLICKABLE,"close button");
        return this;
    }


    public PSMSHomePage cickUserActions(){

        try {
            Thread.sleep(6000);
            clickOn(userActionsBtn,WaitStrategy.CLICKABLE," User actions");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

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
