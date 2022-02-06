package tests.day13;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C02_FileExists {

    @Test
    public void test01() {
        System.out.println(System.getProperty("user.home"));//"C:\Users\tarci
        // my computerin yolunu verdik.
        //masa ustundeki deneme klasorunun selenium dosyasinin pathinin istesem
        //"C:\Users\tarci\OneDrive\Desktop\deneme\selenium.xlsx"
        //yani dinamaik olarak masa ustumdeki deneme klasorunun pathini yazmak istersem
        String path = System.getProperty("user.home") + "\\OneDrive\\Desktop\\deneme\\selenium.xlsx";
        System.out.println(path);

        System.out.println("user.dir : "+System.getProperty("user.dir"));
        // C:\Users\tarci\IdeaProjects\com.TestNGBatch44  icinde oldgmz projenin pathi
        //******masaustunde deneme klasoru ve icinde selenium.xlxs olmazsa calismaz****
        //masaustunde deneme klasorunun icinde selenium.xlsx isimli dosya oldugunu test edin
        //1- Once bu dosyaya ulasmak icin gerekli dinamik path olusturulsun
        String path1 = System.getProperty("user.home") + "\\OneDrive\\Desktop\\deneme\\selenium.xlsx";

        Files.exists(Path.of(path1));//boolean dondurur.orada oyle bir dosya var demek
        System.out.println("path1 = " + path1);//true

        //projemizde pom.xml oldugunu test edin
        //C:\Users\tarci\IdeaProjects\com.TestNGBatch44\pom.xml absulutpath ile pom un yolunu bulduk
        System.out.println(System.getProperty("user.dir"));//projemin yolunu verdi //C:\Users\tarci\IdeaProjects\com.TestNGBatch44

        String pomPath=System.getProperty("user.dir")+"\\pom.xml";

        Assert.assertTrue(Files.exists(Paths.get(pomPath)));
        //Hoca bu classi gostermek icin yapti,dosya varligini aslinda C03deki 3 satirla test ederiz


    }
}