package CollectionFramework;

public class TekrarDersi {
    public static void main(String[] args) {
        /*
        List Interface'i implemente eden classlar

        Elementleri liste halinde depolar,
        Bir element birden fazla bulunabilir,
        Elementler indeks ile tutulur,
        Elementler eklenme sırasını korur,
        Bir elemanı aramak çok yavaştır,
        Bir elemana indeks değeri ile ulaşmak hızlıdır,
        Listeler Collections, sort() metoduyla sıralanabilir.

        Thread İşlemlerinde Kullanılabilecek Veri Yapısı
        Vectorler -> Çünkü bazı metodları "synchronized" anahtar kelimesiyle yazılmıştır.

        Elemanı sadece sona eklediğimiz durumalarda:
        ArrayList-> Çünkü sadece sona eklemek arraylistlerde daha hızlıdır.

        Elemanı ortalarda ekleyeceğimiz durumlar varsa
        LinkedList-> Çünkü sadece o bölgenin referansları üzerinde işlem yapılır.
        ------------------------------------------------------------------------------------

        Set Interface'ini implemente eden classlar
        Bir elemanı sadece bir defa depolar.
        Bir elemanın sadece bir defa depolanmasını istiyorsak Listler(ArrayList,LinkedList vs.) yerine kullanılabilir.
        Elemanlar listler gibi indekslenmezler.
        Bir elemanın setlerde olup olmadığını sorgulama listlere göre oldukça hızlıdır.

        Elemanların sırası önemli değilse ve sorgulama işlemlerinin hızlı olması isteniyorsa:
        HashSet-> Elemanları ekleme sırasına göre depolamaz ve bir elemanın olup olmadığını sorgulama
        hash fonksiyonuyla yapıldığı için her zaman hızlı ve sabit zamanda çalışır.

        Elemanların eklenme sırası önemliyse ve sorgulama işlemlerinin hızlı olması isteniyorsa:
        LinkedHashSet-> LinkedList ve HashSet implementasyonu gibi çalıştığı için değerleri ekleme sırasına göre depolar.
        Ayrıca elemanları sorgulama çok hızlıdır ve sabit zamanda çalışır.

        Elemanların sıralanması önemliyse:
        TreeSet-> Verileri ağaç yapısında depoladığı için veriler her zaman sıralıdır. Ancar bir elemanın var olup
        olmadığını sorgulama zamanı içindeki eleman sayısıyla doğru orantılıdır. (O(logn))

        Eğer kendi objelerimizi setlerde kullanmak istiyorsak hashCode() ve equals() metodları override etmeliyiz.
        ---------------------------------------------------------------------------------------------------------

        Map Interface'ini implemente eden classlar

        Veriler anahtar değer ilişkisiyle depolanır.
        Bir key'e karşılık gelen yalnızca bir değer bulunur.
        Bir key birden fazla bulunmaz.
        Bir değere bir key üzerinden erişmek çok hızlıdır.
        Değerlerin üzerinde tek tek gezinmek çok yavaştır.
        Eğer kendi objelerimizi maplerde kullanmak istiyorsak hashCode() ve equals() metodlarını override etmeliyiz.

        HashMap
        Anahtarlar ve değerler sıralı değildir.

        LinkedHashMap
        Anahtarlar ve değerler ekleme sırasına göre depolanır.

        TreeMap
        Anahtarlar ve değerler "anahtarlara göre" sıralı depolanır.
        -----------------------------------------------------------------------------------------

        Queue Interface'ini implemente eden classlar

        LinkedList
        Eğer Queue Interface'inden bir referans ile LinkedList oluşturulursa bu linkedlist aynı zamanda bir
        Queue gibi davranır.

        First In First Out(İlk gelen ilk çıkar mantığıyla çalışır)

        PriorityQueue

        Queue Interface'ini implemente etmesine rağmen First In First Out mantığıyla çalışmaz. Değerler öncelik
        sırasına göre kuyruğun başına geçer.
        -------------------------------------------------------------------------------------

        Vector Class'ından Extend Eden Stackler
        LIFO (Last In First Out mantığı) Bilgisayarlarda Recursif Fonksiyonlar çalıştırılırken kullanılır.
        -----------------------------------------------------------------------------------

        Kendi Objelerimizle Oluşturduğumuz Bir Veri Yapısını Sıralamak
        Collections.sort() metoduyla kendi objelerimizle oluşturduğumuz bir veri yapısını sıralamak için
        ya Comparable Interface'ini ya da Comparator Interface'ini implemente etmek zorundayız.
        -----------------------------------------------------------------------------------------

        Iteratorler ve Iterable
        Bir veri yapısından iterator oluşturarak veri yapısının elemanları üzerinden kolayca gezinebiliriz.

        Aslında For Each Döngüsü kendi içinde iterator kullanılır.

        O yüzden bizimde bir classımızdan oluşturduğumuz objelerin üzerinde gezinebilmemiz için Iterable sınıfını
        implemente etmemiz ve classımıza ait bir tane iterator class yazmamız gerekmektedir.

         */
    }
}
