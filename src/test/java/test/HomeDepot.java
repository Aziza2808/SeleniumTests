package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot {
    @Test
    public void TestHomeDepot() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.homedepot.com/account/view/register");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"registrationEmail\"]")).sendKeys("asylbekova95@yahoo.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"registrationPasswordContainer\"]/input")).sendKeys("Asylbekova12345");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"zipCode\"]")).sendKeys("60626");
        driver.findElement(By.xpath("//*[@id=\"phoneNumber\"]")).sendKeys("7732400645");
        driver.findElement(By.xpath("/html/body/div[2]/myaccount-app/div/div/account-registration/form/div[1]/div[2]/div[7]/button/span")).click();




    }
}
