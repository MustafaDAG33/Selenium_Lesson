package day03_drivermethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Locaters {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver","src/resourches/Yeni klasör/selenium-chrome-driver-4.7.1-sources.jar");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Amazon sayfasina gidelim.
        driver.get("https://www.amazon.com");

        // Search bolumunu locate edip iphone kelimesini aratalim.
        WebElement we = driver.findElement(By.id("twotabsearchtextbox"));
        we.sendKeys("iphone" , Keys.ENTER);



        // Arama sonuc yazisinda iphone yazisini locate edip konsola yazdiralim.
        WebElement aramaSonucYazisi =   driver.findElement(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.getText());

        // Sayfayi kapatalim.
        driver.close();





    }
}
