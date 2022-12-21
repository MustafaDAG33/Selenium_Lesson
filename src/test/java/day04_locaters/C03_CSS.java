package day04_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CSS {
    public static void main(String[] args) {
        System.setProperty("WebDriver.chrome.driver","src/resourches/Yeni klasör/selenium-chrome-driver-4.7.1-sources.jar");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //-Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com/");
        //-Arama kutusunu locate ediniz
        WebElement we = driver.findElement(By.xpath("//input[@type='text']"));
        //-Arama kutusunun tagName'inin input olduğunu test ediniz
        if(we.getTagName().equals("input")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        //-Arama kutusunun name atributu'nun değerinin field-keywords olduğunu test ediniz
        if(we.getAttribute("name").equals("field-keywords")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
        //-Sayfayı kapatınız
        driver.quit();

    }
}
