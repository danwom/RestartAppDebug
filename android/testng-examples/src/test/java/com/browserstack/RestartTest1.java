package com.browserstack;

import java.io.File;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class RestartTest1 extends AppiumTest {

    @Test
    public void test() throws Exception {
    // String packageName = driver.getCapabilities().asMap().get("bundleID").toString();
    String packageName = "org.wikipedia.alpha";
    Thread.sleep(5000);
    
    
    driver.terminateApp(packageName);
    driver.activateApp(packageName);
    Thread.sleep(5000);
    }
}
