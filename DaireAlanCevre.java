import java.util.Scanner;

public class DaireAlanCevre {
    public static void main(String[] args) {
        int yaricap ;
        int merkezAciOlcüsü;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Dairenin yaricapini giriniz");
        yaricap = input.nextInt();
        System.out.println("Dairenin merkez açi ölçüsünü giriniz");
        merkezAciOlcüsü = input.nextInt();

        ;
        double Cevre = (2*pi * yaricap) ;

        double merkezAciOlcülüAlan = (pi* yaricap*yaricap*merkezAciOlcüsü)/360;

        System.out.println("Dairenin Çevresi : " + Cevre);
        System.out.println("Merkez Aci Olçüsü verilen Dairenin Alanı :"+ merkezAciOlcülüAlan);

    }
}
