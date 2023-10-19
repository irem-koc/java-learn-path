import java.util.Scanner;

public class kdvCalculation {
    public static void main(String[] args) {
        /*KDV Tutarı Hesaplayan Program
        Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

        (Not : KDV tutarını 18% olarak alın)

        KDV'siz Fiyat = 10;

        KDV'li Fiyat = 11.8;

        KDV tutarı = 1.8;

        Ödev
        Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak
        KDV tutarı hesaplayan programı yazınız.
        */
        Scanner input = new Scanner(System.in);
        int price = input.nextInt();
        System.out.println("KDV'siz Fiyat = " + price);
        double kdv_rate = price <= 1000 && price >= 0 ? 0.18 : 0.08;
        double kdv_quantity = kdv_rate * price;
        System.out.println("KDV tutarı = " + (kdv_quantity + price));
        System.out.println("KDV tutarı = " + kdv_quantity);
    }

}
