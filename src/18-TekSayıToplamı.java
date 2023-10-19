import java.util.Scanner;

public class TekSayıToplamı {
    public static void main(String[] args) {
        /*
        Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

        Ödev
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı
        yazıyoruz.
         */
        Scanner input = new Scanner(System.in);
        int sayi;
        int total = 0;
        /*
        do {
            sayi = input.nextInt();
            if (sayi % 2 != 0) {
                //System.out.println("sayı: " + sayi);
                total += sayi;
            }
        } while (sayi > 0);
        */
        do {
            sayi = input.nextInt();
            if (sayi % 4 == 0) {
                //System.out.println("sayı: " + sayi);
                total += sayi;
            }
        } while (sayi % 2 == 0);
        System.out.println("Girilen değerlerden tek sayıları toplamı: " + total);
    }
}
