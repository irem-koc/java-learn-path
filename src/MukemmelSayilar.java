import java.util.Scanner;

public class MukemmelSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int result = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                result += i;
            }
        }
        if (result == sayi) {
            System.out.println(sayi + " Mükemmel sayıdır");
        } else {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        }
        /*
        Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

        Mükemmel Sayı Nedir ?
        Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.

        Senaryolar
        Bir sayı giriniz: 28
        28 Mükemmel sayıdır
        Bir sayı giriniz: 1
        1 Mükemmel sayı değildir.
        Bir sayı giriniz: 496
        496 Mükemmel sayıdır
         */
    }
}
