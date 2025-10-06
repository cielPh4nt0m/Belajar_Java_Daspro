import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan lebar tanah (meter): ");
        double lebarTanah = sc.nextDouble();
        
        System.out.print("Masukkan panjang tanah (meter): ");
        double panjangTanah = sc.nextDouble();
        
        System.out.print("Masukkan diameter kolam lingkaran (meter): ");
        double diameterKolam = sc.nextDouble();
        
        System.out.print("Masukkan sisi kolam persegi (meter): ");
        double sisiKolam = sc.nextDouble();
        
        // Luas tanah total
        double luasTanah = lebarTanah * panjangTanah;
        
        // Luas kolam lingkaran (2 kolam)
        double radiusKolam = diameterKolam / 2;
        double luasKolamLingkaran = 2 * Math.PI * radiusKolam * radiusKolam;
        
        // Luas kolam persegi (2 kolam)
        double luasKolamPersegi = 2 * sisiKolam * sisiKolam;
        
        // Luas tanah yang ditanami rumput
        double luasTanahTertanam = luasTanah - (luasKolamLingkaran + luasKolamPersegi);
        
        System.out.printf("Luas tanah yang akan ditanami rumput taman: %.2f meter persegi\n", luasTanahTertanam);
        
        sc.close();
    }
}

