import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = 0;

        System.out.print("Sayi Giriniz: ");
        int n = input.nextInt();

        for (int a = 1; a <= n; a++) {
            if (n % a == 0) {
                x += n;
            }
        }
            if (x == n) {
                System.out.println(n + " Giridiginiz sayi Mükemmel sayidir.");
            } else {
                System.out.println(n +" Girdiginiz sayi Mükemmel sayi degildir.");
            }
        }
    }

