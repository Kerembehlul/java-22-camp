public class Main {
    public static void main(String[] args) {
        String harf ="e";
        String kalınSesliharfler ="a,ı,o,u,A,I,O,U";
        String inceSesliHarfler ="e,i,ö,ü,İ,Ö,E,Ü";

        if(harf==","){
            System.out.println("Bu harf değil");
            return;
        }
        if(kalınSesliharfler.contains(harf)){
            System.out.println("Bu harf kalın sesli harftir.");

        }else{
            System.out.println("Bu harf ince sesli harftir.");
        }



    }
}