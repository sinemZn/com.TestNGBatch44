package tests.GithuhElifHoca;

import org.bouncycastle.util.Properties;

import java.io.FileInputStream;
import java.io.IOException;

public class C01 {
    //Github da kodlarımızı takım halinde hata almadan çalışabilmek adına dipnotlar ....
    //1)Öncelikle ij de framework u açtığımızda ilk olarak terminal a gidip
    //git checkout master
    //git branch (master a gectigimzi kontrol amacli yapilabilir)
    //git pull
    //(git pull dedigimizde hata alıyorsak eger bizim kendi branch mizde guncel yazdigimiz kodlari githuba yuklememisiz demektir) o yuzden once;
    //git checkout branchismimiz
    //git branch (kendi branch mize gectigimzi kontrol amacli yapilabilir)
    //git add .
    //git commit -m "mesajim"
    //git push (simdi artik master branch e gecebilirim)
    //git checkout master
    //git branch (master a gectigimzi kontrol amacli yapilabilir)
    //git pull

    //2)Masterdan githubdaki güncel kodlari aldık ve artik kendi branch e gidip masterdaki kodlari kendi branch e çekmeliyim
    //git checkout branchismimiz
    //git branch (kendi branch mize gectigimzi kontrol amacli yapilabilir)
    //git merge master
    //3)Branch mizde kodlari birlestirdik artik framework mizde kodlarimizi yazabiliriz
    //4)Kodlarimizi yazdiktan sonra githuba gondermek icin
    //git add .
    //git commit -m "mesajim"
    //git push (kodlarimizi gonderip gondermedigimzi anlamak amacli git status diyip kontrol edebiliriz)
    //           githubdan kodlari cekmek icin tekrar bastaki adimlari takip ederiz bu dongu bu sekilde devam eder ...
    //NOT: Kodlari github dan cekmek icin master da, kod yazacaksak kendi branch mizde oldugumuzdan emin olalim .. .
    //NOT: Kodlarimizi yazdiktan sonra komutlara gecmeden once save all yaptigimizdan emin olalım ..
    //Yani push yapmadan önce şu yapılamlı:
    // git checkout master // master branchine geç
    // git pull // githubdaki master ı al ve kendi branch ini güncelle
    // git branch ali// kendi branch ine geç
    // git merge master // lokaldeki güncellenmiş master ile kendi branch ini güncelle. Bu aşamada conflict oluşur. Conflict i çöz
    // <<<bu esnada kendi branshımdakı yaptığın güncelle ile yeni çektiğim masteri Conflict yapma esnadında dikkatli olmak lazım yoksa kendi branchindaki güncellemerin gidebilir>>>
    //git push // github a yükle
}
package utilities;

        import org.bouncycastle.util.Properties;

        import java.io.FileInputStream;
        import java.io.IOException;
        import java.util.Properties;

public class ConfigReader {
    public static Properties properties;

    static {
        String path="src/configuration.properties";
        try {
            FileInputStream fis=new FileInputStream(path);
            properties=new Properties();
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getProperty(String key){

        return properties.getProperty(key);
    }
}
