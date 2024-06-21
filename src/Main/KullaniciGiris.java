import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword, select;

        Scanner inp = new Scanner(System.in);
        //Eger Sifre yanlis ise newPassword a giriniz.

        System.out.print("Kullanici Adiniz : ");
        userName = inp.nextLine();

        System.out.print("Sifreniz :");
        password = inp.nextLine();


        if (userName.equals("patika") && password.equals("Java123")) {
            System.out.println("Giris Yaptiniz !");
        } else {
            System.out.println("Bilgileriniz Yanlis !");
        } if (userName.equals("patika") || password.equals("Java123")) {
            System.out.println("Sifrenizi Degistirmek icin 'Evet' yaziniz. Degistirmek istemiyorsaniz 'Hayir' Yaziniz.");
            System.out.println("Seciminiz: ");
        } select = inp.nextLine();{
        } if (select.equals("Hayir") || select.equals("Evet")) {
            System.out.print("");
        } newPassword = inp.nextLine();
        {
        } if (newPassword.equals("Java123")) {
            System.out.println("Sifre olusturulamadi, lüften baska sifre girniz.");
        } else {
            System.out.print("Program bitti.");
        }