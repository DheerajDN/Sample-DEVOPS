

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        // user-name password login-button
        driver.findElement(By.id("ap_email)).
                sendKeys( "6361017483");
        driver.findElement(By.id("password")).
                sendKeys( "");
        driver.findElement(By.id("login-button")).click();
    }
}