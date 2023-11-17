package BeybladeProgrami;

public class Dranza extends Beyblade {

    private String kutsalCanavar;

    public Dranza (String beybladeci, int donuzHizi, int saldiriGucu, String kutsalCanavar) {
        super(beybladeci, donuzHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;

    }
        @Override
        public void bilgileriGoster() {
        System.out.println("Kutsal canavar adı: " + kutsalCanavar);
    }


        @Override
        public void kutsalCanavarOrtayaCikar() {
            super.kutsalCanavarOrtayaCikar();
        super.bilgileriGoster();
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " 'ı ortaya çıkarıyor...");
        System.out.println(getBeybladeci() + " 'ın Saldırısı: Alev Kılıcı" );
    }
}


