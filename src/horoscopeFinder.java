import java.util.Scanner;

public class horoscopeFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Doğduğunuz gün: ");
        int day = input.nextInt();
        System.out.println("Doğduğunuz ay: ");
        String month = input.next();
        String horoscope = "";
        if (month.equals("Ocak")) {
            if (day < 22) {
                horoscope = "Oğlak";
            } else {
                horoscope = "Kova";
            }
        } else if (month.equals("Şubat")) {
            if (day < 22) {
                horoscope = "Kova";
            } else {
                horoscope = "Balık";
            }
        } else if (month.equals("Mart")) {
            if (day < 22) {
                horoscope = "Balık";
            } else {
                horoscope = "Koç";
            }
        } else if (month.equals("Nisan")) {
            if (day < 22) {
                horoscope = "Koç";
            } else {
                horoscope = "Boğa";
            }
        } else if (month.equals("Mayıs")) {
            if (day < 22) {
                horoscope = "Boğa";
            } else {
                horoscope = "İkizler";
            }
        } else if (month.equals("Haziran")) {
            if (day < 22) {
                horoscope = "İkizler";
            } else {
                horoscope = "Yengeç";
            }
        } else if (month.equals("Temmuz")) {
            if (day < 22) {
                horoscope = "Yengeç";
            } else {
                horoscope = "Aslan";
            }
        } else if (month.equals("Ağustos")) {
            if (day < 22) {
                horoscope = "Aslan";
            } else {
                horoscope = "Başak";
            }
        } else if (month.equals("Eylül")) {
            if (day < 22) {
                horoscope = "Başak";
            } else {
                horoscope = "Terazi";
            }
        } else if (month.equals("Ekim")) {
            if (day < 22) {
                horoscope = "Terazi";
            } else {
                horoscope = "Akrep";
            }
        } else if (month.equals("Kasım")) {
            if (day < 22) {
                horoscope = "Akrep";
            } else {
                horoscope = "Yay";
            }
        } else if (month.equals("Aralık")) {
            if (day < 22) {
                horoscope = "Yay";
            } else {
                horoscope = "Oğlak";
            }
        }
        System.out.println("Burcunuz: " + horoscope);
        /*Koç Burcu : 21 Mart - 20 Nisan
        Boğa Burcu : 21 Nisan - 21 Mayıs
        İkizler Burcu : 22 Mayıs - 22 Haziran
        Yengeç Burcu : 23 Haziran - 22 Temmuz
        Aslan Burcu : 23 Temmuz - 22 Ağustos
        Başak Burcu : 23 Ağustos - 22 Eylül
        Terazi Burcu : 23 Eylül - 22 Ekim
        Akrep Burcu : 23 Ekim - 21 Kasım
        Yay Burcu : 22 Kasım - 21 Aralık
        Oğlak Burcu : 22 Aralık - 21 Ocak
        Kova Burcu : 22 Ocak - 19 Şubat
        Balık Burcu : 20 Şubat - 20 Mart
        Ödev
        Aynı örneği switch-case kullanmadan yapınız.*/
    }
}
