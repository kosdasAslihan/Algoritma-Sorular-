package StaticInnerClasslar;

public class Matematik {

    //private double PI = Math.PI; pi'yi direkt kullanabilmek için static yapmamız lazım
    private static double PI = Math.PI;
    public static class Alan {
        public static void daire_alan(int yaricap) {
            //System.out.println("Dairenin Alanı: " +(yaricap*yaricap*Math.PI));
            System.out.println("Dairenin Alanı: " +(yaricap*yaricap*PI));
        }
    }
}
