import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int x = input.nextInt();


        int j = 1;
        while (j <= x) {
            System.out.println(j);
            j += 3;
        } int k = 1;
        while (k <= x) {
            System.out.println(k);
            k += 4;
        }
    }
}