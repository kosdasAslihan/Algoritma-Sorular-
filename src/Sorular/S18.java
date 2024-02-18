package Sorular;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class S18 {
    public static void main(String[] args) {

        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.*/

        Scanner scan = new Scanner(System.in);

        List<String> isimler = new ArrayList<>();

        isimler.add("ali");
        isimler.add("ayşe");
        isimler.add("fatma");
        isimler.add("veli");
        isimler.add("selim");
        isimler.add("sinan");
        isimler.add("merve");

        System.out.println("Lutfen isminizi giriniz: ");
        String nickName = scan.nextLine();

        boolean varMi = isimler.contains(nickName);

        if (varMi){
            int rastgeleSayi = new Random().nextInt(100);
            nickName = nickName+""+rastgeleSayi;
            System.out.println("Isim zaten alinmis bu yuzden yeni adiniz : " + nickName);
        }else{
            System.out.println("Bu ismi kullanabilirsiniz");
        }



    }
}
