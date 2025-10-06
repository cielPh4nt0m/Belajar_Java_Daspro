import java.util.Scanner;

public class GajiKaryawan13 {
    public static void main(String[] args) {
        int gajipokok;
        double bonus, totalGaji, TunjanganTrns, TunjanganMakan;

        TunjanganMakan = 400000;
        TunjanganTrns = 600000;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Gaji : ");
        gajipokok = input.nextInt();
        bonus = 0.05 * gajipokok;
        totalGaji = gajipokok+TunjanganTrns+TunjanganMakan+bonus-(0.1*gajipokok);

        System.err.println("Bonus Bulanan Anda Adalah Rp. " + bonus);
        System.err.println("Gaji yang diterima adalah Rp."+totalGaji);
    }
}
