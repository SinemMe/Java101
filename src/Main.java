import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      int km;
      double perKm = 2.20 , total, TaxMeter = 10;

      Scanner input = new Scanner(System.in);
      System.out.print("Mesafeyi KM cinsinden giriniz : " );
      km = input.nextInt();

      total = (km * perKm);
      total += TaxMeter;
      System.out.println("Total : " + total);

   }
}
