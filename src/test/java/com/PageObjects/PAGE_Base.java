package com.PageObjects;


import com.Setup.Constants;
import com.Setup.CreateDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;


/**
 * Created by asapu on 1/28/2017.
 */
public class PAGE_Base {
    WebDriver driver;
    @Before
    public void openBrowser()
    {
        driver= CreateDriver.getChromeDriver();
        driver.get(Constants.baseUrl);
        driver.manage().window().maximize();
    }
    @After
    public void closeBrowser()
    {
        driver.close();
    }
}
