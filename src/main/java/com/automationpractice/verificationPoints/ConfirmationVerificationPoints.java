package com.automationpractice.verificationPoints;


import com.automationpractice.appObjects.ConfirmationAppObject;
import com.automationpractice.utils.Verifications;
import org.openqa.selenium.WebElement;

public class ConfirmationVerificationPoints {
    private final ConfirmationAppObject confirmationAppObject;

    public ConfirmationVerificationPoints() {
        this.confirmationAppObject = new ConfirmationAppObject();
    }

    public void checkConfirmationMessage(String message) {
        WebElement element = this.confirmationAppObject.getConfirmationLabel();
        Verifications.compareElementWord("Mensagem de confirmacao ", element, message);
    }

}
