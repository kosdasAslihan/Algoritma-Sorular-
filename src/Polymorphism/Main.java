package Polymorphism;

import java.util.SortedMap;

class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.setIsim(isim);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {

        return "Hayvan Konuşuyor...";

    }
}
class Kedi extends Hayvan {
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor...";
    }
}

class Kopek extends Hayvan {
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor...";

    }
}

class At extends Hayvan {
    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kişniyor...";

    }
}
class Kus extends Hayvan {
    public Kus(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " ötüyor...";
    }
}
public class Main {

    public static void konustur(Object object) {
        //System.out.println(object.konus());
        if (object instanceof Kopek) {
            Kopek kopek = (Kopek) object;
            System.out.println(kopek.konus());

        }
        else if (object instanceof Kedi) {
            Kedi kedi = (Kedi) object;
            System.out.println(kedi.konus());

        }
        else if (object instanceof At) {
            At at = (At) object;
            System.out.println(at.konus());

        }
        else if (object instanceof Hayvan) {
            Hayvan hayvan = (Hayvan) object;
            System.out.println(hayvan.konus());

        }
        else if (object instanceof Kus) {
            Kus kus = (Kus) object;
            System.out.println(kus.konus());
        }

    }
    public static void main(String[] args) {
        // Polymorphism: Bir nesnenin birden farklı nesne gibi davranmasıdır.

    /*Hayvan hayvan1 = new Kedi("Tekir");
    Hayvan hayvan2 = new Kopek("Karabaş");
    Hayvan hayvan3 = new At("Şahbatur");

    System.out.println(hayvan1.konus());
    System.out.println(hayvan2.konus());
    System.out.println(hayvan3.konus());*/

    /*konustur(new Kedi("Tekir"));
    konustur(new Kopek("Karabaş"));
    konustur(new At("Şahbatur"));*/

    // instanceof

    /*Kopek kopek = new Kopek("Karabaş");

    if (kopek instanceof Kopek) {
        System.out.println("Bu nesne Kopek sınıfından");

    }*/

    Kopek kopek = new Kopek("Karabaş");
    Kedi kedi = new Kedi("Tekir");
    At at = new At("Şahbatur");
    Hayvan hayvan = new Hayvan("Limon");
    Kus kus = new Kus("Zeytin");
    konustur(kopek);
    konustur(kedi);
    konustur(at);
    konustur(hayvan);
    konustur(kus);


    }

}
