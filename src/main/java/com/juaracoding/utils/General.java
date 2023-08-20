package com.juaracoding.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class General {

    private static WebDriver driver;
    private JavascriptExecutor jse;

    public General(WebDriver driver) {
        this.driver = driver;
        this.jse = (JavascriptExecutor) driver;
    }

    public static void delay(long sec){
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public void scrollBy(int x, int y) {
        String script = String.format("window.scrollBy(%d, %d);", x, y);
        jse.executeScript(script);
    }
    public static void maximize(WebDriver driver){
        driver.manage().window().maximize();
    }
    public static void refresh(WebDriver driver){
        driver.navigate().refresh();
    }
    public static void back(WebDriver driver){
        driver.navigate().back();
    }
}
