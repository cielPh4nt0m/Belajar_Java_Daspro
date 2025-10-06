import java.util.Scanner;
public class Studi1dan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("============ PILIH MENU ==============");
        System.out.println("1. Studi kasus 1 (bu jesi)");
        System.out.println("2. Modifikasi Studi Kasus 1");
        System.out.println("3. Studi kasus 2 (Pak jaka)");
        System.out.println("4. Modifikasi Studi kasus 2");
        System.out.print("Pilih menu: ");

        int menu = input.nextInt();

        switch (menu) {
            case 1: {
                double gajiPokok = 3000000;
                double tunjanganAnak = 150000;
                int jumlahAnak = 3;
                double totalTunjangan = tunjanganAnak * jumlahAnak;
                double potongan = gajiPokok * 0.05;
                double gajiBersih = gajiPokok + totalTunjangan - potongan;
                System.out.println("Gaji bersih Bu Jesi: Rp " + gajiBersih);
                break;
            }
            case 2: {
                System.out.print("Masukkan gaji pokok: ");
                double gajiPokok = input.nextDouble();
                System.out.print("Masukkan tunjangan anak per bulan: ");
                double tunjanganAnak = input.nextDouble();
                System.out.print("Masukkan jumlah anak: ");
                int jumlahAnak = input.nextInt();
                double totalTunjangan = tunjanganAnak * jumlahAnak;
                double potongan = gajiPokok * 0.05;
                double gajiBersih = gajiPokok + totalTunjangan - potongan;
                System.out.println("Gaji bersih: Rp " + gajiBersih);
                break;
            }
            case 3: {
                double panjang = 100;
                double lebar = 50;
                double diameter = 2;
                double sisi = 2;
                double luasTanah = panjang * lebar;
                double luasLingkaran = Math.PI * Math.pow(diameter / 2, 2);
                double luasPersegi = sisi * sisi;
                double totalKolam = (2 * luasLingkaran) + luasPersegi;
                double luasRumput = luasTanah - totalKolam;
                System.out.println("Luas tanah untuk rumput: " + luasRumput + " m2");
                break;
            }

            case 4: {
                System.out.print("Masukkan panjang tanah: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar tanah: ");
                double lebar = input.nextDouble();
                System.out.print("Masukkan diameter kolam: ");
                double diameter = input.nextDouble();
                System.out.print("Masukkan sisi kolam: ");
                double sisi = input.nextDouble();
                double luasTanah = panjang * lebar;
                double luasLingkaran = Math.PI * Math.pow(diameter / 2, 2);
                double luasPersegi = sisi * sisi;
                double totalKolam = (2 * luasLingkaran) + luasPersegi;
                double luasRumput = luasTanah - totalKolam;
                System.out.println("Luas tanah untuk rumput: " + luasRumput + " m2");
                break;
            }
            default:
                System.out.println("Menu tidak tersedia");
        }
        input.close();
    }
}
