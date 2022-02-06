package tests.practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Q6 {
//odev
//2.soru :Ingilizce
// //    go to url :http://demo.automationtesting.in/Alerts.html
// //    click  "Alert with OK" and click 'click the button to display an alert box:'
//  //    accept Alert(I am an alert box!) and print alert on console
//  //    click "Alert with OK & Cancel" and click 'click the button to display a confirm box'
//  //    cancel Alert  (Press a Button !)
//  //    click "Alert with Textbox" and click 'click the button to demonstrate the prompt box'
//  //    and then sendKeys 'TechProEducation' (Please enter your name)
//  //    finally print on console this message "Hello TechproEducation How are you today"
//2.soru:Turkce
//// url'ye gidin :http://demo.automationtesting.in/Alerts.html
//     // "Alert with OK"yi tıklayın ve 'click the button to display a confirm box' i tıklayın:'
//     // Uyarıyı kabul et(I am an alert box!) ve uyarıyı konsolda yazdır
//     //  "Alert with OK & Cancel" ı tıklayın ve 'click the button to display a confirm box' i tıklayın
//     // Uyarıyı iptal et (Press a Button !)
//     // "Alert with Textbox" ı tıklayın ve 'click the button to demonstrate the prompt box' tıklayın'
//     // ve ardından sendKeys 'TechProEducation' (Lütfen adınızı girin)
//     // sonunda "Hello TechproEducation How are you today" mesajını konsola yazdır
     WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @Test
    public void test() throws InterruptedException {
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
        driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();

        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

    }


}
