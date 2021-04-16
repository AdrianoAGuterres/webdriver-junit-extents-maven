package com.automationpractice.tasks;

import com.automationpractice.appObjects.YourPaymentMethodAppObject;
import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.WebElement;

public class YourPaymentMethodTasks {
    private final YourPaymentMethodAppObject yourPaymentMethodAppObject;
    
    public YourPaymentMethodTasks(){
        this.yourPaymentMethodAppObject = new YourPaymentMethodAppObject();
    }
    
    public void clickBankWireButton(){
        WebElement element = this.yourPaymentMethodAppObject.getBankWireButton();
        ElementsTools.clickElement(element, "Bank Wire");
    }

}
