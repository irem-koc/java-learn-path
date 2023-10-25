import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fibonacci serisinin kaç elemanını hesaplamak istersiniz? ");
        int elemanSayisi = scanner.nextInt();

        int[] fibonacciSerisi = new int[elemanSayisi];
        fibonacciSerisi[0] = 0;
        fibonacciSerisi[1] = 1;

        for (int i = 2; i < elemanSayisi; i++) {
            fibonacciSerisi[i] = fibonacciSerisi[i - 1] + fibonacciSerisi[i - 2];
        }

        System.out.print("Fibonacci Serisi: ");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(fibonacciSerisi[i] + " ");
        }
    }
}

