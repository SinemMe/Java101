import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int num = input.nextInt();
        int x = 0;
        int b = 1;


        for (int i = 0; i <= num; i++) {
            if (x <= b){
                int a = x + b;
                x = b;
                b = a;
                System.out.println(x + ", ");
            }

        }
    }
}