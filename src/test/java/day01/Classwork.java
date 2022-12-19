package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classwork {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver","src/resourches/Yeni klasör/selenium-chrome-driver-4.7.1-sources.jar");

        WebDriver driver = new ChromeDriver();

             /*
        2.Amazon soyfasina gidelim.https://www.amazon.com/

3.Sayfanin konumunu ve boyutlariniyazdirin
4.Sayfayi simge durumunagetirin
5.simge durumunda 3 saniye bekleyip sayfayi maximizeyapin
6.Sayfanin konumunu ve boyutlarini maximize durumundayazdirin
7.Sayfayi fullscreenyapin
8.Sayfanin konumunu ve boyutlarini fullscreen durumundayazdirin
9.Sayfayikapatin
         */
        driver.get("https://www.amazon.com");
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.manage().window().minimize();
        Thread.sleep(3000);
        driver.manage().window().maximize();
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());


        driver.manage().window().fullscreen();
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        driver.close();




    }
}
