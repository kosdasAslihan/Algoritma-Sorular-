package StringSinifi;

public class Main {
    public static void main(String[] args) {

        //String a = "Mustafa";

        //String b = new String("Mustafa"); //stringlerin 2 tanımlama yöntemi var ama 2'si arasında farklar var
        //System.out.println(b);

        /*System.out.println("Harf Sayısı: " + b.length()); //String'in boyunu söyler

        System.out.println("0. indeks: " + b.charAt(0)); //0. indeksteki harfi gösterir
        System.out.println("2. indeks: " + b.charAt(2));
        System.out.println("Son eleman: " + b.charAt(b.length()-1));*/

        /*for (int i = 0; i < b.length(); i++) {

            System.out.println(b.charAt(i)); bütün harfler ekrana basılmış oluyor
        }*/

        /*System.out.println(b.startsWith("Mu")); //string b "Mu" ile başlıyorsa true dönüyor başlamıyorsa false
        System.out.println(b.endsWith("CO")); // string b "CO" ile bitiyor mu?*/

        /*System.out.println(b.indexOf('a')); //harfi indeks içinde aratmış oluyoruz, baştan itibaren harfi ilk gördüğünü veriyor.
        System.out.println(b.indexOf('b'));//böyle bir harf olmadığı için -1 değerini veriyor
        System.out.println(b.lastIndexOf('a')); //sondan bakarak ilk gördüğü yerdeki indeksi veriyor*/

        /*System.out.println(b.toLowerCase()); // büyük karakterleri küçük karakterlere çevriliyor
        System.out.println(b.toUpperCase()); //küçük karakterler büyük karakterlere çevriliyor*/

        /*String a = "1923";

        int b = Integer.parseInt(a); // a'nın içindeki değerleri integer'a çevirecek

        System.out.println(b-42);*/

        /*int b = 1923;
        String a = String.valueOf(b); //integer'ı string'e çevirir*/

        String a1 = "Mustafa";
        String a2 = "Mustafa";

        /*if (a1 == a2) {
            System.out.println("Eşitler"); iki obje de aynı yerde olduğu için eşittir sonucu çıkıyor
        }*/

        String b1 = new String("Mustafa");
        String b2 = new String("Mustafa");

        if (b1.equals(b2)) { //b1 ve b2'nin içeriği aynı mıdır?
            System.out.println("Eşitler");

        /*if (b1 == b2) {
            System.out.println("Eşitler"); b1 ve b2 referansı farklı yerleri gösteriyor bu yüzden ekranda bir şey çıkmadı*/
        }

        //String b = new String("Mustafa");


    }
}
