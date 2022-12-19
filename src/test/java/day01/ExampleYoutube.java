package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleYoutube {
    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver","src/resourches/Yeni klasör/selenium-chrome-driver-4.7.1-sources.jar");
        WebDriver driver = new ChromeDriver();

        //******** SAYFA 27 *****************
        /*
        2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title)“facebook”
oldugunu dogrulayin (verify), degilse dogru basligiyazdirin.
3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual”URL’i
yazdirin.
4.https://www.walmart.com/ sayfasinagidin.
5.Sayfa basliginin “Walmart.com” icerdiginidogrulayin.
6.Tekrar “facebook” sayfasinadonun
7.Sayfayi yenileyin
8.Sayfayi tam sayfa (maximize) yapin 9.Browser’ikapatin
         */

        driver.get("http://www.facebook.com");
        String str =   driver.getTitle();
        if(str.contains("facebook")){
            System.out.println("passed");
        }else{
            System.out.println("failed" +   str);
        }

        String surl =   driver.getCurrentUrl();
        if(surl.contains("facebook")){
            System.out.println("passed");
        }else{
            System.out.println("failed"+ surl);
        }

        driver.get("https://www.walmart.com");
        String wt=   driver.getTitle();
        if(wt.contains("Walmart.com")){
            System.out.println("passed");
        }else{
            System.out.println("failed" +   wt);
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();




    }
}
