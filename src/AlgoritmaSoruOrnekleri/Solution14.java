package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution14 {

    /*String tipinde sabit bir şifre değişkeni oluşturun.
    Örneğin: String password = “12345”; gibi. Ardından, kullanıcıdan klavyeden bir şifre girmesini isteyin.
    Girilen şifre ile değişkende tuttuğunuz değeri kıyaslayın.
    Eğer, iki değer birbirine eşitse ekrana “Giriş Başarılı!”, değilse “Giriş Başarısız” yazdırın.
     */

    public static void main(String[] args) {
        String pass = "212121";
        System.out.print("Sifrenizi Giriniz: ");
        Scanner input = new Scanner(System.in);
        String userpass = input.nextLine();

        if (userpass.equals(pass)) {
            System.out.println("Giris Basarili.");
        } else {
            System.out.println("Giris Basarisiz.");
        }
    }
}
