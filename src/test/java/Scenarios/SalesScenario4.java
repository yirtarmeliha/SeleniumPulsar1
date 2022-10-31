package Scenarios;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DisplayName("Sales Scenario")
public class SalesScenario4 extends OpenPage {


    @DisplayName("Scenario 4")
    @Test
    void ScenarioFour() {

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.onePopUp().click();
        Elements.ninePopUp().click();

        assertEquals("19", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.onePopUp().click();
        Elements.ninePopUp().click();

        assertEquals("19", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));



        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        ElementsJS.FruitAndVegMenuKG();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.threePopUp().click();
        Elements.doubleZeroPopUp().click();
        Elements.zeroPopUp().click();
        Elements.onePopUp().click();
        assertEquals("30001", Elements.keypadModalClass().getAttribute("value"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.backPopUp().click();
        assertEquals("3000", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.threePopUp().click();
        Elements.doubleZeroPopUp().click();
        Elements.zeroPopUp().click();
        assertEquals("3000", Elements.keypadModalClass().getAttribute("value"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.backPopUp().click();
        assertEquals("300", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Elements.sixScreen().click();
        Elements.zeroScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cigaretteOrTobacco().click();
        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cigaretteOrTobaccoYes().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"));
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.fourPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("400", Elements.keypadModalClass().getAttribute("value"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"));
        assertEquals("£249.00", Elements.basketSubtotalTD().getAttribute("innerHTML"));
        assertEquals("62", Elements.basketItemCountTD().getAttribute("innerHTML"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.twoScreen().click();
        Elements.zeroScreen().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.functions().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.discountPercent().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£1.80", Elements.basketDiscountTD().getAttribute("innerHTML"));

        Elements.productScreenFour().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cancelDiscount().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"));

        Elements.nineScreen().click();
        Elements.fourScreen().click();
        Elements.doubleZeroScreen().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.discountAmount().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£94.00", Elements.basketDiscountTD().getAttribute("innerHTML"));


        Elements.fiveScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.sevenPopUp().click();
        Elements.threePopUp().click();
        Elements.zeroPopUp().click();
        assertEquals("730", Elements.keypadModalClass().getAttribute("value"));
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        Elements.enterPopUp().click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        assertEquals("none", Elements.modal().getCssValue("display"));


        Elements.Cscreen().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.ninePopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("900", Elements.keypadModalClass().getAttribute("value"));
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        Elements.enterPopUp().click();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        assertEquals("none", Elements.modal().getCssValue("display"));


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£200.50", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.productScreenFive().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.voidLine().click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£191.50", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.functions().click();
        ElementsJS.pointFruitMenu();
        Elements.twoScreen().click();
        Elements.zeroScreen().click();
        Elements.xScreen().click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ElementsJS.pointFruitMenuAVOCADO();
        Elements.pointVegAndFruitMenuOK().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£94.00", Elements.basketDiscountTD().getAttribute("innerHTML"));

        Elements.cardScreen().click();
        assertEquals("block", Elements.StartcardtransactionYesNo().getCssValue("display"));
        Elements.StartcardtransactionNo().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("none", Elements.StartcardtransactionYesNo().getCssValue("display"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cardScreen().click();
        assertEquals("block", Elements.StartcardtransactionYesNo().getCssValue("display"));
        Elements.StartcardtransactionYes().click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("none", Elements.StartcardtransactionYesNo().getCssValue("display"));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.Cscreen().click();







    }
}
