package tests.day11;

public class Ozet {
    /* 1-Handling Windows: eger otomasyon sirasinda birden fazla pencere veya tab aciliyorsa,
    pencereler veya tablar arasinda drive'imizi gezdirmemiz gerekir
    2- Eger selenium4 ile yeni gelen switchTo().newWindow() method'unu kullanirsak driver otomatik olarak yeni acilan window'a gecer.
     ancak bir linke tiklayarak yeni bir sayfa acildiysa driver eski sayfada kalir.
    3- Eger otomasyon sirasinda birden fazla pencere aciliyorsa kullandigimiz her sayfadsa sayanin window handle degerini String
    bir degiskene atamamizda fayda vardir. Testin ilerleyen asamalarinda eski pencereye donemk istersek kaydettigimiz bu windowHandle
    degerlerini kullaniriz
    4- Eger bizim driverlarimiza actirmadigimiz ama link ile acilan bir pencere olursa
    - ilk once bir Set olusturup getWindowHandles() methodu ile acik olan tum sayfa(lar)in windowHandle degerlerini
    bu Set'e store ederiz.
    - Olusturdugumuz Set'in icerisinde daha once olusturdugumuz ve windowHandle degerlerini aldigimiz sayfanin windowHandle
    degerleri ve son gectigimiz ama windowHandle degerini bilmedigimiz sayfanin windowHandlw degeri bulunur.
    - Set teki windowHandle degerlerini for-each loop ile kontrol edersek, onceki sayfalarin windowHandle degerlerine esit olmayan,
    yeni sayfanin windowHanle degeridir.
    - Buldugumuz windowHandle degerini kullanarak yeni sayfaya gecebiliriz.
    5-
    */
}
