import java.util.Scanner;

public class bodyMassIndex {
    public static void main(String[] args) {
        /*
        Vücut Kitle İndeksi Hesaplama
    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
    Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Formül
    Kilo (kg) / Boy(m) * Boy(m)

    Çıktısı
    Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
    Lütfen kilonuzu giriniz : 105
    Vücut Kitle İndeksiniz : 35.49215792320173
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your height in the m format: ");
        double height = input.nextDouble();
        System.out.println("Please enter your weight: ");
        int weight = input.nextInt();
        double index = weight / Math.pow(height, 2);
        System.out.println("Your BMI: " + index);
    }
}
