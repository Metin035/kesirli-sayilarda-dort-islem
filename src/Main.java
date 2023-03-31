import java.util.Scanner;

public class Main {
    //Metin TAŞ 21010708026 BTBS-2
    public static void main(String[] args) {
        IDort_islem toplam = new Toplam();
        IDort_islem fark = new Fark();
        IDort_islem bolum = new Bolum();
        IDort_islem carpim = new Carpim();
        toplam.toplama();
        fark.cikarma();
        bolum.bolme();
        carpim.carpma();
    }
}