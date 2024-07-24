import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayisi giriniz: ");
        int n = input.nextInt();


        for (int b = 1; b <= n; b++) {

            for (int a = 1; a <= (n - b); a++) {
                System.out.print(" ");
            }
            for (int y = 1; y <= (2 * b) - 1; y++) {
                System.out.print("*");
            } System.out.println();
        }
        for (int b = n; b > 1; b--) {

            for (int a = (n-b) +1; a >= 1; a--) {
                System.out.print(" ");
            }
            for (int y = (2 * b)- 3; y >= 1 ; y--) {
                System.out.print("*");
            }System.out.println();

            }

            }
        }
