import java.awt.desktop.SystemSleepEvent;

public class Main {
    public static void main(String[] args) {
        int sayi = 20;
        if (sayi<20){
            System.out.println("Sayı 20den küçüktür.");
        }
        if(sayi<15){
            System.out.println("Sayı 15ten küçüktür.");
        }
        else if(sayi == 20){
            System.out.println("Sayı 20 ye eşittir.");
        }

        else{
            System.out.println("Sayı 20 den büyüktür.");
        }



    }
}