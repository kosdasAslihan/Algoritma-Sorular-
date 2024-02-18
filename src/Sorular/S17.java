package Sorular;

import java.util.Arrays;
import java.util.Scanner;

public class S17 {
    public static void main(String[] args) {

        //Example 1:String bir Array olusturunuz ve "Tom ve tomdan onceki" tum elemanlari ekrana yazdiriniz
        //{"aramço", "katil", "katana", "tom", "fırkam"}

        String arr[] = {"aramço", "katil", "katana", "tom", "fırkam"};
        for (String w : arr) {
            System.out.println(w + " "); //aramço katil katana tom
            if (w == "tom") {
                break;
            }

        }
        System.out.println("******************************");
        //Example 2:String bir Array olusturunuz ve "Tom ve Jane" haric tum elemanlari ekrana yazdiriniz
        String a[] = {"aramço", "katil", "katana", "tom", "fırkam"};
        for (String w : a) {
            if (w.equals("tom") || w.equals("katil")) {
                continue;
            }
            System.out.println(w + " "); //aramço katana fırkam
        }
        System.out.println("******************************");
        //example 3: Kullanici ile beraber bir Array olsuturunuz ve icine data ekleyiniz
        //          Bir ogretmenin sinifindaki ogrencilerin isimlerini application a yuklemesini saglayan kodu yazinin

        Scanner scan = new Scanner(System.in);
        System.out.println("Kac ogrenci ismi gireceksiniz?");
        int numOfStd = scan.nextInt();

        String names[] = new String[numOfStd];

        for (int i = 1; i <= numOfStd; i++){
            System.out.println("Lutfen " + i + ". ogrencinin 1. adini giriniz");
            String stdName = scan.next();

            if (stdName.equalsIgnoreCase("q")){
                break;
            }
            names[i - 1] = stdName;
        }
        System.out.println(Arrays.toString(names));
    }
}
