package com.PageObjects;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PAGE_HomePage extends PAGE_Base {
    @Test
    public void checkHomePage()
    {
        List<WebElement> list=driver.findElements(By.tagName("*"));

        for(WebElement temp:list)
        {
            System.out.println("TagName:"+temp.getTagName()+" Text:"+temp.getText());
        }
    }
}
