import java.util.Scanner;

public class TekSayi {
    public static void main(String[] args) {
        int n ;
        int toplam = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Bir sayi girin : ");
            n = input.nextInt();

            if (n % 2 == 0 || n % 4 == 0) {
                toplam += n;
            }

            if (n % 2 == 1) {
                break; // Tek sayı girildiğinde döngü sonlanır.
            }
        }
        System.out.println("Girilen çift ve 4'ün katları olan sayıların toplamı: " + toplam);
    }
    }

