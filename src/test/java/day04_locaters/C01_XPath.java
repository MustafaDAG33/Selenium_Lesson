package day04_locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_XPath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver","src/resourches/Yeni klasör/selenium-chrome-driver-4.7.1-sources.jar");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");


        //2- Add Element butonuna basin
//        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        WebElement addButtonT = driver.findElement(By.xpath("//*[text()='Add Element']"));
        //               <button onclick="addElement()">Add Element</button>
        // Xpath kullanımında locate edeceğimiz webelement text'e sahipse yukardaki şekilde kullanabiliriz
        addButtonT.click();
        Thread.sleep(3000);

        //3 Delete butonu’nun gorunur oldugunu test edin

        WebElement deleteButton = driver.findElement(By.xpath("//*[@onclick='deleteElement()']"));
        if (deleteButton.isDisplayed()){
            System.out.println("Test PASSED!");
        }else System.out.println("Test FAILED!");

        //4 Delete tusuna basin
        driver.findElement(By.xpath("//button[@class='added-manually']")).click();

        //5 “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement are = driver.findElement(By.xpath("//h3"));
        if (are.isDisplayed()){
            System.out.println("Test PASSED!");
        }else System.out.println("Test FAILED!");

        driver.quit();
    }
}
