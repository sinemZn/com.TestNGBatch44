package tests.day08;

import org.testng.annotations.Test;

public class C01_Prioritiy {


    @Test(priority = -9)
    public void youtubeTest(){
        System.out.println("youtube calisti");
    }

    @Test(priority = 8)            //eger priority atanmazsa default=0 olur.
                                   // iki ayni deger varsa onlarin arasinda harf sirasina bakar
                                   //buyuk harfin onceligi vardir
    public void amazonTest(){
        System.out.println("amazon calisti");
    }
    @Test(priority = 5)
    public void bestbuyTest(){
        System.out.println("bestbut test calisti");
    }

}
