package day03_drivermethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C04_LocaterExample {
    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver","src/resourches/Yeni klasör/selenium-chrome-driver-4.7.1-sources.jar");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //a.web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //Search(ara) “city bike”
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("city bike", Keys.ENTER);
        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> aramaSonucYazisi =   driver.findElements(By.className("sg-col-inner"));
        System.out.println(aramaSonucYazisi.get(0).getText());
        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        //List<WebElement> lw =       driver.findElements(By.className("s-image"));


    }
}
