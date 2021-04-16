package com.automationpractice.tasks;

import com.automationpractice.appObjects.HomePageAppObject;
import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.WebElement;

public class HomePageTasks{
    private final HomePageAppObject homePageAppObject;
    
    public HomePageTasks(){
        this.homePageAppObject = new HomePageAppObject();
    }
    
    public void selectItemByName(String name){
        WebElement element = this.homePageAppObject.getBlockItemSelectedByNameBlock(name);
        ElementsTools.centralizeElement(element);
        ElementsTools.clickElement(element,"Item: "+name);
    }

    public void clickSignInButton(){
        WebElement element = this.homePageAppObject.getSignInButton();
        ElementsTools.clickElement(element, "Sign In");
    }
}
