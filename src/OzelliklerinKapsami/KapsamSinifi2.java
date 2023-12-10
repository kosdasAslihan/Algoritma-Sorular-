package OzelliklerinKapsami;

public class KapsamSinifi2 {
    private int privateDegisken = 30;

    public KapsamSinifi2() {
    }

    public void dahiliSinifKontrol() {

        DahiliSinif d = new DahiliSinif();

        System.out.println("Kontrol Ediliyor. " + d.a);

    }
    public class DahiliSinif {
        private int privateDegisken = 20; // en local değişken olduğu için mainde bunu baz alır.
        private int a = 3;
        public void onileCarp() {
            //int privateDegisken = 10; // üçü arasında en local değişken bu olduğu için 10 ile çarpar.
            for (int i = 1; i < 6; i++) {
                //System.out.println(i + "*" + privateDegisken + " = " + (i * privateDegisken) );
                //System.out.println(i + "*" + this.privateDegisken + " = " + (i * this.privateDegisken) );
                // bu metod DahiliSinif'in içinde olduğu için this yazınca DahiliSinif'in içindeki privateDegisken kullanılır.
                System.out.println(i + "*" + KapsamSinifi2.this.privateDegisken + " = " + (i * KapsamSinifi2.this.privateDegisken) );
                //şeklinde yaptığımızda KapsamSinifi2'nin privateDegisken'ini kullanır.

            }
        }
    }
}
