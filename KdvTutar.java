import java.util.Scanner;

public class KdvTutar {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Lütfen KDV'siz fiyatı girin: ");
            double kdvsizFiyat = scanner.nextDouble();

            double kdvOrani;
            if (kdvsizFiyat > 0 && kdvsizFiyat <= 1000) {
                kdvOrani = 0.18; // %18 KDV
            } else {
                kdvOrani = 0.08; // %8 KDV
            }

            double kdvTutari = kdvsizFiyat * kdvOrani;
            double kdvliFiyat = kdvsizFiyat + kdvTutari;

            System.out.println("KDV'siz Fiyat: " + kdvsizFiyat);
            System.out.println("KDV Oranı: %" + (kdvOrani * 100));
            System.out.println("KDV Tutarı: " + kdvTutari);
            System.out.println("KDV'li Fiyat: " + kdvliFiyat);
        }
    }


