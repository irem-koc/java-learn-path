import java.util.Scanner;

public class averageGrade {
    public static void main(String[] args) {
        /*
        Not Ortalaması Hesaplayan Program
        Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve
        ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        Ödev
        Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana
        "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

        Not : If ve Else kullanılmayacak...
         */
        Scanner input = new Scanner(System.in);
        int math, physics, chemistry, turkish, history, music;
        System.out.println("Enter your math grade please: ");
        math = input.nextInt();
        System.out.println("Enter your physics grade please: ");
        physics = input.nextInt();
        System.out.println("Enter your chemistry grade please: ");
        chemistry = input.nextInt();
        System.out.println("Enter your turkish grade please: ");
        turkish = input.nextInt();
        System.out.println("Enter your history grade please: ");
        history = input.nextInt();
        System.out.println("Enter your music grade please: ");
        music = input.nextInt();
        double average_grade = (math + physics + chemistry + turkish + history + music) / 6;
        System.out.println("Your average is: " + average_grade);
    }
}
