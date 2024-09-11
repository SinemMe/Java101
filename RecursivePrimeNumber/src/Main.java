import java.util.Scanner;

public class Main {
    static int prime(int num, int a){
            if (a % num == 0) {
                return 1;
            } else {
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi Giriniz: ");
        int a = scan.nextInt();

        int num = 2;

        if (prime(num, a)== 1) {
            System.out.print(a + " Sayisi Asal sayidir. ");
        } else {
            System.out.println(a + " Asal sayi degildir.");
        }
    }
}