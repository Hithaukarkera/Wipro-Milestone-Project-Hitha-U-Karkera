package tests;

import base.BaseTest;
import pages.HomePage;
import pages.FlightsPage;
import pages.PurchasePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightBookingTest extends BaseTest {

    @Test
    public void bookFlightTest() {

        HomePage home = new HomePage(driver);
        FlightsPage flights = new FlightsPage(driver);
        PurchasePage purchase = new PurchasePage(driver);

        home.selectDepartureCity("Boston");
        home.selectDestinationCity("New York");
        home.clickFindFlights();

        flights.chooseFlight();

        purchase.enterPassengerDetails();
        purchase.clickPurchaseFlight();

        String confirmation = driver.getTitle();

        Assert.assertTrue(confirmation.contains("BlazeDemo"));
    }
}