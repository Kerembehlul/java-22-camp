
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        int sayi;
        System.out.print("Bir tam sayı giriniz");
        sayi=giris.nextInt();

        if(sayi % 2 == 0){
            System.out.println("Girdiğiniz sayı bir çift sayıdır.");
        }else{
            System.out.println("Girdiğiniz sayı bir tek sayıdır .");
        }


    }
}