package tests.seleniumHomework07;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;
//    //1- https://www.facebook.com adresine gidelim
//    //2- Yeni hesap olustur butonuna basalim
//    //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
//    //4- Kaydol tusuna basalim
public class C09 extends TestBase {
    @Test
    public void  keyboardActionsFacebookKayit() throws InterruptedException {
        driver.navigate().to("https://www.facebook.com");
        driver.findElement(By.xpath("(//a[@href='#'])[4]")).click();

        WebElement adKutusu=driver.findElement(By.xpath("//input[@placeholder='Adın']"));

        Actions actions = new Actions(driver);
        actions.click(adKutusu).
                sendKeys("Mustafa")
                .sendKeys(Keys.TAB).
                sendKeys("DONAT").
                sendKeys(Keys.TAB).
                sendKeys("asdf@gmail.com").
                sendKeys(Keys.TAB).
                sendKeys("asdf@gmail.com").
                sendKeys(Keys.TAB).
                sendKeys("12qwasQ.").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("5").
                sendKeys(Keys.TAB).
                sendKeys("T").
                sendKeys(Keys.TAB).
                sendKeys("1876").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ARROW_RIGHT).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
                perform();

        Thread.sleep(6000);
    }

}