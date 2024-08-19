import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("1-100´e kadar ASAL sayilar.");
        int s = input.nextInt();


        for (int x = 2; x < 100; x++) {
                int a = 0;
                for (int i = 1; i <= x; i++) {
                    if (x % i == 0)
                        a++;
                }
                        if (a <= 2)

                            System.out.print(x + " ");
                    }
                }
            }



