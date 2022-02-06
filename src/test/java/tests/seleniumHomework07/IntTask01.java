package tests.seleniumHomework07;

import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.util.List;

public class IntTask01 extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //https://www.chanel.com/us/

        //1st test:
        //    1- Accessing the site --> OK if the site is displayed
        driver.get("https://www.chanel.com/us/");
        WebElement logo = driver.findElement(By.xpath("//img[@class='logo_header']"));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(logo.isDisplayed(), "This site can’t be reached");
        driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
        //    2- Click on the search bar (on the top menu)
        driver.findElement(By.xpath("(//button[@title='Search'])[2]")).click();

        //    3- Search for "ROUGE ALLURE"
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchInput']"));
        searchBox.sendKeys("ROUGE ALLURE" + Keys.ENTER);
        Thread.sleep(3000);

        //    3- Check if the items of the displayed list contain the searched word
        List<WebElement> displayedList = driver.findElements(By.className("product-list-inline__link"));
        for (WebElement each : displayedList) {
            softAssert.assertTrue(each.getText().contains("ROUGE ALLURE"), "no contains ROUGE ALLURE");
        }

        //    4- Select the second item of the list
        driver.findElement(By.xpath("(//div[@class='product-list-inline'])[2]")).click();
        //    5- Make sure that the displayed product name is the same as the previously selected name.
        String actualProductName = driver.getTitle();
        String expProductName = "ROUGE ALLURE VELVET LE LION DE CHANEL";
        softAssert.assertEquals(actualProductName, expProductName);
        System.out.println("expProductName = " + expProductName);
        System.out.println("actualProductName = " + actualProductName);

    }

    @Test
    public void test02() throws InterruptedException {

        //2nd test:
        //    1- Access to the site
         driver.get("https://www.chanel.com/us/");
         driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        //    2- Access to Makeup => Lipstick category (on top menu)
        driver.findElement(By.xpath("//span[@data-test='lnkAxisCategory_makeup']")).click();
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath("//a[@data-event-label='lipstick']")).click();
        //    3- Click on ROUGE ALLURE product
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement rougeAllure = driver.findElement(By.xpath("(//a[@data-test='product_link'])[1]"));
        js.executeScript("arguments[0].scrollIntoView(true);",rougeAllure);
        Thread.sleep(3000);
        js.executeScript("arguments[0].click();",rougeAllure);
        //    4- Add the product to the cart
        //    5- View Cart --> OK, if there is a "ROUGE ALLURE" product in the cart,
        //    the quantity=1 and the total cart is equal to the product price
    }
}