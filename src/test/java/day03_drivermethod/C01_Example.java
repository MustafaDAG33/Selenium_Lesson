package day03_drivermethod;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Example {
    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver","src/resourches/Yeni klasör/selenium-chrome-driver-4.7.1-sources.jar");
        WebDriver driver = new ChromeDriver();
        //browser'i mazimize yapalim
        driver.manage().window().maximize();


        //tum sayfa icin maksimum bekleme suresi olarak 15 saniye
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //Amazon,facebook ve youtube sayfalarina gidelim.
        driver.get("http://www.amazon.com");
        driver.get("http://www.facebook.com");
        driver.get("http://www.youtube.com");

        //amazon sayfasina tekrar donelim.
        driver.navigate().back();
        driver.navigate().back();

        //amazon sayfasinin url'inin http://amazon.com adresine esit oldugunu test edelim
        String surl =  driver.getCurrentUrl();
        if(surl.equals("https://www.amazon.com/")){
            System.out.println("passed");
        }else{
            System.out.println("failed"+ surl);
        }
        //sayfanin konumunu ve size'ini yazdiralim
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());

        //sayfanin konumunu ve size'ini istedigimiz dekilde yazdiralim ve test edelim
        driver.manage().window().setSize(new Dimension(600,600));
        driver.manage().window().setPosition(new Point(50,50));

        System.out.println(driver.manage().window().getPosition());//50,50
        System.out.println(driver.manage().window().getSize());//600,600

        //ve istediğimiz şekilde olduğunu test edelim
        Dimension actualYenisize = driver.manage().window().getSize();
        if(actualYenisize.getWidth()==600 && actualYenisize.getHeight()==600){
            System.out.println("Size TESTİ PASSED");
        }else System.out.println("Size TESTİ FAILED");
        Point actualYeniKonum = driver.manage().window().getPosition();
        if(actualYeniKonum.getX()==50 && actualYeniKonum.getY()==50){
            System.out.println("Konum TESTİ PASSED");
        }else System.out.println("Konum TESTİ FAILED");

        //sayfayi kapatalim
        driver.close();








    }

}
