import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     String id,password,newPassword,passwordChange;

        System.out.print("Kullanıcı adınızı giriniz: ");
        id = scanner.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = scanner.nextLine();

        if (id.equals("selimozgur") && password.equals("78956622")){
            System.out.println("Giriş Başarılı");
        }
        else {
            System.out.println("Parolanız Hatalı");
            System.out.println("Şifrenizi sıfırlamak için (Evet/Hayır) yazınız.");
            passwordChange = scanner.nextLine();
            if (passwordChange.equals("Evet")){
                System.out.println("Yeni Şifrenizi Giriniz: ");
                newPassword = scanner.nextLine();

                if (newPassword.equals("78956622")) {
                    System.out.println("Eski şifrenizi kullanıyorsunuz, şifreniz oluşturulamadı.");
                }
                else {
                    System.out.println("Şifreniz oluşturuldu.");
                }
            }
            else
            {
                System.out.println("Tekrar Deneyiniz");
            }

        }
    }
}