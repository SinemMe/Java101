import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);


        int right = 3;
        int select;
        int balance = 1500;

        System.out.print("Kullanici adi girinz: ");
        userName = input.nextLine();
        System.out.print("Sifre Giriniz: ");
        password = input.nextLine();
        switch (userName) {
            case "patika":
                switch (password) {
                    case "java123":
                        do {
                            System.out.print("Merhaba, Kodluyoruz bankasina Hosgeldiniz!");
                            System.out.println("Lütfen yapmak istediginiz islemi seciniz.");
                            System.out.println("1- Para cekme.\n" +
                                    "2- Para yatirma.\n" +
                                    "3- Bakiye sorgulama.\n" +
                                    "4- Cikis yap.");
                            select = input.nextInt();
                            switch (select) {
                                case 1:
                                    System.out.print("Para miktari: ");
                                    int bakiye = input.nextInt();
                                    if (bakiye > balance) {
                                        System.out.print("bakiye yetersiz");
                                    }else {
                                        balance -= bakiye;
                                    }
                                    break;
                                case 2:
                                    System.out.print("Para miktari: ");
                                    int price = input.nextInt();
                                    balance += price;
                                    break;
                                case 3:
                                    System.out.print("Bakiyeniz: " + balance);
                                    break;
                                default:
                                    System.out.println("Hata");
                                    break;
                            }
                        } while (select != 4);
                }
            default:
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                switch (right) {
                    case 0:
                        System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz");
                        break;
                    default:
                        break;
                }
        }
    }
}