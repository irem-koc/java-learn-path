import java.util.Scanner;

public class RecursiveIsPrime {
    public static  boolean isPrime(int sayi, int bolen){
        if (sayi%bolen==0){
            return false;
        }
        if (sayi%bolen!=0){
           return true;
        }
        return isPrime(sayi, bolen + 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int sayi =input.nextInt();
        if (sayi<2){
            System.out.println(sayi + " sayısı ASAL değildir !");
        }
        if (sayi==2){
            System.out.println(sayi + " sayısı ASALDIR !");
        }
        else{
            if (isPrime(sayi, 2)){
                System.out.println(sayi + " sayısı ASALDIR !");
            }else{
                System.out.println(sayi + " sayısı ASAL değildir !");
            }
        }
        /*
        Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının
        "Asal" sayı olup olmadığını bulan programı yazın.

        Senaryo
        Sayı Giriniz : 22
        22 sayısı ASAL değildir !


        Sayı Giriniz : 2
        2 sayısı ASALDIR !


        Sayı Giriniz : 39
        39 sayısı ASAL değildir !


        Sayı Giriniz : 17
        17 sayısı ASALDIR !
         */
    }
}
