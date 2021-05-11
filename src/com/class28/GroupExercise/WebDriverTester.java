package com.class28.GroupExercise;

public class WebDriverTester {
    public static void main(String[] args) {
        RemoteWebDriver[] drivers={new ChromeDriver(), new FireFox(), new Safari()};

        for(RemoteWebDriver driver:drivers){
            driver.open();
            driver.navigate();
            driver.getTitle();
            driver.getScreenshot();
            driver.close();
            System.out.println();
        }
    }
}
