package com.Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Created by asapu on 1/28/2017.
 */
public class CreateDriver {
    public static WebDriver getChromeDriver()
    {
        System.setProperty("webdriver.chrome.driver","C:/Users/asapu/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        return driver;
    }
    public static WebDriver getEdgeDriver()
    {
        System.setProperty("webdriver.chrome.driver","C:/Users/asapu/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new EdgeDriver();
        return driver;
    }
}
