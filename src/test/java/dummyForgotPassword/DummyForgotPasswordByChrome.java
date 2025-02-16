package dummyForgotPassword;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyForgotPasswordByChrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/forgot-password");
        driver.manage().window().maximize();
        // enter E-mail
        driver.findElement(By.id("email")).sendKeys("engabosaber2014@gmail.com");
        // scroll to Retrieve Button
        WebElement form = driver.findElement(By.xpath("//div[@class='card-body']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", form);
        // Wait
        Thread.sleep(2000);
        WebElement retrieveButton = driver.findElement(By.xpath("//button[contains(@class, 'btn-primary')]"));
        retrieveButton.click();
        // Wait
        Thread.sleep(3000);
        // Close the Browser
        driver.close();

    }
}
