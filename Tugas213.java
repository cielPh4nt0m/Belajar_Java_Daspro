import java.util.Scanner;

public class Tugas213{
    public static void main(String[] args) {
    double jarak, rata2Bensin, hargaBensin, TotalBiaya;
    Scanner input = new Scanner(System.in);

    rata2Bensin = 0.5;
    hargaBensin = 12000;
    System.out.println("Masukkan total jarak : " );
    jarak = input.nextDouble();

    TotalBiaya = (jarak*rata2Bensin)*hargaBensin;
    System.out.println("Total biaya = " + TotalBiaya);

    }
 }
