import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int right;
        int select;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici Adiniz :");
        userName = input.nextLine();
        System.out.print("Parolaniza giriniz: ");
        password = input.nextLine();

        switch (userName) {
            case 1:
                if (userName.equals("patika") && password.equals("java123")) {
                    System.out.print("Merhaba, Kodluyoruz bankasina Hosgeldiniz!");

                    System.out.println("Lütfen yapmak istediginiz islemi seciniz.");
                    System.out.println("1- Para cekme.\n" +
                            "2- Para yatirma.\n" +
                            "3- Bakiye sorgulama.\n" +
                            "4- Cikis yap.");
                    select = input.nextInt();
                    if (select != 4) {

                    } else {
                        System.out.print("Hatali giris yaptiniz. Tekrar deneyiniz.");
                        break;
                        default:
                            System.out.println("Iyi günler dileriz.");


                    }
                }
        }
    }
}
