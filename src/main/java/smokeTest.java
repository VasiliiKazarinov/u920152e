import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.testng.Assert.assertEquals;

public class smokeTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://u920152e.beget.tech/#");

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement enter = driver.findElement(By.xpath("//button[@class='form_auth_button']"));

        email.sendKeys("next1@scramble.com");
        password.sendKeys("456781");
        enter.click();

        WebElement send = driver.findElement(By.xpath("//input[@type='submit']"));

        send.click();

        String current_url = driver.getCurrentUrl();

        String wish_url = "http://u920152e.beget.tech/page2.html";

        assertEquals(current_url, wish_url);

        System.out.println("Mission complete");

        driver.quit();
    }

}
