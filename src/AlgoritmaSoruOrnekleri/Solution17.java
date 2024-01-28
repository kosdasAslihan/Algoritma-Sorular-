package AlgoritmaSoruOrnekleri;

import java.util.Scanner;

public class Solution17 {

    /*Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

    i)En az 8 karakter olsun
    ii)Space karakteri password'de olmasin
    iii)En az bir tane buyuk harf olsun
    iv)En az bir tane kucuk harf olsun
    v)En az bir tane rakam olsun */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String pwd = input.nextLine();

        boolean lengthControl = pwd.length() > 7;

        boolean spaceControl = pwd.replaceAll("[^ ]", "").length() == 0;

        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length() > 0;

        boolean lowerCaseControl = pwd.replaceAll("[^a-z]", "").length() > 0;

        boolean digitControl = pwd.replaceAll("[^0-9]", "").length() > 0;

        if (!lengthControl) {
            System.out.println("Sifre en az 8 karakterli olmali");
        }
        if (!spaceControl) {
            System.out.println("Sifre bosluk icermemeli");
        }
        if (!upperCaseControl) {
            System.out.println("Sifre en az 1 tane buyuk harf icermeli");
        }
        if (!lowerCaseControl) {
            System.out.println("Sifre en az 1 tane kucuk harf icermeli");
        }
        if (!digitControl) {
            System.out.println("Sifre en az 1 tane rakam icermeli");
        }
        boolean isValid = lengthControl && spaceControl && upperCaseControl && lowerCaseControl && digitControl;

        if(isValid){
            System.out.println("Sifre gecerlidir");
        }
        else {
            System.out.println("Sifre gecersizdir");
        }
    }

}
