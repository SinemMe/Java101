import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Degiskenleri olustur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sinifimizi tanimladik
        Scanner inp = new Scanner(System.in);

        //Kullanicidan degerlei al
        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Turkce Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamaniz : " + sonuc);

        double a = 63.33;
        int b = 60;
        // a büyük ise o zaman "Sinif Gecti" yaz;
        System.out.println("Sinif Gecti");
        boolean kosul1 = (a >= b);
        System.out.println(kosul1);


    }
}