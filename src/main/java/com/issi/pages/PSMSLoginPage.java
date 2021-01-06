package com.issi.pages;

import com.issi.enums.WaitStrategy;
import org.openqa.selenium.By;

public final class PSMSLoginPage extends BasePage {

    private final By textboxUsername = By.id("id_uname");
    private final By textboxPassword = By.id("id_password");
    private final By buttonLogin = By.id("id_btnsubmit");

    public PSMSLoginPage enterUserName(String username) {
        enterValue(textboxUsername, username, WaitStrategy.PRESENCE,"username");
        return this; // this line is same as 'return new OrangeHRMLoginPage'
    }

    public PSMSLoginPage enterPassword(String password) {
        enterValue(textboxPassword, password,WaitStrategy.PRESENCE,"password");
        return this;
    }

    public PSMSHomePage clickLogin() {
        clickOn(buttonLogin,WaitStrategy.PRESENCE,"loign button");
        return new PSMSHomePage();  // for method chaining
    }

    public String get_Title() {
        return getPageTitle();
    }
}
