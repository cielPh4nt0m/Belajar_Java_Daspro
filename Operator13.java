public class Operator13 {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x++ =  " + x++);
        System.out.println("Setelah evaluasi, x = " + x);
        x = 10;
        System.err.println("++x = " + ++x);
        System.err.println("Setelah evaluasi, x = " + x);
        int y = 12;
        System.err.println(x > y || y == x && y <= x);
        int z = x ^ y;
        System.err.println("Hasil x ^ y adalah " + z);
        z %= 2;
        System.err.println("Hasil akhir " +z);
    }
    }

