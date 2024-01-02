import java.util.Scanner;

public class KBsiralama {

    public static void main(String[] args) {
        int a,b,c;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Birinci sayiyi giriniz");
        a = input.nextInt();
        System.out.println("İkinci sayiyi giriniz");
        b = input.nextInt();
        System.out.println("Üçüncü sayiyi giriniz");
        c = input.nextInt();

        if((a > b) && ( a > c)){
            if(b>c){
                System.out.println(" Sayilar a>b>c şeklinde siralanmiştir");
            }
            else{
                System.out.println("Sayilar a>c>b şeklinde siralanmiştir. ");
            }
        }
        else if((b > a) && (b > c)){
            if(a>c){
                System.out.println("Sayilar b>a>c şeklinde siralanmiştir.");
            }
        else{
            System.out.println("Sayilar b>c>a şeklinde siralanmiştir.");
        }
        }
        else if((c > a) && (c > b)){
            if(a>b){
                System.out.println("Sayilar c>a>b şeklinde siralanmiştir.");
            }
        else{
            System.out.println("Sayilar c>b>a şeklinde siralanmiştir.");
        }
        }

    }
}