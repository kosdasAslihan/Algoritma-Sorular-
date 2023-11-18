package AlgoritmaSorulari;

import java.util.Scanner;
public class Ticket {
     public static void main(String[] args) {
       /* A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine 700km D şehrine 900km mesafededir.
        Bilet tarifesi :
        Km birim fiyatı: 0.10tl
        Yolcu 12 yaşından küçükse toplam fiyat %50 indirim ,
        12 ve 24 yaş arasındaysa %10 indirim ,
        65 yaşından büyükse %30 indirim ,
        Bilet gidiş dönüş alınırsa %20 indirim uygulayan bir app create ediniz.
       */

       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Yaşınızı Giriniz: ");
        int yas = scanner.nextInt();
        scanner.nextLine();

        String islemler = "1. B şehri (500km)\n"
                + "2. C şehri (700km)\n"
                + "3. D şehri (900km)\n"
                + "Çıkış için q'ya basınız.";
        System.out.println("***************************************************");
        System.out.println(islemler);
        System.out.println("***************************************************");


        while (true) {

            System.out.print("İşlemi Seçiniz: ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;

            }
            else if (islem.equals("1")) {
                int km = 500;
                double kurus = 0.10;
                if (yas < 12) {
                    double indirimOrani = (km*kurus) *0.50;
                    double yeniTutar = (km*kurus) - indirimOrani;
                    System.out.println("12 yaşından küçük olduğunuz için %50 indirim uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");
                    break;
                }
                else if (yas > 12 && yas < 24) {
                    double indirimOrani = (km * kurus) * 0.10;
                    double yeniTutar = (km*kurus) - indirimOrani;
                    System.out.println("12-24 yaş aralığında olduğunuz için %10 uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");
                    break;

                }
                else if (yas > 65) {
                    double indirimOrani = (km * kurus) * 0.30;
                    double yeniTutar = (km * kurus)- indirimOrani;
                    System.out.println("65 yaşından büyük olduğunuz için %30 indirim uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");
                    break;

                }
                else {
                    System.out.println("Toplam Tutar: " + km * kurus);
                    break;

                }
            }

            else if (islem.equals("2")) {
                int km = 700;
                double kurus = 0.10;
                if (yas < 12) {
                    double indirimOrani = (km*kurus) *0.50;
                    double yeniTutar = (km*kurus) - indirimOrani;
                    System.out.println("12 yaşından küçük olduğunuz için %50 indirim uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");
                    break;
                }
                else if (yas > 12 && yas < 24) {
                    double indirimOrani = (km * kurus) * 0.10;
                    double yeniTutar = (km*kurus) - indirimOrani;
                    System.out.println("12-24 yaş aralığında olduğunuz için %10 uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");
                    break;

                }
                else if (yas > 65) {
                    double indirimOrani = (km * kurus) * 0.30;
                    double yeniTutar = (km * kurus)- indirimOrani;
                    System.out.println("65 yaşından büyük olduğunuz için %30 indirim uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");
                    break;

                }
                else {
                    System.out.println("Toplam Tutar: " + km * kurus);
                    break;
                }

            }

            else if (islem.equals("3")) {
                int km = 900;
                double kurus = 0.10;

                if (yas < 12) {
                    double indirimOrani = (km * kurus) * 0.50;
                    double yeniTutar = (km * kurus) - indirimOrani;
                    System.out.println("12 yaşından küçük olduğunuz için %50 indirim uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");
                    break;

                }
                else if (yas > 12 && yas < 24) {
                    double indirimOrani = (km * kurus) * 0.10;
                    double yeniTutar = (km * kurus) - indirimOrani;
                    System.out.println("12-24 yaş aralığında olduğunuz için %10 uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");
                    break;


                }
                else if (yas > 65) {
                    double indirimOrani = (km * kurus) * 0.30;
                    double yeniTutar = (km * kurus) - indirimOrani;
                    System.out.println("65 yaşından büyük olduğunuz için %30 indirim uygulanmıştır ödemeniz gereken "
                            + yeniTutar + " tl'dir");
                    break;


                }
                else {
                    System.out.println("Toplam Tutar: " + km * kurus);
                    break;
                }

            }

            else {
                System.out.println("Geçersiz işlem girdiniz.");
            }



        }

    } */

         HavayoluCustomer customer = new HavayoluCustomer();
         customer.setName("Ali");
         customer.setSurname("Veli");
         customer.setGoalCity(City.B);
         customer.setAge(66);
         customer.setDirection(2);
         System.out.println(calculateCostOfTicket(customer));

     }

     public static double calculateCostOfTicket(HavayoluCustomer customer) {
         int direction = customer.getDirection();
         calculateKmCost(customer);
         double lastTicketCost = customer.getTicketCost();
         if (direction == 1) {
             System.out.println("Herhangi bir indiriminiz yoktur.");
         }

         else if (direction == 2) {
             double discountRate = 0.2;
             lastTicketCost= lastTicketCost- lastTicketCost*discountRate;
             customer.setTicketCost(lastTicketCost);
         }
         return lastTicketCost;
     }

     public static double ageDiscount(HavayoluCustomer customer, double kmCost) {
         int age = customer.getAge();
         double cost = customer.getTicketCost();

         if (age < 12) {
             double indirimOrani = 0.50;
             cost = cost - cost * indirimOrani;
             customer.setTicketCost(cost);

         } else if (age > 12 && age < 24) {
             double indirimOrani = 0.10;
             cost = cost - cost * indirimOrani;
             customer.setTicketCost(cost);

         } else if (age > 65) {
             double indirimOrani = 0.30;
             cost = cost - cost * indirimOrani;
             customer.setTicketCost(cost);

         }
         return cost;
     }

    public static double calculateKmCost(HavayoluCustomer customer) {
        City goalCity = customer.getGoalCity();
        double kmCost = 0.10;
        if (goalCity.equals(City.B)) {
            double cost= kmCost * 500;
            customer.setTicketCost(cost);
            ageDiscount(customer, cost);
            return customer.getTicketCost();
        } else if (goalCity.equals(City.C)) {
            double cost = kmCost * 700;
            customer.setTicketCost(cost);
            ageDiscount(customer, kmCost);
            return  customer.getTicketCost();
        } else if (goalCity.equals(City.D)) {
            double cost = kmCost * 900;
            customer.setTicketCost(cost);
            ageDiscount(customer, kmCost);
            return  customer.getTicketCost();
        } else {
            System.out.println("aradığınız şehir bulunamadı");
            return  customer.getTicketCost();
        }

    }

}
