import java.util.Scanner;

public class KüçükKuvvetleriniBulanProgram {
    public static void main(String[] args) {
        /*
        Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı
        yazıyoruz.

        Ödev
        Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran
        programı yazıyoruz.
         */
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int i = 0;
        int result = (int) (Math.log(sayi) / Math.log(2));
        /*while (i <= result) {
            System.out.println("hi: " + Math.pow(2, i));
            i++;
        }*/
        //4 ve 5 için
        int result_new = (int) (Math.log(sayi) / Math.log(4));
        /*while (i <= result_new) {
            System.out.println("hi_4: " + Math.pow(4, i));
            i++;
        }*/
        int result_n = (int) (Math.log(sayi) / Math.log(5));
        while (i <= result_n) {
            System.out.println("hi_5: " + Math.pow(5, i));
            i++;
        }
    }
}
