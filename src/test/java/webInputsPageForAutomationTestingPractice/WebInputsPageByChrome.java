package webInputsPageForAutomationTestingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class WebInputsPageByChrome {
    public static void main(String[] args) throws InterruptedException {
        // Open the Browser and maximize it
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/inputs");
        driver.manage().window().maximize();
        // Filling the inputs with valid data
        driver.findElement(By.id("input-number")).sendKeys("2025");
        driver.findElement(By.id("input-text")).sendKeys("Free Palestine");
        driver.findElement(By.id("input-password")).sendKeys("Palestine2025");
        // Choose the date
        WebElement dateInput = driver.findElement(By.id("input-date"));
        // Scroll into view using JavaScript
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", dateInput);
        dateInput.sendKeys("09/29/1993");
        // wait until choosing date
        Thread.sleep(5000);
        // Click Display button
        WebElement displayButton = driver.findElement(By.id("btn-display-inputs"));
        displayButton.click();
        // wait data until appear
        Thread.sleep(5000);
        // Click Clear button
        WebElement clearButton = driver.findElement(By.id("btn-clear-inputs"));
        clearButton.click();
        // Make the Browser to wait before closing
        TimeUnit.SECONDS.sleep(5);
        // Close the Browser
        driver.close();
    }
}
