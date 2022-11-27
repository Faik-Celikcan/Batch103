package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismini giriniz...");
        String ayIsmi = input.next();

        switch (ayIsmi) {
            case "ocak":
                System.out.println("Ocak");
            case "şubat":
                System.out.println("Şubat");
            case "mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayıs":
                System.out.println("Mayıs");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "agustos":
                System.out.println("Agustos");
            case "eylül":
                System.out.println("Eylül");
            case "ekim":
                System.out.println("Ekim");
            case "kasım":
                System.out.println("Kasım");
            case "aralık":
                System.out.println("Aralık");
        }
    }
}
