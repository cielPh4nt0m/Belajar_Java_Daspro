import java.util.Scanner;

 public class Tugas113{
    public static void main(String[] args) {
        
        Double hargaAsli, DP, jumlahBulan, hargaSisa;
        double bunga, totalBunga, totalDibayarkan, totalBayarPerBulan;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga motor : ");
        hargaAsli = input.nextDouble();
        System.out.print("Masukkan jumlah pembayaran DP :");
        DP = input.nextDouble();
        System.out.print("Masukkan lama cicilan :");
        jumlahBulan = input.nextDouble();

        hargaSisa = hargaAsli - DP;
        bunga = 0.01 * hargaSisa;
        totalBunga = bunga * jumlahBulan;
        totalBayarPerBulan = (double) ((hargaSisa/jumlahBulan) + bunga);
        totalDibayarkan = (double) hargaAsli + totalBunga;

        System.out.println("Harga motor = " + hargaAsli);
        System.out.println("Jumlah DP motor = " + DP);
        System.out.println("Sisa yang belum dibayar = " + hargaSisa);
        System.out.println("Jumlah bunga = " + bunga);
        System.out.println("Lama cicilan = " + jumlahBulan);
        System.out.println("Total bunga yang dibayar = " + totalBunga);
        System.out.println("Total yang dibayarkan per bulan = " + totalBayarPerBulan);
        System.out.println("Total yang dibayarkan = " + totalDibayarkan);
    }
 }
