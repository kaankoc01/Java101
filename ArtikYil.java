import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int ArtikYil;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir yil giriniz ");
        ArtikYil = input.nextInt();
        if((ArtikYil % 4 == 0) && (ArtikYil%100 != 0)){
            System.out.println(ArtikYil+ " yili artik yildir.");
        }
        else if (ArtikYil%400 == 0) {
            System.out.println(ArtikYil + "yili bir artik yildir.");
    }
    else {
        System.out.println(ArtikYil + " Bir Artik Yil Degildir");
    }
}
}
