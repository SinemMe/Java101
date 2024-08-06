import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayisi giriniz: ");
        int b = input.nextInt();


        for (int s = b; s > 1; s--) {
            for (int i = (2 * s) -3; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}