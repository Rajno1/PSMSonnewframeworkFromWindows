package com.issi.pages;

import com.issi.enums.WaitStrategy;
import org.openqa.selenium.By;

public final class PSMSHomePage extends BasePage {
    private final By userActionsBtn = By.xpath("//div[@class='d-none d-sm-block col-md-2']/div/div/button[3]");
    private final By logoutlink = By.xpath("//li[contains(text(),'Logout')]");


    public PSMSHomePage cickUserActions(){
        clickOn(userActionsBtn,WaitStrategy.PRESENCE," User actions");
        return this;
    }
    public PSMSHomePage cickLogoutLink(){
        clickOn(logoutlink,WaitStrategy.PRESENCE," Logout link");
        return this;

    }


    public String get_Title() {
        return getPageTitle();
    }


}
