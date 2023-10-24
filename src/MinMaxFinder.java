import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz: ");
        int sayi = input.nextInt();
        int max = 0;
        int min = 0;
        for (int i = 0; i < sayi; i++) {
            System.out.println((i + 1) + ". Sayıyı giriniz: ");
            int sayı_new = input.nextInt();

            if (sayı_new > max) {
                max = sayı_new;
            }
            if (sayı_new < min) {
                min = sayı_new;
            }
        }
        System.out.println("En büyük sayı: " + max + "\nEn küçük sayı: " + min);
        /*
        Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

        Senaryo
        Kaç tane sayı gireceksiniz: 4
        1. Sayıyı giriniz: 16
        2. Sayıyı giriniz: -22
        3. Sayıyı giriniz: -15
        4. Sayıyı giriniz: 100
        En büyük sayı: 100
        En küçük sayı: -22
         */
    }
}
