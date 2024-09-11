import java.util.Scanner;

public class Main {

    static int sum(int a, int b){
        int result = a+ b;
        System.out.println("Toplam : " + result);
        return result;
    }
    static int minus(int a, int b){
        int result = a - b;
        System.out.println("Toplam : " + result);
        return result;
    }
    static int impact(int a, int b){
        int result = a * b;
        System.out.println("Toplam :" + result);
        return result;
    }
    static  int divided(int a, int b){
        int result = a / b;
        System.out.println("Toplam: " + result);
        return result;
    }
    static int power(int a, int b){
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b){
        int result = a % b;
        System.out.println("Toplam: "+ result);
        return result;
    }
    static int calc(int a, int b){
        System.out.println("Cevre : " + (2 *(a + b)));
        System.out.println("Alan : " + (a * b));
        return 1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "1- Toplam islemi\n"
                + "2- Cikarma islemi\n"
                + "3- Carpma islemi\n"
                + "4- Bölme islemi\n"
                + "5- Üslü sayi Hesaplama\n"
                + "6- Mod Alma\n"
                + "7- Dikdörtgen Alan ve Cevre Hesabi\n"
                + "0- Cikis yap";

        System.out.println(menu);
        while (true){
            System.out.print("Bir islem seciniz: ");
            select = scan.nextInt();
            if (select == 0){
                break;
            }
            System.out.print("Ilk sayi giriniz: ");
            int a = scan.nextInt();
            System.out.print("Ikinci sayi giriniz: ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    impact(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    System.out.println("Üs sayiniz: " + (power(a, b)));
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    calc(a, b);
                    break;
                default:
                    System.out.print("Hatali giris yaptiniz.");
            }

        }System.out.print("Güle Güle.");

    }
}