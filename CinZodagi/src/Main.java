import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        int Year = input.nextInt();
        String zodiac = "";

        // Yilin 12'ye bölümünden kalan degeri hesapla
        int index;

        if (Year > 0) {
            index = Year % 12;

                if (index == 0) {
                    zodiac = "Monkey";
                }else if (index == 1) {
                zodiac = "Cockerel";
                    } else if (index == 2) {
                    zodiac = "Dog";
                        } else if (index == 3) {
                        zodiac = "Pig";
                            } else if (index == 4) {
                            zodiac = "Mouse";
                                } else if (index == 5) {
                                zodiac = "Ox";
                                    } else if (index == 6) {
                                    zodiac = "Tiger";
                                        } else if (index == 7) {
                                        zodiac = "Rabbit";
                                            } else if (index == 8) {
                                            zodiac = "Dragon";
                                                } else if (index == 9) {
                                                zodiac = "Snake";
                                                    } else if (index == 10) {
                                                    zodiac = "Horse";
                                                        } else if (index == 11) {
                                                        zodiac = "Sheep";
                                                     }
                                            System.out.print("Your zodiac is: "+ zodiac);
                                        } else {
                                        System.out.print("Hatali giris yaptiniz. Tekrar deneyiniz");
            }
        }
    }








