package day02_drivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverMethod {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver","src/resourches/Yeni klasör/selenium-chrome-driver-4.7.1-sources.jar");

        WebDriver driver = new ChromeDriver();// Bos bir browser açtık

        driver.get("https://www.amazon.com"); // ilk olarak gitmek istediğimiz sayfayı belirtiriz

        System.out.println("Sayfa Başlığı : "+driver.getTitle());
        System.out.println("Sayfa Url'i : "+driver.getCurrentUrl());
//        System.out.println(driver.getPageSource());

        System.out.println(driver.getWindowHandle());// Bize o window'a ait hash değerini verir. Biz bu hash değerlerini
        // bir string'e atayıp pencereler arası geçiş yapabiliriz






    }
}
