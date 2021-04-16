package com.automationpractice.utils.enuns.users;

public enum Datum {
    PASSWORD ("datum2021"),
    EMAIL ("datumqatest@soprock.com"),;

    private final String value;

    Datum(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
}