package com.automationpractice.tasks;

import com.automationpractice.appObjects.YourShoppingCartAppObject;
import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.WebElement;

public class YourShoppingCartTasks {
    private final YourShoppingCartAppObject yourShoppingCartAppObject;
    
    public YourShoppingCartTasks(){
        this.yourShoppingCartAppObject = new YourShoppingCartAppObject();
    }
    
    public void clickProceedToCheckoutButton(){
        WebElement element = this.yourShoppingCartAppObject.getProceedToCheckoutButton();
        ElementsTools.clickElement(element, "Proceed To Checkout");
    }
}
