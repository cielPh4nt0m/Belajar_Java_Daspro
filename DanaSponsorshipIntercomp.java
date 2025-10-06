import java.util.Scanner;

public class DanaSponsorshipIntercomp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Biaya tetap
        int biayaPublikasi = 300000;
        int biayaDekorasi = 500000;
        int biayaKonsumsiPanitiaJuri = 500000;
        int biayaHadiah = 4000000;
        int biayaOperasionalLain = 500000;

        // Biaya variabel
        int konsumsiPerPeserta = 25000;
        int honorJuriPerJudul = 75000;
        int biayaPendaftaranPerTim = 50000;
        int pesertaPerTim = 3;

        // Input jumlah tim
        System.out.print("Masukkan jumlah tim yang mengikuti Intercomp: ");
        int jumlahTim = input.nextInt();

        // Hitung total peserta dan judul
        int totalPeserta = jumlahTim * pesertaPerTim;
        int totalJudul = jumlahTim;

        // Hitung total anggaran
        int totalAnggaranTetap = biayaPublikasi + biayaDekorasi + biayaKonsumsiPanitiaJuri + biayaHadiah + biayaOperasionalLain;
        int totalKonsumsiPeserta = konsumsiPerPeserta * totalPeserta;
        int totalHonorJuri = honorJuriPerJudul * totalJudul;
        int totalAnggaran = totalAnggaranTetap + totalKonsumsiPeserta + totalHonorJuri;

        // Dana dari Polinema (60%)
        double danaPolinema = 0.60 * totalAnggaran;

        // Dana dari pendaftaran
        int danaPendaftaran = biayaPendaftaranPerTim * jumlahTim;

        // Dana yang perlu dipenuhi melalui sponsorship
        double danaSponsorship = totalAnggaran - danaPolinema - danaPendaftaran;

        // Output hasil
        System.out.println("\n--- Rincian Dana Intercomp ---");
        System.out.println("Total anggaran        : Rp " + totalAnggaran);
        System.out.println("Dana dari Polinema    : Rp " + (int)danaPolinema);
        System.out.println("Dana dari pendaftaran : Rp " + danaPendaftaran);
        System.out.println("Dana sponsorship yang dibutuhkan: Rp " + (int)danaSponsorship);
    }
}
