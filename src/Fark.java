import java.util.Scanner;

public class Fark implements IDort_islem{

    @Override
    public void toplama() {
        //Toplan classında kullanıldı.
    }
    @Override
    public void cikarma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kesirli ifadeleri gir(a/b-c/d) :");
        String islem = scanner.nextLine();
        String[] parcala = islem.split("\\s*\\-\\s*");
        String kesir1 = parcala[0];
        String kesir2 = parcala[1];
        String[] kesir1Parcala = kesir1.split("\\/");
        int pay1 = Integer.parseInt(kesir1Parcala[0]);
        int payda1 = Integer.parseInt(kesir1Parcala[1]);
        String[] kesir2Parcala = kesir2.split("\\/");
        int pay2 = Integer.parseInt(kesir2Parcala[0]);
        int payda2 = Integer.parseInt(kesir2Parcala[1]);

        int farkPay, farkPayda;
        if(payda1 == payda2){
            farkPayda = payda1;
            farkPay = (pay1-pay2);
        }
        else {
            farkPayda = payda1*payda2;
            farkPay = ((pay1*payda2) - (pay2*payda1));
        }
        if(farkPay==farkPayda){
            System.out.println(pay1 + "/" + payda1 + " - " + pay2 + "/" + payda2 + " = 1");
        }
        else {
            System.out.println(pay1 + "/" + payda1 + " - " + pay2 + "/" + payda2 + " = " + farkPay + "/" + farkPayda);
        }
    }

    @Override
    public void carpma() {
        //Carpim classında kullanıldı.
    }

    @Override
    public void bolme() {
        //Bolum classında kullanıldı.
    }
}
