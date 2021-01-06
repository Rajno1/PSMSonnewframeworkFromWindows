package com.issi.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer {

    private int count =0;
    private int maxretries =1;

    @Override
    public boolean retry(ITestResult result) {
        boolean value = count<maxretries;
        count++;
        return value;
    }
}
