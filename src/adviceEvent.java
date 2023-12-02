import java.util.Scanner;

public class adviceEvent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Koşullar :

        Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
        Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
        Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
        Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
        Ödev
        Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları
        bulunuz.
         */
        System.out.println("Sıcaklık? ");
        int degree = input.nextInt();
        String advice = "";
        if (degree > 25) {
            advice = "Yüzme";
        } else if (degree > 15) {
            advice = "Piknik";
        } else if (degree > 5) {
            advice = "Sinema";
        } else if (degree <= 5) {
            advice = "Kayak";
        }
        System.out.println(advice + " öneriliyor..");
    }
}
