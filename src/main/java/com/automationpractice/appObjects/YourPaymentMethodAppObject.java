package com.automationpractice.appObjects;

import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class YourPaymentMethodAppObject {
    public WebElement getBankWireButton(){
        return ElementsTools.waitForElement(By.cssSelector(".bankwire"));
    }

    public WebElement getItemNameLabel(String name){
        String xpath = "//tr/td[@class='cart_description']/p/a[contains(text(), '"+name+"')]";
        return ElementsTools.waitForElement(By.xpath(xpath));
    }

    public WebElement getItemColorSizeLabel(String name){
        String xpath = "//td[@class='cart_description']/p/a[contains(text(), '"+name+"')]/ancestor::td/small/a";
        return ElementsTools.waitForElement(By.xpath(xpath));
    }

    public WebElement getItemUnitPriceLabel(String name){
        String xpath = "//td[@class='cart_description']/p/a[contains(text(), '"+name+"')]/ancestor::tr/td[@class='cart_unit']/span/span";
        return ElementsTools.waitForElement(By.xpath(xpath));
    }

    public WebElement getItemQuantityLabel(String name){
        String xpath = "//td[@class='cart_description']/p/a[contains(text(), '"+name+"')]/ancestor::tr/td[@class='cart_quantity text-center']/span";
        return ElementsTools.waitForElement(By.xpath(xpath));
    }

    public WebElement getItemSumTotalLabel(String name){
        String xpath = "//td[@class='cart_description']/p/a[contains(text(), '"+name+"')]/ancestor::tr/td[@class='cart_total']/span";
        return ElementsTools.waitForElement(By.xpath(xpath));
    }

    public WebElement getOrderItemsSumLabel(){
        return ElementsTools.waitForElement(By.xpath("//tfoot/tr[1]/td[2]"));
    }

    public WebElement getTotalShippingLabel(){
        return ElementsTools.waitForElement(By.id("total_shipping"));
    }

    public WebElement getTotalOrderLabel(){
        return ElementsTools.waitForElement(By.id("total_price"));
    }
}
