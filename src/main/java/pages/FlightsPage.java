package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightsPage {

    WebDriver driver;

    public FlightsPage(WebDriver driver) {
        this.driver = driver;
    }

    By chooseFlightButton = By.xpath("(//input[@value='Choose This Flight'])[1]");

    public void chooseFlight() {
        driver.findElement(chooseFlightButton).click();
    }
}