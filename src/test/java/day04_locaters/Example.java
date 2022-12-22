package day04_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Example {
    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver","src/resourches/Yeni klasör/selenium-chrome-driver-4.7.1-sources.jar");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        //1. http://zero.webappsecurity.com sayfasina gidin
        driver.navigate().to("http://zero.webappsecurity.com");

        //2. Signin buttonuna tiklayin
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();

        //3. Login alanine  "username" yazdirin
        WebElement we =  driver.findElement(By.xpath("//input[@id='user_login']"));
        we.sendKeys("username");

        //4. Password alanine "password" yazdirin
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");

        //5. Sign in buttonuna tiklayin (hata mesaji icin back tusuna tiklayin)
        //6. Online Banking menusunden Pay Bills sayfasina gidin
        //7. amount kismina yatirmak istediginiz herhangi bir miktari yazin
        //8. tarih kismina "2020-09-10" yazdirin
        //9. Pay buttonuna tiklayin
        //10. "The payment was successfully submitted." mesajinin ciktigini kontrol edin

    }
}
