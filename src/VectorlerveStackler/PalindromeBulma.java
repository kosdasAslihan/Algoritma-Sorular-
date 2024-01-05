package VectorlerveStackler;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeBulma {
    public static void main(String[] args) {
        //Bir cümlenin palindrome olup olmadığını bulma kasaylabalyasak

        //palindrome: baştan okunuşuyla sondan okunuşunun aynı olduğu cümleler

        Scanner scanner = new Scanner(System.in);
        System.out.print("Cümleyi giriniz: ");
        String cumle = scanner.nextLine();

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < cumle.length()/2; i++) {
            stack.push(cumle.charAt(i));

        }
        if (isPalindrome(cumle,stack)) {
            System.out.println("Bu cümle palindromedur.");
        }
        else {
            System.out.println("Bu cümle palindrome değildir.");
        }

    }
    public static boolean isPalindrome (String cumle, Stack<Character> stack) {
        for (int i = (cumle.length()/2) + 1 ; i < cumle.length(); i++) {

            if (cumle.charAt(i) != stack.pop()) {
                return false;
            }

        }
        return true;
    }
}
