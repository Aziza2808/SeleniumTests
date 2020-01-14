package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meetup {

    @Test
    public void SignUpMeetup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.meetup.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"globalNav\"]/nav/div/div[4]/button/div/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"globalNav\"]/nav/div/div[2]/div/div[2]/div[2]/div[6]/a/div/div[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"register-field--name\"]")).sendKeys("Aziza Asylbekova");
        driver.findElement(By.xpath("//*[@id=\"register-field--email\"]")).sendKeys("a.asylbekova@yahoo.com");
        driver.findElement(By.xpath("//*[@id=\"register-field--password\"]")).sendKeys("Erica072017");
        driver.findElement(By.xpath("//*[@id=\"register-fieldset--email\"]/div[6]/p/button")).click();

    }
}