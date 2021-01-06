package com.issi.listeners;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.issi.reports.EmailReportWithAttachment;
import com.issi.reports.ExtentLogger;
import com.issi.reports.ExtentReport;
import org.testng.*;

import java.util.Arrays;

public class listenerClass implements ITestListener, ISuiteListener {
    @Override
    public void onStart(ISuite suite) {
        ExtentReport.initReport();
    }

    @Override
    public void onFinish(ISuite suite) {
        ExtentReport.flushReports();
        EmailReportWithAttachment.mailTheReport();
    }

    @Override
    public void onTestStart(ITestResult result) {
        ExtentReport.createExtentTest(result.getMethod().getMethodName());          //creating node for extenttest and with reflection it will get method name automatically
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        //ExtentLogger.pass(MarkupHelper.createLabel(result.getMethod().getMethodName()+" is passed ",ExtentColor.GREEN),false);
       ExtentLogger.pass(result.getMethod().getMethodName() + " is passed ", false);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getMethod().getMethodName() + " was failed miserably ",true);
        // if true screenshot will be attached
        ExtentLogger.fail(result.getThrowable().toString());
      //  ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentLogger.skip(result.getMethod().getMethodName() + " is skipped ",false);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

        /*

         */
    }

    @Override
    public void onStart(ITestContext context) {

        /*
         We haave only one test in suite
         */
    }

    @Override
    public void onFinish(ITestContext context) {

    }
}
