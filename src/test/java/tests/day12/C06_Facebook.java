package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;
//    //1- https://www.facebook.com adresine gidelim
//    //2- Yeni hesap olustur butonuna basalim
//    //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
//    //4- Kaydol tusuna basalim
public class C06_Facebook extends TestBase {

    @Test
    public void FacebookSignIn () throws InterruptedException{
      driver.navigate().to("https://www.facebook.com");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,200)");
      driver.findElement(By.xpath("//button[@title='Allow All Cookies']")).click();

      driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
      Thread.sleep(2000);

        WebElement name= driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions actions=new Actions(driver);
        actions.click(name).
              sendKeys("sinem").sendKeys(Keys.TAB).
              sendKeys("zzz").sendKeys(Keys.TAB).
              sendKeys("abc@gmail.com").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
              sendKeys("1234").sendKeys(Keys.TAB).
              sendKeys("31").sendKeys(Keys.TAB).
              sendKeys("Jan").sendKeys(Keys.TAB).
              sendKeys("1985").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
              sendKeys(Keys.SPACE).sendKeys(Keys.TAB).
              sendKeys(Keys.TAB).sendKeys(Keys.TAB).
              sendKeys(Keys.ENTER).perform();
        Thread.sleep(5000);
    }

}
