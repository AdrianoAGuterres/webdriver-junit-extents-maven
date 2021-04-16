package com.automationpractice.utils.enuns.items;

public enum BlouseItem {

    NAME ("Blouse"),
    UNIT_PRICE ("27.00"),
    SIZE ("S"),
    COLOR("Black");

    private final String value;

    BlouseItem(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}