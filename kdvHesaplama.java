import java.util.Scanner;

public class kdvHesaplama {
    public static void main(String[] args) {
         // kdv tutarı hesaplayan program

        double tutar ;
        double kdvOran = 0.18;
        Scanner input = new Scanner(System.in);
        System.out.println("Ücreti Giriniz");
        tutar = input.nextDouble();
        if(tutar < 1000){
        double kdvliÜcret = tutar * kdvOran;
        double toplamTutar = kdvliÜcret + tutar;
        System.out.println("Ücretin kdvsi  : "+kdvliÜcret);
        System.out.println(" Toplam Ücret "+toplamTutar);

        }
        else{
            double yeniKdvOran = 0.8;
            double yeniKdvliÜcret = tutar * yeniKdvOran;
            double yeniToplamTutar = yeniKdvliÜcret + tutar;
             System.out.println("Ücretin kdvsi  : "+yeniKdvliÜcret);
            System.out.println(" Toplam Ücret "+yeniToplamTutar);

        }
    }
    }

