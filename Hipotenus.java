import java.util.Scanner;

public class Hipotenus {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan dik kenar uzunluklarını al
            System.out.print("Dik kenarın uzunluğunu girin (a): ");
            double a = scanner.nextDouble();

            System.out.print("Dik kenarın uzunluğunu girin (b): ");
            double b = scanner.nextDouble();

            // Hipotenüsü hesapla
            double hipotenues = Math.sqrt(a * a + b * b);

            System.out.println("Hipotenüs: " + hipotenues);

            // Üçgenin alanını hesapla
            double u = (a + b + hipotenues) / 2;
            double alan = Math.sqrt(u * (u - a) * (u - b) * (u - hipotenues));

            System.out.println("Üçgenin Alanı: " + alan);
        }
    }

