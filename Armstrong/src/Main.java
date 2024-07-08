import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int n = input.nextInt();

        int tempNumber = n;
        int stepNumber = 0;
        int stepValue;
        int stepPow = 1;
        int result = 0;

        while (tempNumber != 0) {
            tempNumber /= 10;
            stepNumber++;
        }
        tempNumber = n;
        while (tempNumber != 0) {
            stepValue = tempNumber % 10;
            // 1* 1*1* = 1^4
            stepPow = 1;
            for (int i = 1; i <= stepNumber; i++) {
                stepPow *= stepValue;
            }
            result += stepPow;
            tempNumber /= 10;

        } if (result == n) {
                System.out.println(n + " sayisi bir Armstrong sayisidir.");

            } else {
                System.out.println(n + " bir armstrong sayisi degildir.");
            }
        }
    }