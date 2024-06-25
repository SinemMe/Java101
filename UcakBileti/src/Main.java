import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Age = 0;
        int trip = 1;
        int km = 0;

        System.out.print("Mesafeyi km türünde giriniz: ");
        km = input.nextInt();
        System.out.print("Yasinizi giriniz: ");
        Age = input.nextInt();
        System.out.print("Yolculuk tipi giriniz (1 => Tek Yön , 2 => Gidiş Dönüş )");
        trip = input.nextInt();


        if (km > 0 && Age > 0 && (trip == 1 || trip == 2)) {
            double BiletFiyati = km * 0.10;
            double indirimliBilet = 0;
            double YasIndirimi = 0;

            if (Age < 12) {
                YasIndirimi = 0.50;
            } else if (Age >= 12 && Age <= 24) {
                YasIndirimi = 0.10;
            } else if (Age >= 65) {
                YasIndirimi = 0.30;
            }
            YasIndirimi = BiletFiyati * YasIndirimi;
            BiletFiyati -= YasIndirimi;

            if (trip == 2) {
                BiletFiyati -= BiletFiyati * 0.20;
                BiletFiyati *= 2;
            }
            System.out.print("Bilet Fiyati = " + BiletFiyati);

        } else {
            System.out.print("Hatali giris yaptiniz.");
        }
    }
}
