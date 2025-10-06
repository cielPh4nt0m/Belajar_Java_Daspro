
import java.util.Scanner;


  public class MenghitungTotalBayar13{
    public static void main(String[] args) {
        double harga;
        double potongan, diskon = 0.15, bayar;
        Scanner input = new Scanner(System.in);

        System.out.println("masukkan harga : ");
        harga = input.nextDouble();
        potongan = diskon * harga;
        bayar = harga - potongan;
        System.err.println("anda mendapatkan potongan : " + potongan);
        System.err.println("anda membayar sebesar : " + bayar);
            
    
    }
  }
