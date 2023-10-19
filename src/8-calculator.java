import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        /*
        hesap makinesini switch-case kullanarak yapınız.
         */
        int output=0;
        Scanner input = new Scanner(System.in);
        int number_1, number_2;
        System.out.println("Enter first number: ");
        number_1 = input.nextInt();
        System.out.println("Enter second number: ");
        number_2 = input.nextInt();
        String islem;
        System.out.println("1-Add\n2-Difference\n3-Multiply\n4-Division");
        islem = input.next();
        String word="";
        switch (islem) {
            case "1":
                output = number_1 + number_2;
                word = "Addition";
                break;
            case "2":
                output = number_1 - number_2;
                word = "Difference";
                break;
            case "3":
                output = number_1 * number_2;
                word = "Multiplication";
                break;
            case "4":
                output = number_1 / number_2;
                word = "Division";
                break;

            default:
                System.out.println("Validate your input please..");
        }
        System.out.println(word + " isleminin sonucu : " + output);
    }
}
