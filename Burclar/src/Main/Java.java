package Main;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        int n;
        String number = "";
        boolean isError = false;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        n = sc.nextInt();


        if (n >= 2 && n <= 5) {
            number = "weird";
        }else if (n >= 2 && n <= 5) {
            number = "Not weird";
        } else {
            isError = true;
        }
        if (n >= 6 && n <= 20) {
            number = "weird";
        } else {
            isError = true;
        }
        if (n <= 20) {
            number = "weird";
        } else {
            isError = true;
        }
        if (number == "weird") {
            System.out.println("Weird");
        } else if (isError) {
            System.out.println("Not weird.");
        } else {
            System.out.println("Please start again.");
        }

        }
    }


