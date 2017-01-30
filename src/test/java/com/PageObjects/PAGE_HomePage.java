package com.PageObjects;

import com.Setup.Constants;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PAGE_HomePage extends PAGE_Base {
    @Test
    public void checkHomePageLayout()
    {
       WebElement tutorials= driver.findElement(By.partialLinkText(Constants.homepage_tutorials_pLT));
       WebElement references=driver.findElement(By.partialLinkText(Constants.homepage_references_plT));
       WebElement examples=driver.findElement(By.partialLinkText(Constants.homepage_examples_pLT));
       WebElement globe=driver.findElement(By.xpath(Constants.homepage_globe_xpath));
        WebElement search=driver.findElement(By.xpath(Constants.homepage_search_xpath));

        if(tutorials.isDisplayed()&&references.isDisplayed() && examples.isDisplayed() && globe.isDisplayed() && search.isDisplayed())
        {
            System.out.println("w3schools home page is displayed");
            assert true;
        }
        else
        {
            System.out.println("One of the element in the home page is not displayed");
            assert false;
        }
    }
}
