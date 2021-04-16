package com.automationpractice.tasks;

import com.automationpractice.appObjects.AddressAppObject;
import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.WebElement;

public class AddressTasks{
    
    private final AddressAppObject addressAppObject;
    
    public AddressTasks(){
        this.addressAppObject = new AddressAppObject();
    }
    
    public void clickProceedCheckoutButton(){
        WebElement element = this.addressAppObject.getProceedCheckoutButton();
        ElementsTools.centralizeElement(element);
        ElementsTools.clickElement(element, "Proceed To Checkout");
    }
}
