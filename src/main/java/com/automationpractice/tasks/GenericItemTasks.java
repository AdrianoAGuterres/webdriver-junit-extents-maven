package com.automationpractice.tasks;

import com.automationpractice.appObjects.GenericItemAppObject;
import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.WebElement;

public class GenericItemTasks {

    private final GenericItemAppObject genericItemAppObject;

    public GenericItemTasks(){
        this.genericItemAppObject = new GenericItemAppObject();
    }
    
    public void clickAddToCartButton(){
        WebElement element = this.genericItemAppObject.getAddToCartButton();
        ElementsTools.clickElement(element, "Add to cart");
    }

    public void clickContinueShoppingButton(){
        WebElement element = this.genericItemAppObject.getContinueShoppingButton();
        ElementsTools.clickElement(element, "Your Logo");
    }

    public void clickHomeIcon(){
        WebElement element = this.genericItemAppObject.getHomeIcon();
        ElementsTools.clickElement(element, "Home");
    }
}


