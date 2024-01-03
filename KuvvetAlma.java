import java.util.Scanner;

public class KuvvetAlma {
    public static void main(String[] args) {
        int n ;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        n = input.nextInt();

        for(int i = 1; i< n; i *= 4){
            
            System.out.println(i);
        }
        System.out.println("4 ün katlari:");
        for (int k = 1 ; k< n ; k *=5){
            System.out.println(k);
        }
        System.out.println("5 in  katlari:");
    }
}
