import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meyve fiyatları
        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5.00;

        // Kullanıcıdan meyve miktarlarını al
        System.out.print("Armut Kaç Kilo? : ");
        double armutKilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double elmaKilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double domatesKilo = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double patlicanKilo = scanner.nextDouble();

        // Toplam tutarı hesapla
        double toplamTutar = (armutKilo * armutFiyati) +
                (elmaKilo * elmaFiyati) +
                (domatesKilo * domatesFiyati) +
                (muzKilo * muzFiyati) +
                (patlicanKilo * patlicanFiyati);

        // Sonucu ekrana yazdır
        System.out.println("Toplam Tutar : " + toplamTutar + " TL");
    }
}
