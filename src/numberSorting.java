import java.util.Scanner;

public class numberSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        Ödev
        Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
         */
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();
        System.out.println("Enter third number: ");
        int number3 = input.nextInt();
        if (number1 > number2 && number2 > number3) {
            System.out.println(number1 + ">" + number2 + ">" + number3);
        } else if (number1 > number3 && number3 > number2) {
            System.out.println(number1 + ">" + number3 + ">" + number2);
        } else if (number2 > number1 && number1 > number3) {
            System.out.println(number2 + ">" + number1 + ">" + number3);
        } else if (number2 > number3 && number3 > number1) {
            System.out.println(number2 + ">" + number3 + ">" + number1);
        } else if (number3 > number1 && number1 > number2) {
            System.out.println(number3 + ">" + number1 + ">" + number2);
        } else if (number3 > number2 && number2 > number1) {
            System.out.println(number3 + ">" + number2 + ">" + number1);
        } else if (number1 == number2 && number2 > number3) {
            System.out.println(number1 + ">" + number2 + ">" + number3);
        } else if (number1 == number2 && number2 < number3) {
            System.out.println(number3 + ">" + number2 + ">" + number1);
        } else if (number1 == number3 && number3 > number2) {
            System.out.println(number3 + "=" + number1 + ">" + number2);
        } else if (number1 == number3 && number3 < number2) {
            System.out.println(number2 + ">" + number3 + ">" + number1);
        } else if (number2 == number3 && number3 > number1) {
            System.out.println(number3 + "=" + number2 + ">" + number1);
        } else if (number2 == number3 && number3 < number1) {
            System.out.println(number1 + ">" + number2 + "=" + number3);
        } else {
            System.out.println(number3 + "=" + number2 + "=" + number1);
        }

    }
}
