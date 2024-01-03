import java.util.Scanner;

public class CiftSayi {
    public static void main(String[] args) {
        int sayi1 ;
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int dongu = 0;
        System.out.println("Sayi giriniz");
        sayi1 = input.nextInt();
        for(int i = 0 ; i <= sayi1; i++){
            if(i %12 == 0){
                toplam = toplam +i;
                dongu++;
          //      System.out.println(i);
            }

        }
        int ortalama = toplam / dongu;
        System.out.println(ortalama);
    }
}
