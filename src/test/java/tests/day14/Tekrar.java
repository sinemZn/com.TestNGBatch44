package tests.day14;

import com.github.javafaker.Faker;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Tekrar extends TestBase {
    @Test
    public void facebook(){
        driver.get("https://facebook.com");
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,200)");
        driver.findElement(By.xpath("//button[text()='Allow All Cookies']")).click();
        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        WebElement name= driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions actions=new Actions(driver);
        Faker faker=new Faker();
        String email=faker.internet().emailAddress();
        actions.click(name)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(email)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("30")
                .sendKeys(Keys.TAB)
                .sendKeys("Jan")
                .sendKeys(Keys.TAB)
                .sendKeys("1972")
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys(Keys.SPACE)
                .perform();


        WebElement female= driver.findElement(By.xpath("//input[@value='1']"));
        WebElement male=driver.findElement(By.xpath("//input[@value='2']"));
        Assert.assertFalse(male.isSelected());
        Assert.assertTrue(female.isSelected());





    }



}
