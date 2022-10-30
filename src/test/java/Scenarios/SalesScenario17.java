package Scenarios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Sales Scenario")
public class SalesScenario17 extends OpenPage {


    @DisplayName("Scenario 17")
    @Test
    void ScenarioSix() {


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Elements.homeMode().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.management().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.mixAndMatch().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.create().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.MixandMacthcurrentRecordName().sendKeys("POTATOES RED 2KG FOR £4.00");
        Elements.MixandMatchquantity().sendKeys("2");
        Elements.MixandMacthcurrentRewardAmount().sendKeys("£4.00");
        Elements.MixandMacthSubmenuProduct().sendKeys("POTATOES RED");
        ElementsJS.pointVegMenuPOTATOESRED();


        Elements.SAVEmm().click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.homeModeBack().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.onePopUp().click();
        Elements.fourPopUp().click();
        Elements.threePopUp().click();
        Elements.fourPopUp().click();
        Elements.sixPopUp().click();
        Elements.ninePopUp().click();
        assertEquals("143469", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the weight of the product.");
        Elements.onePopUp().click();
        Elements.zeroPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("1000", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the weight of the product is not closed.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        assertEquals("1", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£3.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");






        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.onePopUp().click();
        Elements.fourPopUp().click();
        Elements.threePopUp().click();
        Elements.fourPopUp().click();
        Elements.sixPopUp().click();
        Elements.ninePopUp().click();
        assertEquals("143469", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the weight of the product.");
        Elements.onePopUp().click();
        Elements.zeroPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("1000", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the weight of the product is not closed.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        assertEquals("2", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£2.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£4.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


        Elements.cardScreen().click();
        assertEquals("block", Elements.StartcardtransactionYesNo().getCssValue("display"),"The yes/no screen to start card transaction did not pop up.\n");
        Elements.StartcardtransactionYes().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("none", Elements.StartcardtransactionYesNo().getCssValue("display"),"The yes/no screen to start card transaction did not close.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Elements.Cscreen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        ElementsJS.pointVegMenu();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ElementsJS.pointVEGMenuP();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ElementsJS.pointVegMenuPOTATOESRED();

        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the weight of the product.");
        Elements.threePopUp().click();
        Elements.zeroPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("3000", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the weight of the product is not closed.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        Elements.Cscreen().click();


        assertEquals("1", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£2.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£7.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");




        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.onePopUp().click();
        Elements.fourPopUp().click();
        Elements.threePopUp().click();
        Elements.fourPopUp().click();
        Elements.sixPopUp().click();
        Elements.ninePopUp().click();
        assertEquals("143469", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the product's barcode is not closed.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the weight of the product.");
        Elements.onePopUp().click();
        Elements.zeroPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("1000", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the weight of the product is not closed.");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }





        assertEquals("2", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£4.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£8.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");



        Elements.cardScreen().click();
        assertEquals("block", Elements.StartcardtransactionYesNo().getCssValue("display"),"The yes/no screen to start card transaction did not pop up.\n");
        Elements.StartcardtransactionYes().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("none", Elements.StartcardtransactionYesNo().getCssValue("display"),"The yes/no screen to start card transaction did not close.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Elements.Cscreen().click();


    }
}
