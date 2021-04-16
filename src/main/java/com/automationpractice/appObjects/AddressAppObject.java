package com.automationpractice.appObjects;


import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddressAppObject{
    public WebElement getProceedCheckoutButton(){
        return ElementsTools.waitForElement(By.name("processAddress"));
    }

}
