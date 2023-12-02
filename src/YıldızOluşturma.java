import java.util.Scanner;

public class YıldızOluşturma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int sayi = input.nextInt();
        String yildiz = "*";
        for (int i = 0; i < sayi; i++) {
            String bosluk = " ";
            System.out.print(bosluk.repeat(sayi-1-i));
            System.out.print(yildiz.repeat(2 * i + 1));
            System.out.print(bosluk.repeat(sayi-1-i));
            System.out.println();
        }
        /*
        Java'da döngüler kullanılarak yıldızlar ile üçgen yapıyoruz.

             *
            ***
           *****
          *******
         *********
        ***********

         */
    }
}
