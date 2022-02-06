package tests.seleniumHomework07;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
// 4 TEST METODU OLUSTURUN,oncelik vererek sirasiyla
// https://www.n11.com/ SAYFASINA GiDİN.
// https://www.gittigidiyor.com/ SAYFASINA GiDiN
// https://getir.com/ SAYFASINA GiDiN
// https://www.sahibinden.com/ SAYFASINA GiDiN

public class C07 {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        }
    @Test(priority = 1)
    public void testN11() throws InterruptedException {
     driver.navigate().to("https://www.n11.com/");
     Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void testGG() throws InterruptedException {
     driver.navigate().to(" https://www.gittigidiyor.com/");
     Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void testgetir() throws InterruptedException {
     driver.navigate().to("https://getir.uk/");
     Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void testBM() throws InterruptedException {
     driver.get("https://www.homebargains.co.uk");
     Thread.sleep(2000);
    }

   @AfterMethod
    public void tearDown(){
        driver.close();
   }


}
