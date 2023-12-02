import java.util.Scanner;

public class RecursivePower {
    public static int power(int base, int exponent) {
        int output = 0;
        if (exponent == 0) {
            output = 1;
            return output;
        } else {
            output = base * power(base, exponent - 1);
            return output;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a base number: ");
        int base = input.nextInt();
        System.out.println("Enter an exponent number: ");
        int exponent = input.nextInt();
        System.out.println("Result: " + power(base, exponent));
        /*
        Recursive Metotlar ile Üslü Sayı Hesaplama
        Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

        Senaryo

        Taban değeri giriniz :2 Üs değerini giriniz : 0
        Sonuç : 1
        Taban değeri giriniz : 2
        Üs değerini giriniz : 3
        Sonuç : 8
        Taban değeri giriniz : 5
        Üs değerini giriniz : 3
        Sonuç : 125
         */
    }
}
