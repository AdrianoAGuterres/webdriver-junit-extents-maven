package com.automationpractice.appObjects;

import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AuthenticationAppObject {
    
    public WebElement getEmailAddressCreateTextfield(){
        return ElementsTools.waitForElement(By.id("email_create"));
    }

    public WebElement getRegisteredEmailAddressTextfield(){
        return ElementsTools.waitForElement(By.id("email"));
    }

    public WebElement getRegisteredPasswordTextfield(){
        return ElementsTools.waitForElement(By.id("passwd"));
    }

    public WebElement getRegisteredSignInButton(){
        return ElementsTools.waitForElement(By.id("SubmitLogin"));
    }
    
    public WebElement getCreateAccountButton(){
        return ElementsTools.waitForElement(By.name("SubmitCreate"));
    }
}
