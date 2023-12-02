import java.util.Scanner;

public class ATMProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        int bakiye = 1500;
        int selection;
        String username, password;
        while (right > 0) {
            System.out.println("Username: ");
            username = input.next();
            System.out.println("Password: ");
            password = input.next();
            if (username.equals("irem123") && password.equals("123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                String islemler = """
                        1-Para yatırma
                        2-Para Çekme
                        3-Bakiye Sorgula
                        4-Çıkış Yap""";
                do {
                    System.out.println(islemler);
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    selection = input.nextInt();
                    if (selection == 1) {
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        bakiye += price;
                        System.out.println("Bakiyeniz : " + bakiye);
                    } else if (selection == 2) {
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        if (price > bakiye) {
                            System.out.println("Bakiye yetersiz.");
                            System.out.println("Bakiyeniz : " + bakiye);
                        } else {
                            bakiye -= price;
                            System.out.println("Bakiyeniz : " + bakiye);

                        }


                    } else if (selection == 3) {
                        System.out.println("Bakiyeniz : " + bakiye);
                    }
                }
                while (selection != 4);
                if (selection == 4) {
                    System.out.println("See you again!");
                    break;
                }


            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
        /*
        ("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
        Ödev
        Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.
         */
    }
}
