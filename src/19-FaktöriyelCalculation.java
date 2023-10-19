import java.util.Scanner;

public class FaktöriyelCalculation {
    static int faktoriyel(int n) {
        int result = 1;

        int i = 1;
        do {
            result *= i;
            i++;
        } while (i <= n);
        return (result);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("N için: ");
        int n = input.nextInt();
        System.out.println("r için: ");
        int r = input.nextInt();
        int n_r = faktoriyel((n - r));
        n = faktoriyel(n);
        r = faktoriyel(r);
        double c_n_r = n / (r * n_r);
        System.out.println("N’in r’li kombinasyonu: " + c_n_r);
        System.out.println(n + " " + r + " " + n_r);
        /*
        Java ile faktöriyel hesaplayan program yazıyoruz.

        Ödev
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
        n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde
        gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
        */
    }
}
