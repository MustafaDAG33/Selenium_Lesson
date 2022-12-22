package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class day01_Selenium {
    public static void main(String[] args) {

        System.setProperty("WebDriver.chrome.driver","src/resourches/Yeni klasör/selenium-chrome-driver-4.7.1-sources.jar");

        /*
            En temel haliyle otomasyon yapmak için  Class'ımıza otaomasyon için gerekli olan
        webdriver'in yerini göstermemiz gerekir. Bunun için java kütüphanesinden System.setProperty()
        methodunun içine ilk olarak driver'i yazarız. İkinci olarak driver'in fiziki yolunu kopyalarız
         */
        WebDriver driver = new ChromeDriver();

        driver.get("http://automationexercise.com");
        driver.manage().window().maximize();

        //'Kaydol / Giriş Yap' düğmesine tıklayın
        driver.findElement(By.xpath("//a[@href='/login']")).click();

        // 'Yeni Kullanıcı Kaydı!'nı doğrulayın! görünür
        WebElement we =  driver.findElement(By.xpath("//*[text()='New User Signup!']"));
        if(we.isDisplayed()){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        driver.findElement(By.xpath("//*[@data-qa='signup-name']")).sendKeys("Murat");
        driver.findElement(By.xpath("//*[@data-qa='signup-email']")).sendKeys("mustafadogan@gmail.com");
        driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();

        WebElement wd =  driver.findElement(By.xpath("//*[text()='Enter Account Information']"));
        if(wd.isDisplayed()){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }


        driver.findElement(By.xpath("//*[@id='id_gender1']")).click();
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("330217");

        driver.findElement(By.xpath("//*[@id='days']")).click();
        driver.findElement(By.xpath("//*[@id='days']")).sendKeys("3", Keys.ENTER);

        driver.findElement(By.xpath("//*[@id='months']")).click();
        driver.findElement(By.xpath("//*[@id='months']")).sendKeys("March");

        driver.findElement(By.xpath("//*[@id='years']")).click();
        driver.findElement(By.xpath("//*[@id='years']")).sendKeys("1991");

        driver.findElement(By.xpath("//*[@id='newsletter']")).click();

        driver.findElement(By.xpath("//*[@id='optin']")).click();

        driver.findElement(By.cssSelector("input[id='first_name']")).sendKeys("Mustafa");
        driver.findElement(By.cssSelector("input[id='last_name']")).sendKeys("DAG");
        driver.findElement(By.cssSelector("input[id='address1']")).sendKeys("Ogretmenler mah.");


        driver.findElement(By.cssSelector("select[id='country']")).click();
        driver.findElement(By.cssSelector("input[id='state']")).sendKeys("Mersin");
        driver.findElement(By.cssSelector("input[id='city']")).sendKeys("Tarsus");
        driver.findElement(By.cssSelector("input[id='zipcode']")).sendKeys("33440");
        driver.findElement(By.cssSelector("input[id='mobile_number']")).sendKeys("5522520398");

        driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();

        WebElement isw =   driver.findElement(By.xpath("//b[text()='Account Created!']"));
        if(isw.isDisplayed()){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();

        List<WebElement> list =  driver.findElements(By.xpath("//*[@class='nav navbar-nav']"));
        if(list.get(list.size()-1).isDisplayed()){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }

        list.get(4).click();
















    }
}
