package com.class24.Demo2;

public class WebsiteTester {
    public static void main(String[] args) {

        WebDriver webDriver = new FireFox();
        webDriver.openWebsite();
        webDriver.signupWebsite();
        webDriver.downloadFileFromWebsite();
        webDriver.closeWebsite();

        WebDriver[] webDriverArray={new googleChrome(), new FireFox()};
        for (WebDriver webDriver1:webDriverArray){
            webDriver1.openWebsite();
            webDriver1.signupWebsite();
            webDriver1.downloadFileFromWebsite();
            webDriver1.closeWebsite();
        }
    }
}
