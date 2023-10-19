import java.util.Scanner;

public class ArmstrongSayıBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int sayi = input.nextInt();
        String sayı_str = String.valueOf(sayi);
        int result = 0;
        int basamakSayilariToplam = 0;
        for (int i = 0; i < sayı_str.length(); i++) {
            char character = sayı_str.charAt(i);
            int rakam = Character.getNumericValue(character);
            result += Math.pow(rakam, sayı_str.length());
            basamakSayilariToplam += rakam;
        }
        if (sayi == result) {
            System.out.println(sayi + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(sayi + " sayısı bir Armstrong sayısı değildir.");
        }
        System.out.println("Basamak sayıları toplamı: " + basamakSayilariToplam);
        /*
        Java döngüler ile sayının armstrong sayı olup olmadığını bulan programı yazıyoruz.

        Armstrong Sayı Nedir ?
        N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse,
        böyle sayılara Armstrong sayı denir.

        Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
        Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

        1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit
        olmadığı için armstrong sayı olmaz.

        1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

        54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
        Ödev
        *Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.

        *Örnek : 1643 = 1 + 6 + 4 + 3 = 14
         */
    }
}
