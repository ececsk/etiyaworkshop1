/*- String metotlarını araştırınız. Her bir metot için örnek yapınız.*/
import java.lang.String;
public class Question5 {
    public static void main(String[] args) {
        String str = "Hello World";

        char ch = str.charAt(1); //Belirtilen dizindeki karakteri döndürür.
        System.out.println("Karakter: " + ch);

        int len = str.length(); //String'in karakter uzunluğu
        System.out.println("Uzunluk: " + len);

        String upperCaseStr = str.toUpperCase(); //String'i büyük harfe dönüştürür
        System.out.println("Büyük harf: " + upperCaseStr);

        String lowerCaseStr = str.toLowerCase(); //String'i küçük harfe dönüştürür
        System.out.println("Küçük harf: " + lowerCaseStr);

        String subStr = str.substring(6); //Belirtilen dizinden başlayarak string'in alt dizisini döndürür
        System.out.println("Alt string: " + subStr);

        String subStr2 = str.substring(6, 11); //Belirtilen dizinden başlayarak belirtilen dizine kadar olan string'in alt dizisini döndürür
        System.out.println("Alt string: " + subStr);

        boolean startsWithHello = str.startsWith("Hello");//String, belirtilen bir önekiyle başlıyorsa true döndürür
        System.out.println("Başlangıç: " + startsWithHello);

        boolean endsWithWorld = str.endsWith("World"); //String, belirtilen bir sonekiyle bitiyorsa true döndürür.
        System.out.println("Son: " + endsWithWorld);

        String trimmedStr = str.trim(); //String'in başındaki ve sonundaki boşlukları kaldırır.
        System.out.println("Trim fonk: \"" + trimmedStr + "\"");


        String replacedStr = str.replace('l', 'X'); //String içindeki belirtilen eski karakterleri yeni karakterlerle değiştirir.
        System.out.println("Değiştirilmiş string: " + replacedStr);
    }
}

