import java.util.Scanner;

public class DaireHesaplayici {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan yarı çapı al
        System.out.print("Dairenin yarı çapını girin: ");
        double yariCap = scanner.nextDouble();

        // Pi sayısını tanımla
        double pi = 3.14;

        // Dairenin alanını hesapla
        double alan = pi * yariCap * yariCap;

        // Dairenin çevresini hesapla
        double cevre = 2 * pi * yariCap;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);

        // Ek ödev: Daire diliminin alanını hesapla
        System.out.print("Merkez açısının ölçüsünü (derece cinsinden) girin: ");
        double merkezAcisi = scanner.nextDouble();

        double daireDilimiAlani = (pi * (yariCap * yariCap) * merkezAcisi) / 360;

        System.out.println("Daire Diliminin Alanı: " + daireDilimiAlani);
    }
}
