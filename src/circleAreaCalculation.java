import java.util.Scanner;

public class circleAreaCalculation {
    public static void main(String[] args) {
        /*
        Dairenin Alanını ve Çevresini Hesaplayan Program
        Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

        Alan Formülü : π * r * r;

        Çevre Formülü : 2 * π * r;

        Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

        𝜋 sayısını = 3.14 alınız.

        Formül : (𝜋 * (r*r) * 𝛼) / 360
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıçapı: ");
        int yarıcap = input.nextInt();
        double pi = 3.14;
        double alan = pi * Math.pow(yarıcap, 2);
        double cevre = pi * 2 * yarıcap;
        System.out.println("Alan: " + alan + "\nCevre: " + cevre);
        System.out.println("Merkez açı ölçüsü: ");
        int acı = input.nextInt();
        double dilim = (pi * Math.pow(yarıcap, 2) * acı) / 360;
        System.out.println("Merkez açı ölçüsüsü " + acı + " olan dilimin alanı: " + dilim);
    }
}
