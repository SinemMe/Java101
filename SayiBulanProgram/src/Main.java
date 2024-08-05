import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi, max = 0, min = 0, b;

        System.out.print("Kac sayi gireceksiniz: ");
        b = input.nextInt();


            for (int x = 1; x <= b; x++) {
                System.out.print(x + ". Sayiyi giriniz: ");
                sayi = input.nextInt();

                if (x == 1) {
                    min = sayi;
                    max = sayi;
                }
                if (max < sayi) {
                    max = sayi;
                }
                if (min > sayi) {
                    min = sayi;
                }
            }
            System.out.println("En büyük sayi: " + max);
            System.out.println("En kücük sayi: " + min);
        }
    }
