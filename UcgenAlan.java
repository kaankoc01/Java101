import java.util.Scanner;

public class UcgenAlan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("üçgenin 1.kenarini giriniz");
        int a = input.nextInt();
        System.out.println("üçgenin 2.kenarini giriniz");
        int b = input.nextInt();
        System.out.println("üçgenin 3.kenarini giriniz");
        int c = input.nextInt();
        
        int u = (a+b+c)/2;
        int ucgenCevre = 2*u;
        int Alan = u * (u - a)* (u - b) * (u - c);

        System.out.println("Üçgenin Çevresi : "+ ucgenCevre);
        System.out.println("Üçgenin Alanı :" + Alan);




    }
}