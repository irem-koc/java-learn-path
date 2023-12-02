import java.util.Scanner;

public class HarmonikSeriBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int sayi = input.nextInt();
        double result = 0;
        for (int i = 1; i < sayi+1; i++) {
            result += Math.pow(i, -1);
        }
        System.out.println("Harmonik serisi: " + result);

        /*
        Java ile girilen sayının harmonik serisini bulan program yazacağız.

        Harmonik Seri Formülü :

         */
    }
}
