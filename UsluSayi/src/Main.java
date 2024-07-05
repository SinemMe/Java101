import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Üssü sayi giriniz: ");
        int n = input.nextInt();
        System.out.print("Üs olacak sayi giriniz: ");
        int x = input.nextInt();

        int total = 1;


        for (int i = 1; i <= x; i++){
            total *= n;
        } System.out.println("Total: " + total);
    }
}