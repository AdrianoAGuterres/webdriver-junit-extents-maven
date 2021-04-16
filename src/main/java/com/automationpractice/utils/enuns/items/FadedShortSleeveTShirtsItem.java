package com.automationpractice.utils.enuns.items;

public enum FadedShortSleeveTShirtsItem {

    NAME ("Faded Short Sleeve T-shirts"),
    UNIT_PRICE ("16.51"),
    SIZE ("S"),
    COLOR("Orange");
    
    private final String value;
    
    FadedShortSleeveTShirtsItem(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}