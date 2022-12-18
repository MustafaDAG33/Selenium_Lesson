package day02_drivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver","src/resourches/Yeni klasör/selenium-chrome-driver-4.7.1-sources.jar");
        WebDriver driver = new ChromeDriver();
        //amazon sayfasina git
        driver.navigate().to("https://amazon.com");

        //hepsiburada sayfasina git
        driver.navigate().to("https://techproeducation.com");
        Thread.sleep(3000);



        //tekrar amazon sayfasina donelim
        driver.navigate().back();
        Thread.sleep(3000);

        //tekrar hepsiburada sayfasina git
        driver.navigate().forward();
        Thread.sleep(3000);

        //son sayfada sayfayi yenile
        driver.navigate().refresh();
        Thread.sleep(3000);

        //sayfayi kapat
        driver.close();
        /*
        Youtube ana sayfasina gidelim . https://www.youtube.com/
        Amazon soyfasina gidelim. https://www.amazon.com/
        Tekrar YouTube’sayfasina donelim
        Yeniden Amazon sayfasina gidelim
        Sayfayi Refresh(yenile) yapalim
        Sayfayi kapatalim / Tum sayfalari kapatalim*/

    }
}
