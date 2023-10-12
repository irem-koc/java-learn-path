import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        /*
        Manav Kasa Programı
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
        toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
        Örnek Çıktı;

        Armut Kaç Kilo ? :0
        Elma Kaç Kilo ? :1
        Domates Kaç Kilo ? :1
        Muz Kaç Kilo ? :2
        Patlıcan Kaç Kilo ? :3
        Toplam Tutar : 21.68 TL
         */
        Scanner input = new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.00;
        System.out.println("Armut Kaç Kilo ? :");
        int armutKg = input.nextInt();
        System.out.println("Elma Kaç Kilo ? :");
        int elmaKg = input.nextInt();
        System.out.println("Domates Kaç Kilo ? :");
        int domatesKg = input.nextInt();
        System.out.println("Muz Kaç Kilo ? :");
        int muzKg = input.nextInt();
        System.out.println("Patlıcan Kaç Kilo ? :");
        int patlıcanKg = input.nextInt();

        double total = armutKg * armut + patlıcanKg * patlıcan + elmaKg * elma + domatesKg * domates + muz * muzKg;
        System.out.println("Toplam Tutar : " + total + " TL");
    }
}
