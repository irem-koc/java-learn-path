import java.sql.SQLOutput;
import java.util.Scanner;

public class HackerranProblems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç satır? ");
        int line = input.nextInt();
        input.nextLine();
        String all;
        for (int i = 1; i <= line; i++) {
            System.out.println("Enter rakams: ");
            int a, b, n;
            a = Integer.valueOf(input.next());
            b = Integer.valueOf(input.next());
            n = Integer.valueOf(input.next());
            System.out.println(a + "," + b + "," + n);
            int baslangic = a + b;
            System.out.print(baslangic + " ");
            for (int j = 1; j < n; j++) {
                int s_j = baslangic + (int) Math.pow(2, j) * b;
                baslangic = s_j;
                System.out.print(s_j + " ");
            }
        }
    }
}
