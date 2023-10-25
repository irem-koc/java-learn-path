public class AsalSayılar {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 1; j < i; j++) {
                if (j == 1) {
                    continue;
                }
                if (i % j == 0) {
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
            if (isPrime) {
                System.out.println(i + " Asal sayıdır.");
            }
        }
    }
}
