package Scenarios;

import org.junit.jupiter.api.*;


import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Sales Scenario")
public class SalesScenario1 extends OpenPage{

    @DisplayName("Scenario 1")
    @Test
    void ScenarioOne(){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.fivePopUp().click();
        Elements.zeroPopUp().click();
        assertEquals("50", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();
        driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£0.00", Elements.basketDiscountTD().getAttribute("innerHTML"));
        assertEquals("£0.50", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cigaretteOrTobacco().click();
        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"));
        Elements.cigaretteOrTobaccoNo().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cigaretteOrTobacco().click();
        assertEquals("block", Elements.ConfirmAgePopUp().getCssValue("display"));
        Elements.cigaretteOrTobaccoYes().click();
        assertEquals("none", Elements.ConfirmAgePopUp().getCssValue("display"));
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.sixPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("600", Elements.keypadModalClass().getAttribute("value"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.cigaretteOrTobacco().click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("£12.50", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.grocery().click();
        assertEquals("block", Elements.modal().getCssValue("display"));
        Elements.eightPopUp().click();
        Elements.doubleZeroPopUp().click();
        assertEquals("800", Elements.keypadModalClass().getAttribute("value"));
        Elements.enterPopUp().click();
        assertEquals("none", Elements.modal().getCssValue("display"));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertEquals("4", Elements.basketItemCountTD().getAttribute("innerHTML"));
        assertEquals("£20.50", Elements.basketSubtotalTD().getAttribute("innerHTML"));

        Elements.cash50Screen().click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Elements.Cscreen().click();



    }


}