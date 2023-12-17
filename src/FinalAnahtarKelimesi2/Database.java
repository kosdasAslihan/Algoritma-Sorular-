package FinalAnahtarKelimesi2;

public final class Database {
    //class'ı final yaptığımızda o class'tan hiçbir alt sınıf üretilemez.
    //public final void baglantiKur(String username,String password) { final kelimesi eklendiğinde Database2'de override edilemiyor.
    public void baglantiKur(String username,String password) {
        System.out.println(username);
        System.out.println(password);

    }
}
