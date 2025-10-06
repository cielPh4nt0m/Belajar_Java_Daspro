public class Contoh13 {
    public static void main(String[] args) {
        String salahSatuHobysayaAdalah = "bermain petak umpet";
        boolean isPandai = true;
        char jeniskelamin = 'l';
        byte _umurSayaSekarang  = 20;
        double $ipk = 3.24,  tinggi = 1.78;
        System.out.println("SalahSatuHobySayaAdalah");
        System.out.println("Apakah pandai? " + isPandai );
        System.out.println("Jenis kelamin: " + jeniskelamin);
        System.err.println("Umurku saat ini:" + _umurSayaSekarang );
        System.out.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
    }
}
