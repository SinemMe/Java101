import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("n1 sayisini giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 sayisini giriniz: ");
        int n2 = input.nextInt();

        int ekok;
        int ebob = 1;
        int k = 1;
        int i = 1;

        if (n1 < n2) {
            while (k <= n1) {
                if (n1 % k == 0 && n2 % k == 0) {
                    ebob = k;
                }
                k++;
            }
            System.out.println("EBOB :" + ebob);
        } else {
            while (i < n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
            System.out.println("EBOB: " + ebob);
        }
        ekok = (n1 * n2) / ebob;
        System.out.println("EKOK :" + ekok);
    }


                /*
                int ebob = 1;
                for (int k = n1; k>= 1; k--) {
                if ( 1 % n1 == 0 && 1% n2 == 0) {
                ebob = k;
                break;

                for (int i = 1; i <= (n1 * n2); i++)
                if (i% n1 == 0 && i% n2 == 0) {
                System.out.println(i);
                break;
                }
                } System.out.println((n1 * n2) / ebob);
                 */
            }

