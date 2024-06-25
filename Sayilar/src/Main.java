import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);

        System.out.print("1. number: ");
        a = sc.nextInt();

        System.out.print("2. number: ");
        b = sc.nextInt();

        System.out.print("3. number: ");
        c = sc.nextInt();

        if ((a > b) && (a > b)) {
            if (b > c) {
                System.out.print("a>b>c");
            } else {
                System.out.println("a>c>b");
            }
        } else if ((b > a) && (b > c)) {
            if (a > c) {
                System.out.print("b>a>c");
            } else {
                System.out.println("b>c>a");
            }
        } else {
            if (a > b) {
                System.out.println("c>a>b");
            } else {
                System.out.println("c>b>a");
            }
        }
    }
}







