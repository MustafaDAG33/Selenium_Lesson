package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test01 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver","src/resourches/Yeni klasör/selenium-chrome-driver-4.7.1-sources.jar");
        WebDriver driver = new ChromeDriver();


        //1-Test01 isimli bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        driver.navigate().to("https://www.amazon.com/");
        //3- Browseri tam sayfa yapin
        driver.manage().window().fullscreen();
        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();
        //5-”Salesforce Apex Questions Bank” icin arama yapiniz
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Salesforce Apex Questions Bank", Keys.ENTER);
        //6- Kac sonuc bulundugunu yaziniz
        WebElement w = driver.findElement(By.className("sg-col-inner"));

        List<String> myList = new ArrayList<>(Arrays.asList(w.getText().split(" ")));
        //System.out.println(w.getText());
        System.out.println("Amount of Result : "+myList.get(0));
        Thread.sleep(3000);
        driver.quit();



    }
}
