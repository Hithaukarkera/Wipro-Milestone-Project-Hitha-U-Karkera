package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage {

    WebDriver driver;

    public PurchasePage(WebDriver driver) {
        this.driver = driver;
    }

    By name = By.id("inputName");
    By address = By.id("address");
    By city = By.id("city");
    By state = By.id("state");
    By zipCode = By.id("zipCode");
    By cardType = By.id("cardType");
    By creditCardNumber = By.id("creditCardNumber");
    By creditCardMonth = By.id("creditCardMonth");
    By creditCardYear = By.id("creditCardYear");
    By nameOnCard = By.id("nameOnCard");
    By purchaseButton = By.xpath("//input[@value='Purchase Flight']");

    public void enterPassengerDetails() {

        driver.findElement(name).sendKeys("Hithaa");
        driver.findElement(address).sendKeys("Mangalore");
        driver.findElement(city).sendKeys("Mangalore");
        driver.findElement(state).sendKeys("Karnataka");
        driver.findElement(zipCode).sendKeys("575001");

        driver.findElement(creditCardNumber).sendKeys("1234567812345678");
        driver.findElement(creditCardMonth).clear();
        driver.findElement(creditCardMonth).sendKeys("12");
        driver.findElement(creditCardYear).clear();
        driver.findElement(creditCardYear).sendKeys("2027");

        driver.findElement(nameOnCard).sendKeys("Hitha U");
    }

    public void clickPurchaseFlight() {
        driver.findElement(purchaseButton).click();
    }
}