package com.class28.NewTask;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver webDriver=new ChromeDriver();
        webDriver.openBrowser();
        webDriver.maximizeWindow();
        webDriver.findElement();
        webDriver.closeBrowser();
    }
}
