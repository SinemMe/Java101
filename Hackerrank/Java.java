import java.util.Scanner;
import java.io.*;


public class Main {
    public static void main(String[] argh) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) ;

        String number = "";
        String dataType = "";

        System.out.println("-150 can be fitted in?");

        boolean isByte, isInt, isShort, isLong;

        try {
        } catch (NumberFormatException e) {


            long x = sc.nextLong();
            System.out.println(x + " can be fitted in:");

            {
                System.out.println(x + "can be fitted in:");
                byte b = sc.nextByte();

                {
                    short s = sc.nextShort();
                    System.out.println(x + "can be fitted in:");

                    {
                        int n = sc.nextInt();
                        System.out.println(x + "can be fitted in:");

                        System.out.println();

                        if ((x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)) {
                            if (x >= -128 && x <= 127) {
                                dataType = "byte";
                                System.out.println("can be fitted in:" );
                            } else {
                                isByte = true;
                            }
                            if ((x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)) {
                            } if (x >= Math.pow(-32, 768) && x <= Math.pow(32, 767)) {
                                dataType = "short";
                            } else {
                                isShort = true;
                            }
                            if ((x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)) {
                            } if (x >= (-2147483648) && x <= 2147483647) {
                                dataType = "int";
                            } else {
                                isInt = true;
                            }
                            if ((x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)) {
                            } if ((x >= (-9223372036854775808L) && x <= 9223372036854775807L)) {
                                dataType = "long";
                            } else {
                                isLong = true;
                            }
                            if ((x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)) {
                                System.out.println(x + " can be fitted in:");
                            } else if((x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)) {
                                {
                            System.out.println(sc.next() + " can't be fitted anywhere.");
                        }
                    }
                }
            }
        }
    }
}

