package testRegisterPageForAutomationTestingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestRegisterPageByFirefox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        // open the browser
        driver.get("https://practice.expandtesting.com/register");
        driver.manage().window().maximize();
        // fill input fields
        driver.findElement(By.id("username")).sendKeys("Saber445500");
        driver.findElement(By.id("password")).sendKeys("445500");
        driver.findElement(By.id("confirmPassword")).sendKeys("445500");
        // scroll to Register Button
        WebElement buttonRegister = driver.findElement(By.className("btn-primary"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", buttonRegister);
        // wait
        Thread.sleep(3000);
        // click Register Button
        driver.findElement(By.xpath("//button[contains(@class, 'btn-primary')]")).click();
        // Login in
        driver.findElement(By.id("username")).sendKeys("Saber445500");
        driver.findElement(By.id("password")).sendKeys("445500");
        // scroll to footer in Login Page
        WebElement buttonLogin = driver.findElement(By.className("btn-primary"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", buttonLogin);
        // wait
        Thread.sleep(3000);
        // click Login Button
        driver.findElement(By.xpath("//button[contains(@class, 'btn-primary')]")).click();
        // wait
        Thread.sleep(3000);
        // scroll to Logout Button
        WebElement buttonLogout = driver.findElement(By.className("btn-danger"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", buttonLogout);
        // click logout
        driver.findElement(By.xpath("//a[contains(@class, 'btn-danger')]")).click();
        // wait
        Thread.sleep(3000);
        // close the Browser
        driver.close();

    }
}
