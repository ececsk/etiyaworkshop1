/*
* kullanıcıdan öğrenci sayısını isteyen her öğrenci için öğrenci adı,öğrenci soyadı,
* 1.sınav notu,2.sınav notu,3.sınav notu isteyen ve daha sonra not ortalamasını
* hesaplayıp ekrana yazdıran algoritma yapınız.(For döngüsü kullanınız)
* */
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalAverage=0;
        System.out.print("Öğrenci sayısını girin: ");
        int studentCount = scanner.nextInt();

        for(int i = 1; i<= studentCount; i++) {
            System.out.print("Öğrenci Adı: ");
            String firstName = scanner.next();

            System.out.print("Öğrenci Soyadı: ");
            String lastName = scanner.next();

            System.out.print("1. Sınav Notu: ");
            int exam1 = scanner.nextInt();

            System.out.print("2. Sınav Notu: ");
            int exam2 = scanner.nextInt();

            System.out.print("3. Sınav Notu: ");
            int exam3 = scanner.nextInt();

            double average = (exam1 + exam2 + exam3) / 3.0;
            System.out.println(firstName + " " + lastName + " adlı öğrencinin not ortalaması: " + average);
            totalAverage=totalAverage+average;
    }
        double averageGenel = totalAverage/studentCount;
        System.out.println("Tüm öğrencilerin genel not ortalaması: " + averageGenel);
}

}
