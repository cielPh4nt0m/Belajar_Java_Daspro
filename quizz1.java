import java.util.Scanner;

public class quizz1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Nama segmen dan faktor lingkungan
        String[] segmen = {"Perkotaan", "Jalan Tol", "Pegunungan"};
        double[] faktorLingkungan = {0.5, 0.3, 0.7};
        double[] konsumsiSegmen = new double[3];

        // Input dan perhitungan konsumsi bahan bakar per segmen
        for (int i = 0; i < 3; i++) {
            System.out.println("\n=== Input untuk segmen " + segmen[i] + " ===");
            System.out.print("Durasi (jam): ");
            double durasi = input.nextDouble();

            System.out.print("Kecepatan (km/jam): ");
            double kecepatan = input.nextDouble();

            System.out.print("Kapasitas mesin (liter/km): ");
            double kapasitasMesin = input.nextDouble();

            // Rumus konsumsi bahan bakar
            konsumsiSegmen[i] = (kecepatan * durasi / 100) * kapasitasMesin * faktorLingkungan[i];
        }

        // Total dan rata-rata konsumsi
        double totalKonsumsi = 0;
        for (double konsumsi : konsumsiSegmen) {
            totalKonsumsi += konsumsi;
        }
        double rataRata = totalKonsumsi / segmen.length;

        // Mencari segmen dengan konsumsi tertinggi
        int indeksTertinggi = 0;
        for (int i = 1; i < konsumsiSegmen.length; i++) {
            if (konsumsiSegmen[i] > konsumsiSegmen[indeksTertinggi]) {
                indeksTertinggi = i;
            }
        }

        // Input target konsumsi
        System.out.print("\nMasukkan target konsumsi bahan bakar (liter): ");
        double target = input.nextDouble();

        // Output hasil
        System.out.println("\n=== Hasil Perhitungan ===");
        for (int i = 0; i < segmen.length; i++) {
            System.out.printf("Konsumsi segmen %s: %.2f liter\n", segmen[i], konsumsiSegmen[i]);
        }
        System.out.printf("Total konsumsi bahan bakar: %.2f liter\n", totalKonsumsi);
        System.out.printf("Rata-rata konsumsi per segmen: %.2f liter\n", rataRata);
        System.out.println("Segmen dengan konsumsi tertinggi: " + segmen[indeksTertinggi]);
        System.out.println("Apakah konsumsi di bawah target? " + (totalKonsumsi <= target ? "Ya" : "Tidak"));
    }
}
