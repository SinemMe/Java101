import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int Kilo, Boy;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        Boy = inp.nextInt();
        System.out.print("Lütfen kilonuzu giriniz :");
        Kilo = inp.nextInt();

        double Indeks = Kilo / Boy * Boy;
    }
}
