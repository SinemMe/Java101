import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20 , total, TaxMeter = 10;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz : " );
        km = input.nextInt();

        total = (km * perKm);
        total += TaxMeter;

        total = (total < 20) ? 20 : total;
        System.out.println("Total : " + total);

    }
}