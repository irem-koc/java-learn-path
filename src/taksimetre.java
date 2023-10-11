import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        /*
        Taksimetre Programı
        Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

        Taksimetre KM başına 2.20 TL tutmaktadır.
        Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç km gidildi? ");
        double km = input.nextDouble();
        double perKm = 2.20;
        int opening = 10;
        double price = perKm * km < 10 ? 10 : perKm * km;
        System.out.println("Ücret: " + (price + 10));
    }
}
