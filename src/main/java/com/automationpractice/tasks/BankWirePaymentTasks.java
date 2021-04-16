package com.automationpractice.tasks;


import com.automationpractice.appObjects.BankWirePaymentAppObject;
import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.WebElement;

public class BankWirePaymentTasks {
    
    private final BankWirePaymentAppObject bankWirePaymentAppObject;
    
    public BankWirePaymentTasks(){
        this.bankWirePaymentAppObject = new BankWirePaymentAppObject();
    }
    
    public void clickIConfirmButton(){
        WebElement element = this.bankWirePaymentAppObject.getIConfirmButton();
        ElementsTools.clickElement(element, "I Confirm");
    }
}
