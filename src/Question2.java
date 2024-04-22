// Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız.
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String customerPassword = "12345";
        boolean passwordSuccessful = false;
        int attemptCount = 0;

        /*while(!passwordSuccessful) {
            attemptCount++;
            System.out.println("Hesap sifrenizi giriniz:");
            String typedPassword = scanner.next();

            if(customerPassword.contentEquals(typedPassword)) {
                passwordSuccessful = true;
                System.out.println("Sisteme basarili giris yaptiniz!");
            }
            else
            {System.out.println("Sifreniz eslesmiyor. Tekrar deneyin.\n  ");}
        }*/

      do {
            attemptCount++;
            System.out.println("Hesap sifrenizi giriniz:");
            String typedPassword = scanner.next();

            if (customerPassword.equals(typedPassword)) {
                passwordSuccessful = true;
                System.out.println("Sisteme basarılı giris yaptiniz!");
            } else {
                System.out.println("Sifreniz eslesmiyor. Tekrar deneyin.");
                passwordSuccessful = false;
            }
        } while (!passwordSuccessful);
        System.out.println("Giriş denemeleri: " + attemptCount);

    }
}

/*
while döngüsü:
Koşul döngü gövdesinden önce kontrol edilir. Yani, döngü gövdesi çalışmadan önce koşul kontrol edilir.eğer koşul başlangıçta false ise, döngü hiçbir zaman çalışmaz.

do-while döngüsü:
Koşul döngü gövdesinden sonra kontrol edilir. Yani, döngü gövdesi en az bir kez çalıştırılır, ardından koşul kontrol edilir.
*/
