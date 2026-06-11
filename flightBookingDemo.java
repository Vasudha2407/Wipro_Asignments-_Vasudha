package Day25;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class flightBookingDemo {

    public static void main(String[] args)
            throws InterruptedException {

        // Launch Browser
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Explicit Wait
        WebDriverWait wait =
                new WebDriverWait(driver,
                Duration.ofSeconds(15));

        // Open Website
        driver.get("https://phptravels.net/");

        // ==========================================
        // CLOSE DEMO POPUP
        // ==========================================

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("acknowledgeDemoWarning")
                )
        ).click();

        // ==========================================
        // OPEN FLIGHTS MODULE
        // ==========================================

        WebElement flightsTab =
                wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(.,'Flights')]")
                )
        );

        flightsTab.click();

        System.out.println("Flights module opened");

        // ==========================================
        // ENTER FROM CITY
        // ==========================================

        WebElement fromCity =
                wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//input[@placeholder='Departure City or Airport']")
                )
        );

        fromCity.sendKeys("Hyderabad");

        WebElement hydOption =
                wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//span[contains(text(),'HYD')]")
                )
        );

        hydOption.click();

        System.out.println("Departure city selected");

        // ==========================================
        // ENTER DESTINATION
        // ==========================================

        WebElement toCity =
                wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//input[@placeholder='Arrival City or Airport']")
                )
        );

        toCity.sendKeys("Goa");

        WebElement goaOption =
                wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//span[contains(text(),'GOI')]")
                )
        );

        goaOption.click();

        System.out.println("Destination selected");

        // ==========================================
        // SEARCH FLIGHTS
        // ==========================================

        WebElement searchFlights =
                wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//span[contains(text(),'Search Flights')]")
                )
        );

        searchFlights.click();

        System.out.println("Searching flights...");

        // ==========================================
        // FLUENT WAIT
        // ==========================================

        FluentWait<WebDriver> fluentWait =
                new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(Exception.class);

        System.out.println("Waiting for flight results...");

        // ==========================================
        // WAIT FOR FLIGHT RESULTS
        // ==========================================

        WebElement firstBookNow = wait.until(
                ExpectedConditions.refreshed(
                        ExpectedConditions.elementToBeClickable(
                                By.xpath("//button[contains(.,'Book Now')]")
                        )
                )
        );

        System.out.println("Flight results loaded successfully");

        // ==========================================
        // VALIDATION
        // ==========================================

        if (firstBookNow.isDisplayed()) {

            System.out.println("Flights displayed");

        } else {

            System.out.println("Flights NOT displayed");
        }

        // ==========================================
        // CLOSE BROWSER
        // ==========================================

        Thread.sleep(3000);

        driver.quit();

        System.out.println("Automation completed");
    }
}