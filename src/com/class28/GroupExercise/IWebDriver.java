package com.class28.GroupExercise;

public interface IWebDriver {
    void open();
    void close();
    void getTitle();
}

interface RemoteWebDriver extends IWebDriver, TakesScreenshot{
    void navigate();
}

interface TakesScreenshot{
    void getScreenshot();
}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open Google Chrome");
    }

    @Override
    public void close() {
        System.out.println("Close Google Chrome");
    }

    @Override
    public void getTitle() {
        System.out.println("Get title in Google Chrome");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate in Google Chrome");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take a screen shot in Google Chrome");
    }
}
class FireFox implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open FireFox");
    }

    @Override
    public void close() {
        System.out.println("Close FireFox");
    }

    @Override
    public void getTitle() {
        System.out.println("Get title in FireFox");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate in FireFox");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take a screen shot in FireFox");
    }
}

class Safari implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Open Safari");
    }

    @Override
    public void close() {
        System.out.println("Close Safari");
    }

    @Override
    public void getTitle() {
        System.out.println("Get title in Safari");
    }

    @Override
    public void navigate() {
        System.out.println("Navigate in Safari");
    }

    @Override
    public void getScreenshot() {
        System.out.println("Take a screen shot in Safari");
    }
}
