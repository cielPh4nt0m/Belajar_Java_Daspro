import java.util.Scanner;

public class Biayacetakbuku {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Biaya tetap
        int biayaCetakPerHalaman = 200;
        int biayaJilidHardCover = 20000;
        int beratHardCover = 250; // dalam gram
        int beratKemasan = 300;   // dalam gram
        int beratKertasPerLembar = 3; // dalam gram
        int biayaPengirimanPerKg = 15000;

        // Input jumlah halaman
        System.out.print("Masukkan jumlah halaman buku: ");
        int jumlahHalaman = input.nextInt();

        // Hitung biaya cetak
        int biayaCetak = jumlahHalaman * biayaCetakPerHalaman;

        // Hitung total biaya sebelum pengiriman
        int biayaSebelumPengiriman = biayaCetak + biayaJilidHardCover;

        // Hitung jumlah lembar kertas (karena bolak-balik, 1 lembar = 2 halaman)
        int jumlahLembar = (int) Math.ceil(jumlahHalaman / 2.0);

        // Hitung total berat (dalam gram)
        int totalBeratGram = (jumlahLembar * beratKertasPerLembar) + beratHardCover + beratKemasan;

        // Konversi ke kilogram dan bulatkan ke atas
        int totalBeratKg = (int) Math.ceil(totalBeratGram / 1000.0);

        // Hitung biaya pengiriman
        int biayaPengiriman = totalBeratKg * biayaPengirimanPerKg;

        // Hitung total biaya keseluruhan
        int totalBiaya = biayaSebelumPengiriman + biayaPengiriman;

        // Output hasil
        System.out.println("\n--- Rincian Biaya Percetakan Buku ---");
        System.out.println("Biaya cetak halaman     : Rp " + biayaCetak);
        System.out.println("Biaya jilid hard cover  : Rp " + biayaJilidHardCover);
        System.out.println("Biaya pengiriman        : Rp " + biayaPengiriman);
        System.out.println("Total biaya yang harus dibayar: Rp " + totalBiaya);
    }
}
