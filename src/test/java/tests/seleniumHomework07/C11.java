package tests.seleniumHomework07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.util.Set;

public class C11 extends TestBase {

    /*
      go to url :http://demo.guru99.com/popup.php
      get the first window
      clicking on click here button
      get all the window in the set
      switch to window
      input email id (somepne@gmail.com) and type something in that input
      Clicking on the submit button
      verify title as expected
      switch to first window
     */
    @Test
    public void test(){
        //   go to url :http://demo.guru99.com/popup.php
        driver.navigate().to("http://demo.guru99.com/popup.php");
        String ilkAnaSayfaWindowHandleDegeri=driver.getWindowHandle();
        driver.findElement(By.xpath("//a[.='Click Here']")).click();
        Set<String> windowHandleDegerleri=driver.getWindowHandles();
        String windowHandleDegeri2="";
        for (String each:windowHandleDegerleri     ) {
            if (!each.equals(ilkAnaSayfaWindowHandleDegeri)) {
                windowHandleDegeri2=each;
            }
        }
        driver.switchTo().window(windowHandleDegeri2);

        WebElement emailTextBox=driver.findElement(By.name("emailid"));
        emailTextBox.sendKeys("somepne@gmail.com");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        SoftAssert softAssert=new SoftAssert();
        WebElement emailGirisiDogrulama=driver.findElement(By.xpath("//h2[.='Access details to demo site.']"));
        softAssert.assertTrue(emailGirisiDogrulama.isDisplayed());
        softAssert.assertAll();
        driver.switchTo().window(ilkAnaSayfaWindowHandleDegeri);
        WebElement ilkAnaSayfa=driver.findElement(By.xpath("//a[.='Click Here']"));
        softAssert.assertTrue(ilkAnaSayfa.isEnabled());
        softAssert.assertAll();
    }
}