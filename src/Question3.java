/*Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen ve
doğru tahmin edene kadar devam eden bir program yazınız.
(üWhile döngüs ile yapınız ve rastgele sayı üretmek için Random kütüphanesini kullanınız)*/

import java.util.Scanner;
import java.util.Random;
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(11); // veya random.nextInt(10) + 1;
        int guess,attemptCount = 0;
        boolean isCorrect = false;

        System.out.println("1 ile 10 arasında bir sayıyı tahmin edin.");

        while (!isCorrect) {
            System.out.print("Tahmininizi girin: ");
            guess = scanner.nextInt();
            attemptCount++;

            if (guess < 1 || guess > 10) {
                System.out.println("Lütfen 1 ile 10 arasında bir sayı girin.");
            } else if (guess < randomNumber) {
                System.out.println("Daha yüksek bir sayı tahmin edin.");
            } else if (guess > randomNumber) {
                System.out.println("Daha düşük bir sayı tahmin edin.");
            } else {
                isCorrect = true;
            }
        }

        System.out.println("Tebrikler! " + randomNumber + " sayısını " + attemptCount + ". tahminde bildiniz.");


    }
}
