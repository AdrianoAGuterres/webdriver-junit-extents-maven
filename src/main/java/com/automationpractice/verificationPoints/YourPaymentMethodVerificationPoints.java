package com.automationpractice.verificationPoints;


import com.automationpractice.appObjects.YourPaymentMethodAppObject;
import com.automationpractice.utils.Verifications;
import org.openqa.selenium.WebElement;

public class YourPaymentMethodVerificationPoints {
    private final YourPaymentMethodAppObject yourPaymentMethodAppObject;

    public YourPaymentMethodVerificationPoints() {
        this.yourPaymentMethodAppObject = new YourPaymentMethodAppObject();
    }

    public void checkDataItemInTheOrder(String name, String color, String size, String unitPrice, String qtd) {
        WebElement eleName = this.yourPaymentMethodAppObject.getItemNameLabel(name);
        WebElement eleColorSize = this.yourPaymentMethodAppObject.getItemColorSizeLabel(name);
        WebElement eleUnitPrice = this.yourPaymentMethodAppObject.getItemUnitPriceLabel(name);
        WebElement eleQtd = this.yourPaymentMethodAppObject.getItemQuantityLabel(name);
        WebElement eleSumTotal = this.yourPaymentMethodAppObject.getItemSumTotalLabel(name);

        String colorSizeExpected = "Color : " + color + ", Size : " + size;
        String sumTotalExpected = String.format("$%.2f", Double.parseDouble(unitPrice) * Integer.parseInt(qtd));

        Verifications.compareElementWord("Nome do Item ", eleName, name);
        Verifications.compareElementWord("Cor e tamanho do produto", eleColorSize, colorSizeExpected);
        Verifications.compareElementWord("Preco unitario do produto", eleUnitPrice, "$" + unitPrice);
        Verifications.compareElementWord("Quantidade total do produto", eleQtd, qtd);
        Verifications.compareElementWord("Soma total do produto", eleSumTotal, sumTotalExpected);
    }

    public void checkOrderTotals(String orderItemsSum, String taxShipping, String tax) {
        WebElement element_sum = this.yourPaymentMethodAppObject.getOrderItemsSumLabel();
        WebElement element_shipping = this.yourPaymentMethodAppObject.getTotalShippingLabel();
        WebElement element_total = this.yourPaymentMethodAppObject.getTotalOrderLabel();

        double total = Double.parseDouble(orderItemsSum)+Double.parseDouble(taxShipping)+Double.parseDouble(tax);
        String totalExpected = String.format("$%.2f",total);

        Verifications.compareElementWord("Soma dos produtos no pedido", element_sum, "$"+orderItemsSum);
        Verifications.compareElementWord("Total do envio", element_shipping, "$"+taxShipping);
        Verifications.compareElementWord("Total do pedido", element_total, totalExpected);
    }

}
