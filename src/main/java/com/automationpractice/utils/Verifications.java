package com.automationpractice.utils;

import com.automationpractice.utils.report.Report;
import com.automationpractice.utils.selenium.ElementsTools;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;

public class Verifications {

    public static void compareElementWord(String fieldName, WebElement element, String expected) {
        String obtained = element.getText();
        ElementsTools.highlightElement(element);
        compareWord(fieldName, obtained, expected);
        ElementsTools.unHighlightElement(element);
    }

    public static void compareWord(String fieldName, String obtained, String expected) {
        String separator = System.lineSeparator();
        if (obtained.equalsIgnoreCase(expected)) {
            Report.log(Status.PASS, "O conteudo do campo " + fieldName + " esta correto: " + expected + "!", true);
        } else {
            String msg = "O conteudo do campo " + fieldName + " nao esta correto!" + separator +
                         "Conteudo esperado: " + expected + separator +
                         "Conteudo obtido: " + obtained;
            Report.log(Status.FAIL, msg, true);
            throw new AssertionError(msg);
        }
    }
}
