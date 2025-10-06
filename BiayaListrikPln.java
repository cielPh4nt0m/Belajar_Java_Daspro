import java.util.Scanner;

public class BiayaListrikPln {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Biaya tetap dan tarif per kWh
        int biayaTetap = 50000;
        int tarifPerKwh = 1500;
        double ppnPersen = 0.10;

        // Input dari pengguna
        System.out.print("Masukkan daya listrik yang digunakan (dalam kWh): ");
        int kwh = input.nextInt();

        // Perhitungan biaya sebelum pajak
        int biayaListrik = tarifPerKwh * kwh;
        int subtotal = biayaTetap + biayaListrik;

        // Hitung PPN
        double ppn = subtotal * ppnPersen;

        // Total biaya
        double totalBiaya = subtotal + ppn;

        // Output hasil
        System.out.println("Biaya tetap      : Rp " + biayaTetap);
        System.out.println("Biaya listrik    : Rp " + biayaListrik);
        System.out.println("Subtotal         : Rp " + subtotal);
        System.out.println("PPN (10%)        : Rp " + (int)ppn);
        System.out.println("Total yang harus dibayar: Rp " + (int)totalBiaya);
    }
}
