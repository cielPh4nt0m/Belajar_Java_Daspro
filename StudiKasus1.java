import java.util.Scanner;

public class StudiKasus1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan gaji pokok (dalam rupiah): ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan jumlah anak: ");
        int jumlahAnak = input.nextInt();

        System.out.print("Masukkan tunjangan anak per anak (dalam rupiah): ");
        double tunjanganAnakPerAnak = input.nextDouble();

        double totalTunjanganAnak = tunjanganAnakPerAnak * jumlahAnak;

        double potonganPensiun = 0.05 * gajiPokok;

        double gajiBersih = gajiPokok + totalTunjanganAnak - potonganPensiun;

        System.out.println("\n===== Hasil Perhitungan Gaji Bersih =====");
        System.out.println("Gaji Pokok\t\t: Rp " + gajiPokok);
        System.out.println("Tunjangan Anak\t\t: Rp " + totalTunjanganAnak);
        System.out.println("Potongan Pensiun (5%)\t: Rp " + potonganPensiun);
        System.out.println("---------------------------------------");
        System.out.println("Gaji Bersih\t\t: Rp " + gajiBersih);

        input.close();
    }
}

