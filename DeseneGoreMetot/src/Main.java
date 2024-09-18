import java.util.Scanner;

public class Main {
    static String design(int n) {

            if (n <= 0) {
                return n + " ";
            } else {
                return n + " " + design(n - 5) + n + " ";
            }
    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("N Sayisi : ");
        int input = scan.nextInt();
        scan.close();

        String series = design(input) ;
        System.out.println("Ciktisi: " + series);
    }
}