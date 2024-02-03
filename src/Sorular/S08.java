package Sorular;

public class S08 {
    public static void main(String[] args) {
        int num = 0;

        do {
            if (num % 2 == 0){
                num += 2;
            }
        }while (num < 7);
        System.out.println(num); //8
    }
}
