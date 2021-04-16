package com.automationpractice.testCases;

import com.automationpractice.tasks.*;
import com.automationpractice.utils.enuns.items.BlouseItem;
import com.automationpractice.utils.enuns.items.FadedShortSleeveTShirtsItem;
import com.automationpractice.utils.faker.CostumerFake;
import com.automationpractice.utils.faker.CostumerFakeManager;
import com.automationpractice.utils.report.Report;
import com.automationpractice.utils.selenium.Driver;
import com.automationpractice.verificationPoints.ConfirmationVerificationPoints;
import com.automationpractice.verificationPoints.YourPaymentMethodVerificationPoints;
import com.aventstack.extentreports.Status;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.fail;

public class AdicionarDoisItensNoCarrinhoCadastrarUsuarioFinalizarCompraComSucessoTestCase {

    @After
    public void tearDown() {
        Driver.killDriver();
        Report.endReport();
    }

    @Test
    public void main(){
        String description =
                "Historia do Usuario #1: \n" +
                        "Como futuro cliente no automationpractice.com\n" +
                        "Eu vou me cadastrar no site\n" +
                        "E quero fazer a compra de ao menos dois produtos\n" +
                        "Para que eu possa me vestir melhor";

        Report.initializeReport("comprar itens", description, false);
        try {
            AddressTasks addressTasks = new AddressTasks();
            HomePageTasks homePageTasks = new HomePageTasks();
            ShippingTasks shippingTasks = new ShippingTasks();
            AuthenticationFormPageTasks authenticationFormPageTasks = new AuthenticationFormPageTasks();
            GenericItemTasks genericItemTasks = new GenericItemTasks();
            AuthenticationTasks authenticationTasks = new AuthenticationTasks();
            BankWirePaymentTasks bankWirePaymentTasks = new BankWirePaymentTasks();
            YourShoppingCartTasks yourShoppingCartTasks = new YourShoppingCartTasks();
            YourPaymentMethodTasks yourPaymentMethodTasks = new YourPaymentMethodTasks();
            ConfirmationVerificationPoints confirmationVerificationPoints = new ConfirmationVerificationPoints();
            YourPaymentMethodVerificationPoints paymentMethodVerificationPoints = new YourPaymentMethodVerificationPoints();

            Report.appendScenarioTest("adicionarDoisItensNoCarrinhoCadastrarUsuarioFinalizarCompraComSucesso");

            CostumerFake costumerFake = CostumerFakeManager.getNewCostumerFake();

            homePageTasks.selectItemByName(BlouseItem.NAME.getValue());
            genericItemTasks.clickAddToCartButton();
            genericItemTasks.clickContinueShoppingButton();
            genericItemTasks.clickHomeIcon();
            homePageTasks.selectItemByName(FadedShortSleeveTShirtsItem.NAME.getValue());
            genericItemTasks.clickAddToCartButton();
            genericItemTasks.clickContinueShoppingButton();
            genericItemTasks.clickHomeIcon();
            homePageTasks.clickSignInButton();
            authenticationTasks.fillInCreateEmailAddressAccountTextfield(costumerFake.getEmail());

            authenticationTasks.clickCreateAccountButton();

            authenticationFormPageTasks.fillOutCustomerRegistration(
                    costumerFake.getName(),
                    costumerFake.getLastName(),
                    costumerFake.getEmail(),
                    costumerFake.getPassword(),
                    costumerFake.getDayBirthday() + "",
                    costumerFake.getMonthBirthday() + "",
                    costumerFake.getYearBirthday() + "",
                    costumerFake.getCompany(),
                    costumerFake.getStreet(),
                    costumerFake.getCity(),
                    costumerFake.getState(),
                    costumerFake.getPostalCode(),
                    costumerFake.getCountry(),
                    costumerFake.getPhone());

            authenticationFormPageTasks.clickRegisterButton();
            yourShoppingCartTasks.clickProceedToCheckoutButton();
            addressTasks.clickProceedCheckoutButton();
            shippingTasks.confirmShipping();

            paymentMethodVerificationPoints.checkDataItemInTheOrder(BlouseItem.NAME.getValue(),
                    BlouseItem.COLOR.getValue(),
                    BlouseItem.SIZE.getValue(),
                    BlouseItem.UNIT_PRICE.getValue(),
                    "1");

            paymentMethodVerificationPoints.checkDataItemInTheOrder(FadedShortSleeveTShirtsItem.NAME.getValue(),
                    FadedShortSleeveTShirtsItem.COLOR.getValue(),
                    FadedShortSleeveTShirtsItem.SIZE.getValue(),
                    FadedShortSleeveTShirtsItem.UNIT_PRICE.getValue(),
                    "1");

            double itemsSum = Double.parseDouble(BlouseItem.UNIT_PRICE.getValue()) +
                    Double.parseDouble(FadedShortSleeveTShirtsItem.UNIT_PRICE.getValue());

            paymentMethodVerificationPoints.checkOrderTotals(String.format("%.2f", itemsSum), "2.00", "0");

            yourPaymentMethodTasks.clickBankWireButton();
            bankWirePaymentTasks.clickIConfirmButton();

            confirmationVerificationPoints.checkConfirmationMessage("Your order on My Store is complete.");

        } catch (Exception e) {
            Report.log(Status.FAIL, "O teste falhou: " + e.getMessage(), false);
            fail(e.getMessage());
        }
    }
}
