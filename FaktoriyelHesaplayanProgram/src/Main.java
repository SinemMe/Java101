import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // n! = 1* 2* 3* 4* 5* ...... *n;
        Scanner input = new Scanner(System.in);
        int n;


        System.out.print("Faktöriyel Sayi giriniz: ");
        n = input.nextInt();

        int i = 1;
        int toplam = 1;

        while (i <= n) {
        toplam = toplam * i;
        i++;
        }

        System.out.println(n + ". Faktöriyel: " + toplam);

    }
}
