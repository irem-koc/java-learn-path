import java.util.Scanner;

public class PatternRecursive {
    private static void recursiveIslem(int n) {
        System.out.print(n + " ");

        if (n <= 0) {
            if (n == 0) {
                // Eğer n 0 ise, işlemi bitir
                System.out.println();
            } else {
                // Eğer n negatifse, 5 ekleyerek işlemi devam ettir
                recursiveIslem(n + 5);
            }
        } else {
            // Negatif olana kadar 5 çıkararak işlemi devam ettir
            recursiveIslem(n - 5);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N Sayısı: ");
        int n = scanner.nextInt();

        recursiveIslem(n);
        /*
        Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

        Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. Her çıkarma işlemi sırasında
        ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son
        değerini ekrana yazdırın.

        Senaryolar
        N Sayısı : 16
        Çıktısı : 16 11 6 1 -4 1 6 11 16


        N Sayısı : 10
        Çıktısı : 10 5 0 5 10


        N Sayısı : 25
        Çıktısı : 25 20 15 10 5 0 5 10 15 20 25


        N Sayısı : 5
        Çıktısı : 5 0 5
         */
    }
}
