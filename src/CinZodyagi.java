import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        /*
        Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.

        Çin Zodyağı nedir?

        4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç
        ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde)
        sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

        Çin Zodyağı nasıl hesaplanır?

        Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

        Doğum Tarihi %12 = 0 ➜ Maymun

        Doğum Tarihi %12 = 1 ➜ Horoz

        Doğum Tarihi %12 = 2 ➜ Köpek

        Doğum Tarihi %12 = 3 ➜ Domuz

        Doğum Tarihi %12 = 4 ➜ Fare

        Doğum Tarihi %12 = 5 ➜ Öküz

        Doğum Tarihi %12 = 6 ➜ Kaplan

        Doğum Tarihi %12 = 7 ➜ Tavşan

        Doğum Tarihi %12 = 8 ➜ Ejderha

        Doğum Tarihi %12 = 9 ➜ Yılan

        Doğum Tarihi %12 = 10 ➜ At

        Doğum Tarihi %12 = 11 ➜ Koyun

        Senaryo

        Doğum Yılınızı Giriniz : 1990
        Çin Zodyağı Burcunuz : At
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz : ");
        int year = input.nextInt();
        String horoscope = "";
        if (year % 12 == 0) {
            horoscope = "Maymun";
        } else if (year % 12 == 1) {
            horoscope = "Horoz";
        } else if (year % 12 == 2) {
            horoscope = "Köpek";
        } else if (year % 12 == 3) {
            horoscope = "Domuz";
        } else if (year % 12 == 4) {
            horoscope = "Fare";
        } else if (year % 12 == 5) {
            horoscope = "Öküz";
        } else if (year % 12 == 6) {
            horoscope = "Kaplan";
        } else if (year % 12 == 7) {
            horoscope = "Tavşan";
        } else if (year % 12 == 8) {
            horoscope = "Ejderha";
        } else if (year % 12 == 9) {
            horoscope = "Yılan";
        } else if (year % 12 == 10) {
            horoscope = "At";
        } else if (year % 12 == 11) {
            horoscope = "Koyun";
        }
        System.out.println("Çin Zodyağı Burcunuz : " + horoscope);
    }
}
