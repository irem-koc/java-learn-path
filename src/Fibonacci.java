import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int eleman = input.nextInt();
        int baslangic = 0;
        int second = 1;
        System.out.print(baslangic + " " + second);
        for (int i = 2; i < eleman; i++) {
            int sonraki = baslangic + second;
            System.out.print(" " + sonraki);
            baslangic = second;
            second = sonraki;
        }

        /*
        Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin
        eleman sayısını kullanıcıdan alın.

        Fibonacci Serisi Nedir ?
        Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı
        dizisidir. Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında
        altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde
        altın orana gittikçe yaklaşan bir dizi elde edilir.

        Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla
        toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk
        on sayısı şu şekildedir:

        9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34

         0 + 1 = 1

         1 + 1 = 2

         1 + 2 = 3

         2 + 3 = 5

         3 + 5 = 8

         5 + 8 = 13

         13 + 8 = 21

         21 + 8 = 34
         */
    }
}
