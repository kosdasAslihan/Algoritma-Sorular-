package Sorular;

import java.util.Scanner;

public class S15 {
    public static void main(String[] args) {


        int[][] tablo = new int[4][4];

        tablo[0][0] = 5;
        tablo[0][1] = 8;
        tablo[0][2] = 15;
        tablo[0][3] = 12;
        tablo[1][0] = 3;
        tablo[1][1] = 9;
        tablo[1][2] = 4;
        tablo[1][3] = 16;
        tablo[2][0] = 2;
        tablo[2][1] = 11;
        tablo[2][2] = 9;
        tablo[2][3] = 4;
        tablo[3][0] = 10;
        tablo[3][1] = 6;
        tablo[3][2] = 10;
        tablo[3][3] = 7;


        System.out.println("Satış tablomuz şu şekildedir: ");
        System.out.println("Samsung-Iphone-General Mobile-Huawei");

        for (int k = 0; k <= 3; k++) {
            for (int m = 0; m <= 3; m++) {
                System.out.print("|   " +tablo[k][m]+ "   |");
            }
            System.out.println();
        }
    }
}
