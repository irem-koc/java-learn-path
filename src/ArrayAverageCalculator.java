import java.util.Arrays;

public class ArrayAverageCalculator {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = 0;
        double harmonik_seri = 0;
        for (int i : numbers) {
            result += i;
            harmonik_seri += 1 / i;
        }
        double average = result / numbers.length;
        System.out.println(Arrays.toString(numbers) + " Ortalamanız: " + average);
        double averageHarmonic = numbers.length / harmonik_seri;
        System.out.println(Arrays.toString(numbers) + " Harmonik Ortalamanız: " + averageHarmonic);
        /*
        Dizideki Elemanların Ortalamasını Hesaplayan Program
public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println(sum / numbers.length);
    }
}
        Ödev
        Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

        Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

        Harmonik Seri Formülü :
         */
    }
}
