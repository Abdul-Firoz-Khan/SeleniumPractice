package com.afk;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Auto Suggestion Dropdown Demo
 */
public class AutoSuggestionDropdownDemo {
    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver using WebDriverManager
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        try {
            // Navigate to the MakeMyTrip website
            driver.get("https://www.makemytrip.com/");

            // Wait for the page to load
            Thread.sleep(3000);

            driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
            // Click on the "From City" label to activate the input field
            driver.findElement(By.xpath("//label[@for='fromCity']")).click();

            // Wait for the input field to become active
            Thread.sleep(3000);

            // Find the "From" input field and enter "Sydney"
            WebElement from = driver.findElement(By.xpath("//input[@placeholder='From']"));
            from.sendKeys("Sydney");

            // Wait for the auto-suggestion dropdown to appear
            Thread.sleep(3000);

            // Navigate through the auto-suggestion dropdown using the arrow down key
            from.sendKeys(Keys.ARROW_DOWN);

            // Wait for the auto-suggestion selection to process
            Thread.sleep(3000);

            // Confirm the selection by pressing the Enter key
            from.sendKeys(Keys.ENTER);


            JavascriptExecutor javascriptExecutor= (JavascriptExecutor)driver;
            javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");


        } finally {
            // Wait for a few seconds before closing the browser
            Thread.sleep(4000);

            // Close the browser
            driver.quit();
        }
    }
}
