import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        /*System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        int max = list[list.length-1];
        int min = list[0];*/
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Girilen sayı: ");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        Arrays.sort(list);
        int gtenteredValue = 0;
        int ltenteredValue = 0;
        for (int i : list) {
            if (i > sayi) {
                gtenteredValue = i;
                break;
            }
            if (i < sayi) {
                ltenteredValue = i;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + ltenteredValue);
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + gtenteredValue);
        
        /*
        Ödev
        Dizideki Elemanların Max ve Min Değerlerini Bulan Program
        Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı
        bulan programı yazınız.

        Dizi : {15,12,788,1,-1,-778,2,0}
        Girilen Sayı : 5
        Girilen sayıdan küçük en yakın sayı : 2
        Girilen sayıdan büyük en yakın sayı : 12
         */
    }
}
