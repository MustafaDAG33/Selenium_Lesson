package day03_drivermethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class C02_WebElement {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver","src/resourches/Yeni klasör/selenium-chrome-driver-4.7.1-sources.jar");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon sayfasina gidelim.
        driver.get("https://www.amazon.com");

        // Search bolumunu locate edelim.
//        WebElement we = driver.findElement(By.id("twotabsearchtextbox"));
//
//        // Search bolumunde Iphone aratalim
//        we.sendKeys("iphone", Keys.ENTER);

        /*
        Eger bir webelementi (Web sayfasindaki her bir buton ya da text/yazi) locate (konumunu belirleme)
        etmek istersek once manual olarak web sayfasini acip sayfa uzerinde sag click yapip incele/inspect butonuna tiklariz.
        Karsimiza cikan HTML code'larindan locator'lardan (konum belirleyiciler) unique (essiz) olani seceriz.
        Genellikle id Attribute'u kullanilir. Sectigimiz attribute degerini findElement() method'u icine
        findElement(BY.id("attribute degeri")) seklinde yazariz.
        */

        WebElement wn =    driver.findElement(By.name("field-keywords"));
        wn.sendKeys("IPHONE", Keys.ENTER);

        // Amazon sayfasındaki <input> ve <a> tag'larının sayısını yazdırınız
        List<WebElement> inputTags = driver.findElements(By.tagName("input"));
        System.out.println("Input Tag Sayısı = "+inputTags.size());
        List<WebElement> linklerList = driver.findElements(By.tagName("a"));
        System.out.println("Link Sayısı = "+linklerList.size());


    }
}
