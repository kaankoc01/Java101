import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        
        double boy;
        double kilo;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (Metre cinsinden) giriniz:");
        boy = input.nextDouble();
        System.out.println("lütfen kilonuzu giriniz:");
        kilo = input.nextDouble();

        double vucutKitleEndeksi = kilo / (boy*boy) ;

        System.out.println("Vücüt Kitle Endeksiniz: "+vucutKitleEndeksi);

        
    }
}
