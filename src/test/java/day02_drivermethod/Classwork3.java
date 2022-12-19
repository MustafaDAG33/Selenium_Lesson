package day02_drivermethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classwork3 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("WebDriver.chrome.driver","src/resourches/Yeni klasör/selenium-chrome-driver-4.7.1-sources.jar");

        //        Youtube ana sayfasina gidelim . https://www.youtube.com/
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");


        //        Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //        Tekrar YouTube’sayfasina donelim
        driver.navigate().back();

        //        Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        

        //        Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();

        //        Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();

        // ********* SAYFA 20 ********
        /*
        3.Amazon sayfasina gidelim.https://www.amazon.com/
4.Sayfa basligini(title)yazdirin
5.Sayfa basliginin “Amazon” icerdigini testedin
6.Sayfa adresini(url) yazdirin
7.Sayfa url’inin “amazon” icerdigini testedin.
8.Sayfa handle degerini yazdirin
9.Sayfa HTML kodlarinda “Gateway” kelimesi gectigini testedin
10.Sayfayikapatin.
         */




        //****************** SAYFA 26 **********************
        /*
        2.Amazon soyfasina gidelim.https://www.amazon.com/
3.Sayfanin konumunu ve boyutlariniyazdirin
4.Sayfanin konumunu ve boyutunu istediginiz sekildeayarlayin
5.Sayfanin sizin istediginiz konum ve boyuta geldigini testedin
8. Sayfayikapatin
         */



        //******* SAYFA 28 ********
        /*
        Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsoldayazdirin.
3.Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yiyazdırın.
4.Daha sonra Amazon sayfasina gidinhttps://www.amazon.com/
5.Youtube sayfasina geri donun
6.Sayfayi yenileyin
7.Amazon sayfasinadonun
8.Sayfayi tamsayfayapin
9.Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title)yazdırın.
10.Sayfa URL'sinin https://www.amazon.com/olup olmadığını doğrulayın, degilsedoğru
URL'yiyazdırın
11.Sayfayikapatin
         */

    }
}
