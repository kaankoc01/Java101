import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("faktoriyeli alınacak sayiyi giriniz");
        int sayi = input.nextInt();
        int total = 1;

        for(int i =1 ; i <= sayi;i++){
            total = total *i;

        }
        System.out.println("faktoriyel:" + total);
    }
}
