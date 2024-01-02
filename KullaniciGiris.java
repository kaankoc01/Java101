import java.util.Scanner;

public class KullaniciGiris {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String userName , password;
        


        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici Adiniz");
        userName = input.nextLine();
        System.out.println("Şifrenizi Giriniz:");
        password = input.nextLine();
        
        if(userName.equals("patika") && password.equals("java123") ){
            System.out.println("Giriş başarili");
        }
        else if(userName.equals("patika") || !password.equals("123")){
            System.out.println("Yanliş Şifre girdiniz. Şifrenizi Değiştirmek istermisiniz ? : /n Yes = 1 /n No = 2");

        }else if (!userName.equals("PATİKA") || password.equals("java123")){
            System.out.println("Yanlis username , kontrol ederek tekrardan giriniz.");
        }

        int secim;
        secim = input.nextInt();
        switch (secim){
            
            case 1:
            Scanner sc = new Scanner(System.in);
            System.out.print("Yeni sifre giriniz");
            String newPassword = sc.nextLine();
            
            if(newPassword.equals("java123")){
                System.out.print("Eski sifreyi girdiniz lutfen yeni bir sifre olusturun:");
                newPassword = sc.nextLine();
                System.out.print("Sifre basarili bir sekilde degistirildi:");
            }
            else{
                    System.out.println("Sifre basarili bir sekilde degistirildi");
                }    
            break;
            case 2:
            System.out.print("Sifre degistirme islemi sonlandi");
                break;
            default:
            System.out.print("Yanlis giris yaptiniz lutfen tekrar deneyin:");
        }

        
    }
}
