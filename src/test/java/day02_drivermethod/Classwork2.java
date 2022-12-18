package day02_drivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Classwork2 {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver","src/resourches/Yeni klasör/selenium-chrome-driver-4.7.1-sources.jar");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//bu method sayfadaki herbir web element icin maximum bekleme suresini belirler.

        //ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
        //oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
        driver.get("https://www.facebook.com");
        String actualTitle =   driver.getTitle();
        if(actualTitle.contains("facebook")){
            System.out.println("Title Test Passed");
        }else{
            System.out.println("Title Test Failed"+ actualTitle);
        }

        //Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
        //yazdirin.
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains("facebook")){
            System.out.println("Url test passed");
        }else{
            System.out.println("url test failed" + actualUrl);
        }
        //https://www.walmart.com/ sayfasina gidin.
        driver.get("https://www.walmart.com/");

        //Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        String actualTitle1 = driver.getTitle();
        String expectedWalmart = "Walmart.com";
        if(actualTitle1.contains(expectedWalmart)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        //Tekrar “facebook” sayfasina donun
        driver.navigate().back();

        //Sayfayi yenileyin
        driver.navigate().refresh();

        //Sayfayi tam sayfa (maximize) yapin  9.Browser’i kapatin
        driver.close();
    }
}
