package com.issi.pages;

import com.issi.driver.DriverManager;
import com.issi.enums.WaitStrategy;
import com.issi.factories.ExplicitWaitFactory;
import com.issi.reports.ExtentLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Set;

public class BasePage {
    // This page contains re usable methods

    protected void clickOn(By by, WaitStrategy waitstrategy,String elementName) {
       WebElement element = ExplicitWaitFactory.performExplicitWait(by, waitstrategy);
        element.click();
        ExtentLogger.pass(" Clicked on : " +elementName );
    }

    protected void enterValue(By by, String value,WaitStrategy waitstrategy, String elementName) {
        WebElement element =ExplicitWaitFactory.performExplicitWait(by, waitstrategy);
        element.sendKeys(value);
        ExtentLogger.pass("Entered  "+elementName+" as ' "+value+" '");
    }

    protected void scrollByElement(By by,WaitStrategy waitstrategy){
        WebElement element = ExplicitWaitFactory.performExplicitWait(by, waitstrategy);
        element = DriverManager.getDriver().findElement(by);
        ((JavascriptExecutor)DriverManager.getDriver()).executeScript("arguments[0].scrollIntoView();",element);
    }

    protected String switchToWindow(String previousWindowId){
        Set<String> windowHandles = DriverManager.getDriver().getWindowHandles();
        for (String windowHandle : windowHandles) {
            if (!previousWindowId.equals(windowHandle)) {
                DriverManager.getDriver().switchTo().window(windowHandle);
            }
        }
        return DriverManager.getDriver().getWindowHandle();

    }

    protected void waitupto(long milliSeconds){
        try {
            Thread.sleep(milliSeconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    protected void selectMenuItem(By by, String enterMenuItem){
        try {
            List<WebElement> menuList = DriverManager.getDriver().findElements(by);
            for (int i = 0; i < menuList.size(); i++) {
                String menuItem = menuList.get(i).getText();
                if (menuItem.equals(enterMenuItem)) {
                    menuList.get(i).click();
                    ExtentLogger.pass("Selected "+enterMenuItem+" option from menu");
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void mouseOver(By by,WaitStrategy waitstrategy,String elementName){
        WebElement element =ExplicitWaitFactory.performExplicitWait(by, waitstrategy);
                element = DriverManager.getDriver().findElement(by);
        Actions action = new Actions(DriverManager.getDriver());
        action.moveToElement(element).perform();
        ExtentLogger.pass("Mouse overed on "+elementName+"");
    }

    protected String getPageTitle() {
        return DriverManager.getDriver().getTitle();
    }
}
