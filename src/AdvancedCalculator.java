import java.util.Scanner;

public class AdvancedCalculator {
    public static void plus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int adet = input.nextInt();
        int result = 0;
        for (int i = 0; i < adet; i++) {
            System.out.print("Sayı giriniz: ");
            int sayi = input.nextInt();
            result += sayi;
        }
        System.out.println("Sonuç : " + result);

    }

    public static void minus() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int adet = input.nextInt();
        int result = 0;
        for (int i = 0; i < adet; i++) {
            System.out.print("Sayı giriniz: ");
            int sayi = input.nextInt();
            if (i == 0)
                result += sayi;
            else {
                result -= sayi;
            }
        }
        System.out.println("Sonuç : " + result);
    }

    public static void times() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int adet = input.nextInt();
        int result = 1;
        for (int i = 0; i < adet; i++) {
            System.out.print("Sayı giriniz: ");
            int sayi = input.nextInt();
            result *= sayi;
        }
        System.out.println("Sonuç : " + result);
    }

    public static void divider() {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int adet = input.nextInt();
        int result = 0;
        for (int i = 0; i < adet; i++) {
            System.out.print("Sayı giriniz: ");
            int sayi = input.nextInt();
            if (sayi == 0) {
                System.out.println("Bir sayı 0'a bölünemez.");
            }
            if (i == 0) {
                result = sayi;
            } else {
                result /= sayi;
            }
        }
        System.out.println("Sonuç : " + result);
    }

    public static void power() {
        Scanner input = new Scanner(System.in);
        System.out.print("Taban sayıyı giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üs sayıyı giriniz: ");
        int us = input.nextInt();
        double result = Math.pow(taban, us);

        System.out.println("Sonuç : " + result);
    }

    public static void factorial() {
        Scanner input = new Scanner(System.in);
        System.out.print("Faktöriyeli alınacak sayıyı giriniz: ");
        int sayi = input.nextInt();
        int result = 1;
        for (int i = 1; i < sayi + 1; i++) {
            result *= i;
        }
        System.out.println("Sonuç : " + result);
    }

    public static void mod() {
        Scanner input = new Scanner(System.in);
        System.out.print("Modu alınacak sayıyı giriniz: ");
        int sayi = input.nextInt();
        System.out.print("Mod sayısını giriniz: ");
        int mod = input.nextInt();

        int result = sayi % mod;
        System.out.println("Sonuç : " + result);
    }

    public static void rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        int kisa = input.nextInt();
        System.out.print("Dikdörtgenin uzun kenarını giriniz: ");
        int uzun = input.nextInt();
        int alan = kisa * uzun;
        int cevre = 2 * (kisa + uzun);
        System.out.println("Dikdörtgenin alanı: " + alan);
        System.out.println("Dikdörtgenin çevresi: " + cevre);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        String menu =
                "Hesap makinesinin fonksiyonları :"
                        + "\n1- Toplama İşlemi"
                        + "\n2- Çıkarma İşlemi"
                        + "\n3- Çarpma İşlemi"
                        + "\n4- Bölme işlemi"
                        + "\n5- Üslü Sayı Hesaplama"
                        + "\n6- Faktoriyel Hesaplama"
                        + "\n7- Mod Alma"
                        + "\n8- Dikdörtgen Alan ve Çevre Hesabı";
        do {
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divider();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Lütfen geçerli bir seçenek giriniz.");
            }

        } while (select != 0);

        /*
        Gelişmiş Hesap Makinesi
        Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.

        Hesap makinesinin fonksiyonları :

        1- Toplama İşlemi
        2- Çıkarma İşlemi
        3- Çarpma İşlemi
        4- Bölme işlemi
        5- Üslü Sayı Hesaplama
        6- Faktoriyel Hesaplama
        7- Mod Alma
        8- Dikdörtgen Alan ve Çevre Hesabı
        0- Çıkış
         */
    }
}
