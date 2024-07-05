import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi Giriniz: ");
        int n = scan.nextInt();
            /*
         for (int i = 1; i <= n; i *= 4) {
            System.out.println(i);
        }
        for (int k = 1; k <= n; k *= 5) {
            System.out.println(k);
            */
        int j = 1;
        while (j <= n){
            System.out.println(j);
            j *= 4;
        } int x = 1;
        while (x <= n){
            System.out.println(x);
            x *= 5;
            }
        }
    }
