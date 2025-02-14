package testLoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLoginPageByFirefox {
    public static void main(String[] args) throws InterruptedException {
        // prepare the browser and open it
        WebDriver driver = new FirefoxDriver();
        driver.get("https://practice.expandtesting.com/login");
        driver.manage().window().maximize();
        // fill the input fields
        driver.findElement(By.id("username")).sendKeys("practice");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        // scroll to login form
        WebElement form = driver.findElement(By.className("card-body"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollBy(0, 700);", form);
        // wait
        Thread.sleep(3000);
        // Click the Login Button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class, 'btn-primary')]"));
        loginButton.click();
        // Wait
        Thread.sleep(4000);
        // click on Logout Button
        driver.findElement(By.xpath("//a[@class='button secondary radius btn btn-danger']")).click();
        // wait
        Thread.sleep(2000);
        // Close the Browser
        driver.close();



    }
}
