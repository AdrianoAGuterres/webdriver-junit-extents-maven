package com.automationpractice.appObjects;

import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GenericItemAppObject {

    public WebElement getAddToCartButton(){
        return ElementsTools.waitForElement(By.id("add_to_cart"));
    }

    public WebElement getContinueShoppingButton(){
        return ElementsTools.waitForElement(By.xpath("//*[@title='Continue shopping']"));
    }

    public WebElement getHomeIcon(){
        return ElementsTools.waitForElement(By.className("icon-home"));
    }
}
