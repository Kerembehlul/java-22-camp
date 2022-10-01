

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        int number;
        System.out.print("Bir tam sayı giriniz");
        number = giris.nextInt();

        if (number == 2) {
            System.out.println("Çift sayıdır");
            return;
        }
        if (number == 1) {
            System.out.println("Tek sayıdır");
            return;
        }
        for (int i = 2; i < number; i = 2) {
            if (number % i == 0) {
                System.out.println("Sayı çiftir.");
                return;
            } else {
                System.out.println("Sayı tektir.");
                return;
            }


        }
        for (int j = 2; j > number; j = 2) {
            if (number % j == 0) {
                System.out.println("Sayı çiftir.");
                return;
            } else {
                System.out.println("Sayı tektir.");
                return;
            }


        }


    }
}












