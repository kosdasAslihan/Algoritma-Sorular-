package TryveCatchBloklari;

public class Main {
    public static void main(String[] args) {
        /*
        try {
            // Exception Oluşturulabilecek Kodlar
        }

        catch(Exception_Turu e) {
             // Exception Durumunda Yapılabilecek İşlemler
       }
       */

        //int a = 30 / 0; //Unchecked Exception, 0'a bölünemez hatası veriyor

        /*int[] a = {1,2,3,4,5};
        System.out.println(a[6]);*/

        //System.out.println("Burası Çalışıyor.");

        /*try {
            //int a = 30/0; //AritmeticException
            int [] a = {1,2,3,4,5};
            System.out.println(a[6]); //ArrayIndexOutOfBoundsException

        }
        catch (ArrayIndexOutOfBoundsException e) { //hangi hatayı alırsak parantez içine onu yazmamız gerekir.
            //ArrayIndexOutOfBoundsException yerine IndexOutOfBoundsException yazarsak yine çalışır, çünkü alt classı.
            System.out.println("Arrayin boyunu aştınız.");
        }
        System.out.println("Burası çalışıyor.");*/

        /*try {
            int[] a = {1,2,3,4,5};

            System.out.println(a[6]);
        }
        catch (RuntimeException e) {
            e.printStackTrace();

        }
        System.out.println("Burası çalışıyor.");*/

        try {
            int b = 30/0;
            int[] a = {1,2,3,4,5};
            System.out.println(a[6]);
            //üste hangisi olursa o hatayı yazdırır.
            //eğer kodlar hatasız yazılırsa exception yazdırmaz.


        }
        catch (ArithmeticException e) {
            System.out.println("Bir sayı 0'a bölünemez.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Arrayin boyunu aştınız.");
        }
        catch (Exception e) {
            System.out.println("Bir hata oluştu.");
            e.printStackTrace();
        }

        System.out.println("Burası çalışıyor.");
    }
}
