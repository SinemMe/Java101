import java.util.Scanner;
import java.io.*;



public class Main {
    public static void main(String[] argh) {

        String number = "";
        String dataType = "";


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) ;
        boolean isByte, isInt, isShort, isLong;

        System.out.println(dataType + "can be fitted in:");
        number = sc.nextLine();
        try {
            long x = sc.nextLong();
            System.out.println(x + " can be fitted in:");

            try {
                byte b = sc.nextByte();
                System.out.println(b + "can be fitted in:");


                try {
                    short s = sc.nextShort();
                    System.out.println(x + "can be fitted in:");

                    try {
                        int n = sc.nextInt();
                        System.out.println(x + "can be fitted in:");
                    } catch (NumberFormatException e) {
                        System.out.println();

                        if ((x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)) {
                            if (x >= -128 && x <= 127) {
                                dataType = "byte";
                                System.out.println("can be fitted in:");
                            } else {
                                isByte = true;
                            }
                            if ((x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)) {
                            } else if (x >= Math.pow(-32, 768) && x <= Math.pow(32, 767)) {
                                dataType = "short";
                                System.out.print("can be fitted in: ");
                            } else {
                                isShort = true;
                            }
                            if ((x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)) {
                            } else if (x >= (-2147483648) && x <= 2147483647) {
                                dataType = "int";
                                System.out.print("can be fitted in: ");
                            } else {
                                isInt = true;
                            }
                            if ((x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE)) {
                            } else if ((x >= (-9223372036854775808L) && x <= 9223372036854775807L)) {
                                dataType = "long";
                                System.out.print("can be fitted in: ");
                            } else {
                                isLong = true;
                            }
                        } else {
                            System.out.println(sc.next() + " can't be fitted anywhere.");
                        }
                        System.out.println("-150 can be fitted in:" + dataType);
                    }
                    System.out.println("150000 can be fitted in:" + dataType);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                System.out.println("1500000000 can be fitted in:" + dataType);
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            }System.out.println("-100000000000000 can be fitted in:" + dataType);
        }finally{
            System.out.println("213333333333333333333333333333333333:" +dataType);
        }
    }
}









