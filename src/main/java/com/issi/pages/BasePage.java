package com.issi.pages;

import com.issi.driver.DriverManager;
import com.issi.enums.WaitStrategy;
import com.issi.factories.ExplicitWaitFactory;
import com.issi.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BasePage {
    // This page contains re usable methods
    protected void clickOn(By by, WaitStrategy waitstrategy,String elementName) {
       WebElement element = ExplicitWaitFactory.performExplicitWait(by, waitstrategy);
        element.click();
        ExtentLogger.pass(" Clicked on " +elementName );
    }

    protected void enterValue(By by, String value,WaitStrategy waitstrategy, String elementName) {
        WebElement element =ExplicitWaitFactory.performExplicitWait(by, waitstrategy);
        element.sendKeys(value);
        ExtentLogger.pass("Entered  "+elementName+" as "+value);
    }

    protected void scrollByElement(By by,WaitStrategy waitstrategy){
        WebElement element = ExplicitWaitFactory.performExplicitWait(by, waitstrategy);
        element = DriverManager.getDriver().findElement(by);
        ((JavascriptExecutor)DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView();",element);
    }
    protected String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }
}
