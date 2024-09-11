import java.util.Scanner;

public class Main {

    static int pow(int a, int b){
        int result = 1;
        for (int x = 1; x <= b; x++){
            if (b == 0){
                result = a * (b - 1);
            }
            result *= a;
        } return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban degeri giriniz :");
        int a = scan.nextInt();

        System.out.print("Üs degeri giriniz :");
        int b = scan.nextInt();

        System.out.println("Sonuc : "+ (pow(a, b)));
    }
}