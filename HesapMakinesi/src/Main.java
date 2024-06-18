import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.print("ilk Sayi Girniz : ");
        n1 = input.nextInt();
        System.out.print("Ikinci Sayi Girniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplam\n2-Cikarma\n3-Carpma\n4-Bölme");
        System.out.print("Seciminiz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Cikarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Carpma : " + (n1 * n2));
                break;
            case 4:
                //(n2 != 0)
                System.out.println("Bölme : " + (n1 / n2));
                //Bir sayi 0'a bölünemez;
                break;
            default:
                System.out.println("Yanlis secim yaptiniz. Tekrar deneyiniz");
        }
    }
}