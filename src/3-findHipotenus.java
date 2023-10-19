import java.util.Scanner;

public class findHipotenus {
    public static void main(String[] args) {
        /*
        Dik Üçgende Hipotenüs Bulan Program
        Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

        Ödev
        Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Formül
        Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

        𝑢 = (a+b+c) / 2

        Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Triangle first edge");
        int first = input.nextInt();
        System.out.println("Triangle second edge");
        int second = input.nextInt();
        double hipo = Math.pow((Math.pow(first, 2) + Math.pow(second, 2)), 0.5);
        System.out.println("Hipotenus: " + hipo);
        double u = (first + second + hipo) / 2;
        double alanSquare = u * (u - first) * (u - second) * (u - hipo);
        double alan = Math.pow(alanSquare, 0.5);
        System.out.println("Alan: " + alan);
    }
}
