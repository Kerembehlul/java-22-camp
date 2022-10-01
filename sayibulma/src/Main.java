public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1,2,3,4,5,6};
        int aranacak = 9;
        boolean varmi= false;

        for(int sayi : sayilar){
            if(sayi == aranacak){
                varmi=true;
                break;
            }
        }
        if(varmi){
            System.out.println("Sayı var.");
        }else{
            System.out.println("Sayı yok.");
        }


        }

    }
