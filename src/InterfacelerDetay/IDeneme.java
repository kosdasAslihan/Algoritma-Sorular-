package InterfacelerDetay;

public interface IDeneme {
    //private int a = 4; interface içinde private bir alan kesinlikle tanımlanamaz.
    public int a = 4;
    //public int b; public alana "=" ile değer atamamız gerekiyor aksi halde hata veriyor.
    public static String deneme =  "Deneme";
    public final int c = 6;
    //static ve final alanları yazmamıza göre çünkü java tarafından kendisine otomatik olarak çevriliyor
    //public String deneme = "Deneme; şeklinde yazmak da doğru bir ifadedir.
    //public int c = 6; şeklinde yazmak da doğru bir ifadedir.

    /*public void deneme() { hata verdi çünkü insterface'de herhangi bir metodu direkt olarak direkt ekleyemiyoruz.
        System.out.println("Deneme");
    }*/

    public static void deneme() {

        System.out.println("Deneme");
    }



}
