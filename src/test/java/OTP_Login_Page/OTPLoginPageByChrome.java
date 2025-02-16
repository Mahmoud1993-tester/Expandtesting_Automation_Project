package OTP_Login_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OTPLoginPageByChrome {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/otp-login");
        // Enter E-mail to OTP
        driver.manage().window().maximize();
        // wait
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("practice@expandtesting.com");
        driver.findElement(By.id("btn-send-otp")).click();
        // Wait
        Thread.sleep(4000);
        // Enter OTP Verification code
        driver.findElement(By.id("otp")).sendKeys("214365");
        driver.findElement(By.id("btn-send-verify")).click();
        // wait
        Thread.sleep(2000);
        // Logout Button
        driver.findElement(By.xpath("//a[contains(@class, 'btn-danger')]")).click();
        // wait
        Thread.sleep(3000);
        // close the Browser
        driver.close();


    }
}
