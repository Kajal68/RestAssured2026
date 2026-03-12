package com.api.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	private static final Logger logger = LogManager.getLogger(TestListener.class);

	public void onStart(ITestResult result) {

		logger.info("Test Suite Started!!");
	}

	public void onTestSuccess(ITestResult result) {
		logger.info("Passed!!!!" + result.getMethod().getMethodName());

	}

	public void onTestFail(ITestResult result) {
		logger.error("Failed!!!!" + result.getMethod().getMethodName());

	}

	public void onTestFinish(ITestResult result) {
		logger.info("Test Suite Failed!!");

	}
}
