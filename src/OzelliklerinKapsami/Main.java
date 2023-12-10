package OzelliklerinKapsami;

public class Main {
    public static void main(String[] args) {
        //KapsamSinifi kapsamSinifi = new KapsamSinifi();
        //kapsamSinifi.onileCarp();

        KapsamSinifi2.DahiliSinif kapsam = new KapsamSinifi2().new DahiliSinif();

        kapsam.onileCarp();

        //System.out.println(kapsam.a); //main.java KapsamSinifi2'ye ait olmadığı için bu şekilde kullanamıyoruz.

    }
}
