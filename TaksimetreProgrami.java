import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan mesafeyi al
        System.out.print("Gidilen mesafeyi (KM) girin: ");
        double mesafe = scanner.nextDouble();

        // Taksimetre tutarını hesapla
        double acilisUcreti = 10.0;
        double kmTutari = 2.20;
        double minimumUcret = 20.0;

        double taksimetreTutari = acilisUcreti + (mesafe * kmTutari);

        // Minimum ücret kontrolü
        if (taksimetreTutari < minimumUcret) {
            taksimetreTutari = minimumUcret;
        }

        System.out.println("Taksimetre Tutarı: " + taksimetreTutari + " TL");
    }
}
