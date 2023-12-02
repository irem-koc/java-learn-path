import java.util.Scanner;

public class SinifiGecmeKalma {
    public static void main(String[] args) {
        /*
        Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
        Geçme Notu : 55
        Ödev
        Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Math grade:  ");
        int math = input.nextInt();
        math = math >= 0 && math <= 100 ? math : 0;
        System.out.println("Physics grade:  ");
        int physics = input.nextInt();
        physics = physics >= 0 && physics <= 100 ? physics : 0;
        System.out.println("Turkish grade:  ");
        int turkish = input.nextInt();
        turkish = turkish >= 0 && turkish <= 100 ? turkish : 0;
        System.out.println("Chemistry grade:  ");
        int chemistry = input.nextInt();
        chemistry = chemistry >= 0 && chemistry <= 100 ? chemistry : 0;
        System.out.println("Music grade:  ");
        int music = input.nextInt();
        music = music >= 0 && music <= 100 ? music : 0;
        int gecisGrade = 55;
        int average = (math + chemistry + physics + turkish + music) / 5;
        System.out.println("Your average: " + average);

    }
}
