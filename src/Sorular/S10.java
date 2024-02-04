package Sorular;


import java.util.Arrays;
import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
        /*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
			isAnagram("listen", "Silent") ==> true
		 */

        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci kelimeyi giriniz: ");
        String kelime1 = scan.next();

        System.out.print("İkinci kelimeyi giriniz: ");
        String kelime2 = scan.next();

        String[] k1 = new String[kelime1.length()];
        String[] k2 = new String[kelime2.length()];

        for (int i = 0; i < k1.length; i++){
            char character = kelime1.charAt(i);
            k1[i] = String.valueOf(character);
        }
        for (int j = 0; j < k2.length; j++){
            char character = kelime2.charAt(j);
            k2[j] = String.valueOf(character);

        }
        Arrays.sort(k1);
        Arrays.sort(k2);

        //System.out.println(Arrays.toString(k1));
        //System.out.println(Arrays.toString(k2));

        boolean isAnagram = false;
        if (Arrays.equals(k1,k2)){
            isAnagram = true;
            System.out.println(isAnagram);
        }else {
            System.out.println(isAnagram);
        }

    }
}
