import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password, answer, newPassword;

        System.out.print("Kullanıcı adı: ");
        userName = inp. nextLine();

        System.out.print("Şifre: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş Yaptınız!");
        }

        else if (userName.equals("patika") && !(password.equals("java123"))) {

            System.out.print("Şifre yanlış! Sıfırlamak ister misiniz? (Evet ve ya Hayır) ");
            answer = inp.nextLine();

            if (answer.equals("Evet") || answer.equals("evet")) {
                System.out.print("Önceden kullanmadığınız yeni şifre giriniz: ");
                newPassword = inp.nextLine();

                if (newPassword.equals("java123")) {
                    System.out.print("Sifre olusturulamadı, lütfen baska şifre giriniz.");
                }
                else
                    System.out.println("Şifre oluşturuldu");
            }
            else {
                System.out.println("Şifre oluşturmadınız.");
            }
        }
        else {
            System.out.println("Bilgiler yanlış");
        }

    }
}