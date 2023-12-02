import java.util.Scanner;

public class RecursiveFibonacci {
    public static int f(int sayi) {
        int output = 0;
        if (sayi == 1) {
            output = 1;
            return output;
        }
        if (sayi == 2) {
            output = 1;
            return output;
        } else {
            output = f(sayi - 1) + f(sayi - 2);
            return output;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int sayi = input.nextInt();
        int first = 1;
        int second = 1;
        for (int i = 1; i < sayi + 1; i++) {
            // System.out.println("f(" + (i) + ") = " + f(i));
            System.out.print(f(i) + " ");

        }

    }
}
