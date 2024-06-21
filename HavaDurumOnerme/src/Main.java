import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Sicaklik Giriniz:");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayaka gidebilirsiniz.");
        } else if (heat >= 5 && heat <= 25) {
            if (heat <= 15) {
                System.out.print("Sinemaya gidebilirsiniz.");
            }if (heat >= 10){
                System.out.print("Piknige gidebilirsiniz.");
        }else if (heat >= 25) {
                System.out.print("Yüzmeye gidebilirsiniz.");
            }
        }


    }
}