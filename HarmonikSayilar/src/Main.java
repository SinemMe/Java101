import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an n number: ");
        int n = input.nextInt();
        double result = 0.0;

        for (int x = 1; x <= n; x++){
            result += (1/x);
        } System.out.println(result);

    }
}