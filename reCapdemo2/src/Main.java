public class Main {
    public static void main(String[] args) {
        double[] myList = {1,2,3,4,9,6,};
        double total = 0;
        double maks= myList[0];

        for(double number:myList){
            if(maks<number){
                maks = number;

            }
            total = total + number;
            System.out.println(number);


        }
         System.out.println("Toplam =" + total);
         System.out.println("En büyük=" + maks);








    }
}