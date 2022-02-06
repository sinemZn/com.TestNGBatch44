package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import javax.swing.*;

public class C02_MouseActions extends TestBase {
    //amazona gidin
    //hello sign in elementi uzerinde mouseu bekletin
    //acilan menude new list linke tiklayin
    //ve new list sayfasinin acildigini test edin

    //➢ doubleClick ( ): WebElement’e çift tıklama yapar
    //➢ clickAndHold ( ): WebElement uzerinde click yapili olarak bizden komut bekler.
//➢ dragAndDrop ( ): WebElement’i bir noktadan diğerine sürükler ve bırakır
//➢ moveToElement ( ): Mouse’u istedigimiz WebElement’in uzerinde tutar
//➢ contextClick ( ): Mouse ile istedigimiz WebElement’e sag tiklama yapar

    @Test
    public void amaonList() throws InterruptedException {
        driver.get("https://www.amazon.com");
        Actions actions=new Actions(driver);
        WebElement helloElement=driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2   nav-progressive-attribute'])[1]"));
        actions.moveToElement(helloElement).perform();
        WebElement listElementi=driver.findElement(By.xpath("//span[text()='Create a List']"));
        actions.click(listElementi).perform();
        String actualtitle= driver.getTitle();
        String arananMetin="Your List";
        Assert.assertTrue(actualtitle.contains(arananMetin));



        Thread.sleep(5000);
    }

}