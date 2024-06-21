import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mat, fizik, turkce, kimya, muzik;

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Türkce notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        double average = (mat + fizik + turkce + kimya + muzik) / 5;

        if (average <= 100) {
            System.out.print("Sinifi Gecemediniz. Seneye yine deneyiniz.");
        }else {
            System.out.print("Sinifi Gectiniz. Tebrik ederiz.");
        }
        System.out.println("Ortalamaniz: " + average);

    }
}