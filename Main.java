import java.util.Scanner;

public class Main {
    public static void main(String[] args){
         // Girilen sınav notlarının ortalamasını alıp , gerçek ortalamayı bulan program.
        int mat , fizik , kimya, türkçe , tarih , müzik ;


        Scanner input = new Scanner(System.in); 
            System.out.println("Matematik Notunuzu Giriniz");
            mat = input.nextInt();
            System.out.println("Fizik Notunuzu Giriniz");
            fizik = input.nextInt();
            System.out.println("Kimya Notunuzu Giriniz");
            kimya = input.nextInt();
            System.out.println("Türkçe Notunuzu Giriniz");
            türkçe = input.nextInt();
            System.out.println("Tarih Notunuzu Giriniz");
            tarih = input.nextInt();
            System.out.println("Müzik Notunuzu Giriniz");
            müzik = input.nextInt();
        
            double toplamDeger = (mat+fizik+kimya+tarih+türkçe+müzik);

            double sonuc = (toplamDeger/6);
            System.out.println(sonuc);
            System.out.println(sonuc);
            System.out.println(sonuc);
            

    }
    }

