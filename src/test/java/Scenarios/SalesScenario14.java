package Scenarios;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Sales Scenario")
public class SalesScenario14 extends OpenPage {


    @DisplayName("Scenario 14")
    @Test
    void ScenarioThree() {


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

        Elements.MixandMacthcurrentRecordName().sendKeys("KIWI PACKED 2 for £8.00");
        Elements.MixandMatchquantity().sendKeys("2");
        Elements.MixandMacthcurrentRewardAmount().sendKeys("£8.00");
        Elements.MixandMacthSubmenuProduct().sendKeys("KIWI PACKED");
        ElementsJS.pointFruitMenuKiwiPacked();

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


        ElementsJS.pointFruitMenu();
        ElementsJS.pointFruitMenuHKLM();
        ElementsJS.pointFruitMenuKiwiPacked();


        assertEquals("1", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£5.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");




        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.ninePopUp().click();
        Elements.fivePopUp().click();
        assertEquals("95", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

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


        assertEquals("2", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£2.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£8.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


        Elements.cash5Screen().click();


        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cash2Screen().click();

        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cash1Screen().click();

        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.Cscreen().click();

        try {
            Thread.sleep(800);
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


        Elements.MixandMacthfirst().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.DELETEmm().click();
        assertEquals("block", Elements.deleteAreYouSure().getCssValue("display"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.deleteAreYouSureYES().click();
        assertEquals("none", Elements.deleteAreYouSure().getCssValue("display"));

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

        Elements.MixandMacthcurrentRecordName().sendKeys("KIWI PACKED 3 for £12.00");
        Elements.MixandMatchquantity().sendKeys("3");
        Elements.MixandMacthcurrentRewardAmount().sendKeys("£12.00");
        Elements.MixandMacthSubmenuProduct().sendKeys("KIWI PACKED");
        ElementsJS.pointFruitMenuKiwiPacked();

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


        ElementsJS.pointFruitMenu();
        ElementsJS.pointFruitMenuHKLM();
        ElementsJS.pointFruitMenuKiwiPacked();



        assertEquals("1", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£5.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


        Elements.twoScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ElementsJS.pointFruitMenuKiwiPacked();

        Elements.Cscreen().click();

        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        assertEquals("3", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£3.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£12.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");



        Elements.cigaretteOrTobacco().click();
        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not pop up.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cigaretteOrTobaccoYes().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"),"The yes/no screen to confirm age did not close.");
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the price of the product.");

        Elements.eightPopUp().click();
        Elements.fourPopUp().click();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("84", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.");

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"),"The keyboard screen that opens to enter the price of the product is not closed.");


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        assertEquals("4", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£3.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£12.84", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


        Elements.cash50Screen().click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Elements.Cscreen().click();


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


        Elements.MixandMacthfirst().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.DELETEmm().click();
        assertEquals("block", Elements.deleteAreYouSure().getCssValue("display"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.deleteAreYouSureYES().click();
        assertEquals("none", Elements.deleteAreYouSure().getCssValue("display"));

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

        Elements.MixandMacthcurrentRecordName().sendKeys("KIWI PACKED 5 for £20.00");
        Elements.MixandMatchquantity().sendKeys("5");
        Elements.MixandMacthcurrentRewardAmount().sendKeys("£20.00");
        Elements.MixandMacthSubmenuProduct().sendKeys("KIWI PACKED");
        ElementsJS.pointFruitMenuKiwiPacked();

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
        Elements.ninePopUp().click();
        Elements.fivePopUp().click();
        assertEquals("95", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

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


        assertEquals("1", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£5.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");


        Elements.fourScreen().click();
        Elements.xScreen().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Elements.enterCode().click();
        assertEquals("block", Elements.modal().getCssValue("display"),"The keyboard screen did not open to enter the product's barcode.");
        Elements.ninePopUp().click();
        Elements.fivePopUp().click();
        assertEquals("95", Elements.keypadModalClass().getAttribute("value"),"The numbers entered on the keyboard screen that opens do not match.\n");

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


        assertEquals("5", Elements.basketItemCountTD().getAttribute("innerHTML"),"The number of items entered in the basket does not match.");
        assertEquals("£5.00", Elements.basketDiscountTD().getAttribute("innerHTML"),"The discount price in the basket does not match.");
        assertEquals("£20.00", Elements.basketSubtotalTD().getAttribute("innerHTML"),"The total price in the basket does not match.");




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


        Elements.MixandMacthfirst().click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.DELETEmm().click();
        assertEquals("block", Elements.deleteAreYouSure().getCssValue("display"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.deleteAreYouSureYES().click();
        assertEquals("none", Elements.deleteAreYouSure().getCssValue("display"));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Elements.homeModeBack().click();


    }
}
