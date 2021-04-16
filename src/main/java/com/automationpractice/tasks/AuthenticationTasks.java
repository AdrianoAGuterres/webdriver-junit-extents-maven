package com.automationpractice.tasks;

import com.automationpractice.appObjects.AuthenticationAppObject;
import com.automationpractice.utils.selenium.ElementsTools;
import org.openqa.selenium.WebElement;

public class AuthenticationTasks {

    private final AuthenticationAppObject authenticationAppObject;

    public AuthenticationTasks() {
        this.authenticationAppObject = new AuthenticationAppObject();
    }

    public void fillInCreateEmailAddressAccountTextfield(String email) {
        WebElement element = this.authenticationAppObject.getEmailAddressCreateTextfield();
        ElementsTools.fillTextField(element, "Email", email);
    }

    public void clickCreateAccountButton() {
        WebElement element = this.authenticationAppObject.getCreateAccountButton();
        ElementsTools.clickElement(element, "Create Account");
    }

    public void fillInRegisteredEmailAddressAccountTextfield(String email) {
        WebElement element = this.authenticationAppObject.getRegisteredEmailAddressTextfield();
        ElementsTools.fillTextField(element, "Email", email);
    }

    public void fillInRegisteredPasswordAccountTextfield(String password) {
        WebElement element = this.authenticationAppObject.getRegisteredPasswordTextfield();
        ElementsTools.fillTextField(element, "Password", password);
    }

    public void clickRegisteredSignInButton() {
        WebElement element = this.authenticationAppObject.getRegisteredSignInButton();
        ElementsTools.clickElement(element, "Sign in");
    }
}
