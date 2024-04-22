/*Bir sayının mükemmel sayı(sayının kendisi hariç pozitif bölenlerinin toplamı, sayıya eşit olmalı) olup olmadığını kontrol eden algoritma yazınız.*/
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println(number + " bir mükemmel sayıdır.");
        } else {
            System.out.println(number + " bir mükemmel sayı değildir.");
        }
    }
}
