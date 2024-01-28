package AlgoritmaSoruOrnekleri;

public class Solution21 {

    //10 ile 1000 arasındaki tam kare sayıları ekrana yazdıran programın algoritması

    public static void main(String[] args) {
        int kareKok = 4;

        for (kareKok = 4; kareKok <= 1000; kareKok++){
            if(kareKok*kareKok <= 1000){
                System.out.println(kareKok*kareKok);
            }
            else {
                break;
            }
        }
    }
}
