import java.util.Scanner;

public class ÜslüSayıHesaplama {
    public static void main(String[] args) {
        /*
        Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.

        Ödev
        Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü"
        kullanarak yapınız.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı: ");
        int base = input.nextInt();
        System.out.println("Üs: ");
        int power = input.nextInt();
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        System.out.println(base + "^" + power + "= " + result);
    }
}
