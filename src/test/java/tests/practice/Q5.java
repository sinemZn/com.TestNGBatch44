package tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class Q5 {
    //soru :ingilizce
    // //go to web site : https://www.jqueryscript.net/demo/bootstrap-alert-box/
    // //maximize the window
    ////click on action dialog button
    // //if need use explicitly wait
    ////click on the ok button
    ////accept the iframe message
    //1.soru :Turkce
    ////web sitesine gidin: https://www.jqueryscript.net/demo/bootstrap-alert-box/
    //     // pencereyi büyüt
    //     // eylem diyalog düğmesine tıklayın
    //     // kullanmanız gerekiyorsa açıkça bekleyin
    //     // tamam butonuna tıklayın
    //     // iframe mesajını kabul et
    WebDriver driver;

   @BeforeClass
   public void setUp(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.manage().window().maximize();

   }

    @Test
    public void test() throws InterruptedException {
        driver.get(" https://www.jqueryscript.net/demo/bootstrap-alert-box/");
        driver.findElement(By.xpath("//button[@id='action']")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-body']")));
        WebElement box= driver.findElement(By.xpath("//div[@class='modal-body']"));

        Assert.assertTrue(box.isDisplayed());
        Thread.sleep(2000);
        driver.findElement(By.id("dialog-mycodemyway-action")).click();

        driver.switchTo().alert().accept();



    }




}
