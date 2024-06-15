package Java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        r = input.nextInt();
        double area = pi * r * r;
        double  environment = 2 * pi * r;

        System.out.println("The area of the circle is " + area);
        System.out.println("The environment of the circle is " + environment);
    }
}
