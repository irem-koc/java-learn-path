import java.util.Scanner;

public class CiftSayiToplam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int sayi = input.nextInt();
        for (int i = 0; i < sayi; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " çift sayıdır.");
            }
        }
        int total = 0;
        int count = 0;
        for (int i = 0; i < sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                count = count + 1;
                total += i;
            }
        }

        System.out.println(total + " " + count);
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması " + (total / count));
        /*
        Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

        Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen
         sayıların ortalamasını hesaplayan programı yazınız.
         */

    }
}
