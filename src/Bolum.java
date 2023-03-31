import java.util.Scanner;

public class Bolum implements IDort_islem{

    @Override
    public void toplama() {
        //Toplam classında kullanıldı.
    }

    @Override
    public void cikarma() {
        //Fark classında kulllanıldı.
    }

    @Override
    public void carpma() {
        //Carpim classında kullanıldı.
    }

    @Override
    public void bolme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kesirli ifadeleri gir(a/b ? c/d) :");
        String islem = scanner.nextLine();
        String[] parcala = islem.split("\\s*\\?\\s*");
        String kesir1 = parcala[0];
        String kesir2 = parcala[1];
        String[] kesir1Parcala = kesir1.split("\\/");
        int pay1 = Integer.parseInt(kesir1Parcala[0]);
        int payda1 = Integer.parseInt(kesir1Parcala[1]);
        String[] kesir2Parcala = kesir2.split("\\/");
        int pay2 = Integer.parseInt(kesir2Parcala[0]);
        int payda2 = Integer.parseInt(kesir2Parcala[1]);

        int bolumPay, bolumPayda;
        bolumPayda = payda1*pay2;
        bolumPay = pay1*payda2;
        if(bolumPay==bolumPayda){
            System.out.println(pay1 + "/" + payda1 + " / " + pay2 + "/" + payda2 + " = 1");
        }
        else {
            System.out.println(pay1 + "/" + payda1 + " / " + pay2 + "/" + payda2 + " = " + bolumPay + "/" + bolumPayda);
        }
    }
}
