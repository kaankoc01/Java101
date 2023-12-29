import java.util.Scanner;

public class Taksimetre {
public static void main(String[] args) {
    
    int taksimetreAcilis = 10;
    double kmBasiÜcret = 2.20;
    int minTutar = 20;

    Scanner input = new Scanner(System.in);
    System.out.println("Kaç km gittiğinizi giriniz");
    double gidilenKm = input.nextDouble();

    double toplamPara = taksimetreAcilis + (kmBasiÜcret*gidilenKm);

    if(taksimetreAcilis + (kmBasiÜcret*gidilenKm) < minTutar){
        System.out.println("Min tutar 20 tldir. 20 tlden az ücret ödeyemezsiniz");
    }
    else{
        System.out.println("Toplam Ödemeniz gereken ücret :" + toplamPara);
    }
    
    




}   
}
