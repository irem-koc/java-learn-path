import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        /*
        Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu
        şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
        "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu"
        yazan programı yazınız.
         */
        Scanner input = new Scanner(System.in);
        String defaultPassword = "abc123";
        String defaultUser = "guest";
        System.out.println("Enter your username: ");
        String user = input.next();
        System.out.println("Enter your password: ");
        String password = input.next();
        if (defaultUser.equals(user) && defaultPassword.equals(password)) {
            System.out.println("Congratulations you signed in!!");

        } else {
            System.out.println("Do you want to reset your password? y/n ");
            String answer = input.next();
            if (answer.equals("y")) {
                System.out.println("Enter your password: ");
                String passwordNew = input.next();
                if (passwordNew.equals(defaultPassword)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    System.out.println("Enter again your password: ");
                    passwordNew = input.next();
                } else {
                    System.out.println("Şifre oluşturuldu");
                    defaultPassword = passwordNew;
                }
            }
        }
    }
}
