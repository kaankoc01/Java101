import java.util.Scanner;

public class ManavÜcret {
    public static void main(String[] args) {
    double Armut = 2.14;
    double Elma = 3.67;
    double Domates = 1.11;
    double Muz = 0.95;
    double Patlican = 5.00;
    Scanner input = new Scanner(System.in);
    System.out.println("Kaç kg Armut aldiniz ? ");
    double armutKilo = input.nextDouble();
    System.out.println("Kaç kg Elma aldiniz ? ");
    double elmaKilo = input.nextDouble();
    System.out.println("Kaç kg Domates aldiniz ? ");
    double domatesKilo = input.nextDouble();
    System.out.println("Kaç kg Muz aldiniz ? ");
    double muzKilo = input.nextDouble();
    System.out.println("Kaç kg Patlican aldiniz ? ");
    double patlicanKilo = input.nextDouble();

    double armutÜcreti = armutKilo*Armut;
    double elmaÜcreti = elmaKilo*Elma;
    double domatesÜcreti = domatesKilo*Domates;
    double muzÜcreti = muzKilo*Muz;
    double patlicanÜcreti = patlicanKilo*Patlican;
    double toplamTutar = (armutÜcreti+elmaÜcreti+domatesÜcreti+muzÜcreti+patlicanÜcreti);

    System.out.println("Toplam Ücret :"+ toplamTutar);




    }
}
