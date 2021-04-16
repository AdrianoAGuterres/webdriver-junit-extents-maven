package com.automationpractice.appObjects;

import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class YourShoppingCartAppObject {
    public WebElement getProceedToCheckoutButton(){
        return ElementsTools.waitForElement(By.cssSelector("a.standard-checkout > span"));
    }
}
