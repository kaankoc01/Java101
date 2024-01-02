import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double sayi1,sayi2;

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Sayiyi giriniz:");
        sayi1 = input.nextDouble();
        System.out.println("İkinci Sayiyi giriniz:");
        sayi2 = input.nextDouble();

        System.out.println("****İSLEMİNİZİ SEÇİNİZ***");
        System.out.println("1. TOPLAMA");
        System.out.println("2. ÇIKARMA");
        System.out.println("3. ÇARPMA");
        System.out.println("4. BÖLME");
        System.out.print("Secimininizi giriniz: ");
        int secim = input.nextInt();
        switch(secim) {
            case 1:
                System.out.println("Toplama isleminin sonucu = " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Çikarma isleminin sonucu = " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Carpma isleminin sonucu = " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Bölme isleminin sonucu = " + (float)sayi1 / sayi2);
            }


        
    }
}
