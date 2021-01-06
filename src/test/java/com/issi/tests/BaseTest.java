package com.issi.tests;

import com.issi.driver.Driver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static com.issi.tests.LoginPageTest.loginTest;
import static com.issi.tests.LoginPageTest.logoutTest;

public class BaseTest {
    protected BaseTest() {
    }

    @BeforeClass
    protected void initDriver(){
        Driver.launchDriver();
    }

    @BeforeMethod
    protected void initLogin() {
        loginTest();
    }

    @AfterMethod
    protected void initLogout() {
        logoutTest();
    }

    @AfterClass
    protected void tearDown(){
        Driver.quiteDriver();
    }


}
