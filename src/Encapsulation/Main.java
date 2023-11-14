package Encapsulation;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

       /* Abone abone = new Abone();

        abone.isim = "Ali Veli";
        abone.bakiye = 200;
        abone.sehir = "Ankara";

        abone.dogalgaz_kullan(200);*/

        GelismisAbone abone = new GelismisAbone("Ali Veli", 200, "Ankara");
        abone.bakiye_ogren();



    }
}
