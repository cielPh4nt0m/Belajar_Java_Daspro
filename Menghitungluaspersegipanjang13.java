import java.util.Scanner;

public class Menghitungluaspersegipanjang13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang;
        int lebar;
        int luas;
        
        panjang=input.nextInt();
        lebar=input.nextInt();
        
        luas=panjang*lebar;

        System.out.println("Luas persegi adalah " +luas);

    }
 }
