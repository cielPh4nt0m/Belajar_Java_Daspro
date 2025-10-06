import java.util.Scanner;

public class Rentalmobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi biaya tetap
        int biayaSewaPerHari = 300000;
        int biayaSupirPerHari = 200000;
        int biayaBahanBakarPerKm = 1000;

        // Input dari pengguna
        System.out.print("Masukkan lama sewa (hari): ");
        int lamaSewa = input.nextInt();

        System.out.print("Masukkan jarak tempuh (km): ");
        int jarakTempuh = input.nextInt();

        // Perhitungan biaya
        int totalBiayaSewa = biayaSewaPerHari * lamaSewa;
        int totalBiayaSupir = biayaSupirPerHari * lamaSewa;
        int totalBiayaBBM = biayaBahanBakarPerKm * jarakTempuh;

        int totalBiaya = totalBiayaSewa + totalBiayaSupir + totalBiayaBBM;

        // Output hasil
        System.out.println("Total biaya rental adalah Rp " + totalBiaya);
    }
}