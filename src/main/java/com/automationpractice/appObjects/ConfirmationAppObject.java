package com.automationpractice.appObjects;

import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ConfirmationAppObject {
    
    public WebElement getConfirmationLabel(){
        return ElementsTools.waitForElement(By.xpath("//*[@id='center_column']/div/p/strong"));
    }
    
}
