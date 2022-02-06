package tests.seleniumHomework07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

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
    public void Test(){
        driver.get("http://demo.guru99.com/popup.php");
        WebElement securty=driver.findElement(By.className("faktor-iframe-wrapper"));
        driver.switchTo().frame(securty);
        driver.findElement(By.xpath("(//span[text()='Accept All'])")).click();
        driver.switchTo().defaultContent();

    }



}
