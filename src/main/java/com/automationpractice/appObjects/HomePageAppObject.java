package com.automationpractice.appObjects;

import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePageAppObject{
    public WebElement getSignInButton(){
        return ElementsTools.waitForElement(new By.ByXPath("//*[@title='Log in to your customer account']"));
    }

    public WebElement getBlockItemSelectedByNameBlock(String name){
        String xpath = "//*[@id='homefeatured']//*[@class='product-name'][@title='"+name+"']";
        return ElementsTools.waitForElement(By.xpath(xpath));
    }
}
