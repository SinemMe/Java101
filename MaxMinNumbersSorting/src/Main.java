import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n: " );
        int number = input.nextInt();
        int[] list = new int[number];
        int value;

        System.out.println("Dizinin elemanlarini giriniz: ");

        for (int j = 0; j < number; j++){
            System.out.print((j + 1) + " . Elemani giriniz: ");
            value = input.nextInt();
            list[j] = value;
        }
        System.out.print("Siralama: ");
        Arrays.sort(list);
        System.out.print(Arrays.toString(list));
    }
}