package OgrenciNotSistemi;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    /*
    Fizik dersine ait sözlü notunun ortalamaya etkisi %20 ise sınav notunun etkisi %80'dir.
    Öğrenci sözlüden 90, sınavdan 60 almış ise o dersin genel ortalamaya etkisi şu şekilde hesaplanır:
    Fizik Ortalaması: (90*0.20) + (60*0.80);
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Öğrencinin Tam Adını Yazınız: ");
        String isim = scanner.nextLine();
        System.out.print("Dersin Adını Yazınız: ");
        String ders = scanner.nextLine();
        System.out.print("Dersten Aldığınız Yazılı Notunu Yazınız: ");
        int notYazili = scanner.nextInt();
        System.out.print("Dersten Aldığınız Sozlu Notunu Yazınız: ");
        int notSozlu = scanner.nextInt();
        scanner.nextLine();







    }
    public static Ogretmen addTeacher(String name,String brans){
        Ogretmen ogretmen=new Ogretmen();
        ogretmen.setOgretmenAd(name);
        ogretmen.setOgretmenBrans(brans);

        return ogretmen;
    }

    public  static void printTeacher(List<Ogretmen> list) {
        for (Ogretmen w : list) {
            System.out.println(w);
        }
    }
    public static void addBulkExamNote(Dersler dersName1,Dersler dersName2,Dersler dersName3, Ogrenci ogrenci){
        System.out.println("Ders notlarını giriniz");
        Scanner scanner=new Scanner(System.in);
        String dersAdı = scanner.nextLine();
        Dersler dersNotu =  dersAdı
        switch (dersNotu){
            case dersName1:
                System.out.println(dersName1 +" sözlü notunu giriniz");
                dersName1.setNotSozlu(scanner.nextInt());
                System.out.println(dersName1 +" sınav notunu giriniz");
                dersName1.setNotYazili(scanner.nextInt());
                System.out.println("Öğretmen Bilgilerini gir");
                dersName1.setOgretmen(addTeacher(scanner.next(), scanner.next()));
                ogrenci.setDers1(dersName1);
                dersCalculation(ogrenci.getDers1());
                break;
            case 2:
                System.out.println(dersName2 +" sözlü notunu giriniz");
                dersName2.setNotSozlu(scanner.nextInt());
                System.out.println(dersName2 +" sınav notunu giriniz");
                dersName2.setNotYazili(scanner.nextInt());
                ogrenci.setDers2(dersName2);
                dersCalculation(ogrenci.getDers2());
                break;
            case 3:
                System.out.println(dersName3+" sözlü notunu giriniz");
                dersName3.setNotSozlu(scanner.nextInt());
                System.out.println(dersName3 +" sınav notunu giriniz");
                dersName3.setNotYazili(scanner.nextInt());
                ogrenci.setDers3(dersName3);
                dersCalculation(ogrenci.getDers3());
                break;
            default:
                System.out.println("Böyle bir ders yoktur");
        }

    }

    private static void dersCalculation(Dersler dersler) {
        int sınavNotu=dersler.getNotYazili();
        int sözlüNotu=dersler.getNotSozlu();

        double ortalama=(sınavNotu*0.8)+(sözlüNotu*0.2);

        if (ortalama>50){
            System.out.println("Öğrenci dersi başarıyla geçmiştir");
        }
        else System.out.println("Öğrenci"+ dersler.getDers()+ "dersten kalmıştır");
    }

}
