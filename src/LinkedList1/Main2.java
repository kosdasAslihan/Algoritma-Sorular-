package LinkedList1;

import com.sun.jdi.connect.spi.TransportService;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main2 {

    public static void listeyi_bastir(LinkedList<String> gidilecek_yerler) {
        /*for (String s: gidilecek_yerler) {
            System.out.println(s);
        }*/

        ListIterator<String> iterator = gidilecek_yerler.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public static void sirali_ekle(LinkedList<String> gidilecek_yerler, String yeni) {
        ListIterator<String> iterator = gidilecek_yerler.listIterator();

        while (iterator.hasNext()) {

            int karsilastir = iterator.next().compareTo(yeni); // compareTo alfabetik olarak sıralar
            //iterator'ün gösterdiği değerle gönderilen değeri kıyaslar, değerler eşitse değer 0 çıkar,
            //gönderilen değer iterator'den daha büyükse karşılaştırma sonucu -1 çıkar
            //gönderilen değer iterator'den küçükse karşılaştırma sonucu 0'dan büyük çıkar

            if (karsilastir == 0) {
                //iki değer eşit
                System.out.println("Listenizde bu eleman zaten var...");

                return;

            }

            else if (karsilastir < 0) {
                //yeni değer iterator.next'ten daha büyük
            }

            else if (karsilastir > 0) {
                //yeni değer iterator'den küçükse

                iterator.previous();
                iterator.add(yeni);

                return;
            }
        }

        iterator.add(yeni);


    }
    public static void main(String[] args) {

        LinkedList<String> gidilecek_yerler = new LinkedList<String>();

        sirali_ekle(gidilecek_yerler,"Postane");
        sirali_ekle(gidilecek_yerler,"Market");
        sirali_ekle(gidilecek_yerler,"Ev");


        /*gidilecek_yerler.add("Postane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("Kütüphane");
        gidilecek_yerler.add("Spor Salonu");
        gidilecek_yerler.add("Ev");
        listeyi_bastir(gidilecek_yerler);

        System.out.println("--------------------------");
        //gidilecek_yerler.add(4,"Alışveriş Merkezi");
        gidilecek_yerler.remove(3);
        listeyi_bastir(gidilecek_yerler);*/

        listeyi_bastir(gidilecek_yerler);

    }
}
