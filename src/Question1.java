/* Kullanıcıdan kaç ürün almak istediğini soran,her ürünün fiyatını alarak
toplam alışveriş tutarını hesaplayan bir algoritma yazınız.
(Input için Scanner ve döngü için for döngüsü kullanınız)*/
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Alıncak ürün sayısını giriniz:  ");
        int productCount = scanner.nextInt();

        double total = 0;

        for (int i = 1; i <= productCount; i++) {
            System.out.print(i+". ürünün fiyatını girin: ");
            double price = scanner.nextDouble();
            total += price;
        }

        System.out.println("\nToplam alışveriş tutarı: " + total + " TL");

    }
}
