import java.util.Scanner;

public class PalindromeSayi {
    public static String isPalindrome(int sayi) {
        int reverse = 0;
        int same_sayi = sayi;
        while (same_sayi != 0) {
            int remainder = same_sayi % 10;
            reverse = reverse * 10 + remainder;
            same_sayi = same_sayi / 10;
        }
        if (reverse == same_sayi) {
            return (sayi + " bir palindrom sayıdır." );
        } else {
            return (sayi + " bir palindrom sayı değildir.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(isPalindrome(10));
        /*
        Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

        Palindrom Sayı Nedir ?
        Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

        Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
         */
    }
}
