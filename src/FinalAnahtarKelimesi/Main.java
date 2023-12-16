package FinalAnahtarKelimesi;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
       /* FinalTest f1 = new FinalTest("Obje1");
        FinalTest f2 = new FinalTest("Obje2");

        System.out.println("Obje Sayısı: " + f1.obje_sayisi);
        System.out.println("Obje Sayısı: " + f2.obje_sayisi);*/

        //f2.obje_sayisi = 10; obje_sayisi FinalTest class'ında final tanımlanmıştır. Değeri de constructor'da verebiliyoruz.

       //System.out.println(Math.PI);
        //Math.PI = 3.15; java geliştiricileri bunu final olarak tanımlamışlardır bu yüzden değer atayamıyoruz.


        System.out.println("Database İsmi: " + DataBase.databaseIsmi);
        System.out.println("UserName : " + DataBase.userName);
        System.out.println("Password : " + DataBase.password);

    }
}
