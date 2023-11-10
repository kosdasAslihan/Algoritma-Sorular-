package OOPAtm;

public class Calistirma {
    // Object Oriented (Nesne Yönelimli) ATM Programı

    // Login Class'ı Kullanıcı Girişini Kontrol Edecek.

    // Hesap Class'ı Hesap İşlemlerini Yapacak.

    // ATM ise ATM'mizi Çalıştıracak.
    public static void main(String[] args) {
        ATM atm = new ATM();

        Hesap hesap = new Hesap("Ali Veli","12345",2000);
        atm.calis(hesap);
        System.out.println("Programdan Çıkılıyor...");



    }


}
