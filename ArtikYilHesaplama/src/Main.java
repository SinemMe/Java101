import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yil giriniz: ");
        int x = input.nextInt();

        //Artik yil tam bölünürse dogrudur, ama tam bölünemezse artik yil degildir.

        if ((x % 4 == 0 && x % 100 != 0) || ( x % 400 == 0)) {
                System.out.print(x + "bir artik yildir");
                } else {
                    System.out.print(x + " Artik Yil degildir.");
                }
            }
        }

