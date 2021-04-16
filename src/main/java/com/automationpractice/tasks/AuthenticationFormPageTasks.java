package com.automationpractice.tasks;

import com.automationpractice.appObjects.AuthenticationFormPageAppObject;
import com.automationpractice.utils.enuns.SelectBy;
import com.automationpractice.utils.report.Report;
import com.automationpractice.utils.selenium.ElementsTools;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AuthenticationFormPageTasks {

    private final AuthenticationFormPageAppObject authenticationFormPageAppObject;

    public AuthenticationFormPageTasks() {
        this.authenticationFormPageAppObject = new AuthenticationFormPageAppObject();
    }

    public void fillOutCustomerRegistration(String firstName,
                                            String lastName,
                                            String email,
                                            String password,
                                            String day,
                                            String month,
                                            String year,
                                            String company,
                                            String address,
                                            String city,
                                            String state,
                                            String postCode,
                                            String country,
                                            String phone) {
        clickTitleMisterRadioButton();
        fillInFirstNameTextfield(firstName);
        fillInLastNameTextfield(lastName);
        fillInEmailTextfield(email);
        fillInPasswordTextfield(password);
        selectDayBirthdayCombobox(day);
        selectMonthBirthdayCombobox(month);
        selectYearBirthdayCombobox(year);
        fillInCompanyTextfield(company);
        fillInAddressTextfield(address);
        fillInCityTextfield(city);
        fillInStateTextfield(state);
        fillInPostCodeTextfield(postCode);
        fillInCountryTextfield(country);
        fillInPhoneTextfield(phone);

        Report.log(Status.PASS, "O formulario foi preenchido sem erros.", true);
    }

    public void clickTitleMisterRadioButton() {
        WebElement element = this.authenticationFormPageAppObject.getTitleMisterRadioButton();
        ElementsTools.clickElement(element, "Mister");
    }

    public void clickRegisterButton() {
        WebElement element = this.authenticationFormPageAppObject.getRegisterButton();
        ElementsTools.clickElement(element, "Register");
    }

    public void fillInFirstNameTextfield(String firstName) {
        WebElement element = this.authenticationFormPageAppObject.getFirstNameTexfield();
        ElementsTools.fillTextField(element, "First Name", firstName);
    }

    public void fillInLastNameTextfield(String lastName) {
        WebElement element = this.authenticationFormPageAppObject.getLastNameTexfield();
        ElementsTools.fillTextField(element, "Last Name", lastName);
    }

    public void fillInEmailTextfield(String email) {
        WebElement element = this.authenticationFormPageAppObject.getEmailTexfield();
        element.clear();
        ElementsTools.fillTextField(element, "EMAIL", email);
    }

    public void fillInPasswordTextfield(String password) {
        WebElement element = this.authenticationFormPageAppObject.getPasswordTexfield();
        ElementsTools.fillTextField(element, "Password", password);
    }

    public void selectDayBirthdayCombobox(String day) {
        Select element = this.authenticationFormPageAppObject.getDayBirthdayCombobox();
        ElementsTools.selectOption(element, "Day Birthday", SelectBy.SELECT_BY_VALUE, day);
    }

    public void selectMonthBirthdayCombobox(String month) {
        Select element = this.authenticationFormPageAppObject.getMonthBirthdayCombobox();
        ElementsTools.selectOption(element, "Month Birthday", SelectBy.SELECT_BY_VALUE, month);
    }

    public void selectYearBirthdayCombobox(String year) {
        Select element = this.authenticationFormPageAppObject.getYearBirthdayCombobox();
        ElementsTools.selectOption(element, "Year Birthday", SelectBy.SELECT_BY_VALUE, year);
    }

    public void fillInCompanyTextfield(String company) {
        WebElement element = this.authenticationFormPageAppObject.getCompanyTextfield();
        ElementsTools.fillTextField(element, "Company", company);
    }

    public void fillInAddressTextfield(String address) {
        WebElement element = this.authenticationFormPageAppObject.getAddressTextfield();
        ElementsTools.fillTextField(element, "Address", address);
    }

    public void fillInCityTextfield(String city) {
        WebElement element = this.authenticationFormPageAppObject.getCityTextfield();
        ElementsTools.fillTextField(element, "City", city);
    }

    public void fillInStateTextfield(String state) {
        Select element = this.authenticationFormPageAppObject.getStateCombobox();
        ElementsTools.selectOption(element, "State", SelectBy.SELECT_BY_VISIBLE_TEXT, state);
    }

    public void fillInPostCodeTextfield(String postCode) {
        WebElement element = this.authenticationFormPageAppObject.getPostCodeTextfield();
        ElementsTools.fillTextField(element, "Post Code", postCode);
    }

    public void fillInCountryTextfield(String country) {
        Select element = this.authenticationFormPageAppObject.getCountryCombobox();
        ElementsTools.selectOption(element, "Country", SelectBy.SELECT_BY_VISIBLE_TEXT, country);
    }

    public void fillInPhoneTextfield(String phone) {
        WebElement element = this.authenticationFormPageAppObject.getPhoneTextfield();
        ElementsTools.fillTextField(element, "Phone", phone);
    }

    public void clickCartButton() {
        WebElement element = this.authenticationFormPageAppObject.getCartButton();
        ElementsTools.clickElement(element, "Cart");
    }
}
