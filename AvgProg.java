import java.util.Scanner;

public class AvgProg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik sınav puanını girin: ");
        int matematik = scanner.nextInt();

        System.out.print("Fizik sınav puanını girin: ");
        int fizik = scanner.nextInt();

        System.out.print("Kimya sınav puanını girin: ");
        int kimya = scanner.nextInt();

        System.out.print("Türkçe sınav puanını girin: ");
        int turkce = scanner.nextInt();

        System.out.print("Tarih sınav puanını girin: ");
        int tarih = scanner.nextInt();

        System.out.print("Müzik sınav puanını girin: ");
        int muzik = scanner.nextInt();

        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        int ortalama = toplam / 6;

        System.out.println(ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

    }
}
