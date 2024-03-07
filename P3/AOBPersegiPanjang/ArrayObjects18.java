package P3.AOBPersegiPanjang;

import java.util.Scanner;

public class ArrayObjects18 {
    // public static void main(String[] args) {
    // Scanner sc18 = new Scanner(System.in);

    // PersegiPanjang18[] ppArray = new PersegiPanjang18[3];

    // for (int i = 0; i < 3; i++) {
    // ppArray[i] = new PersegiPanjang18();
    // System.out.println("Persegi panjang ke " + i);
    // System.out.print("Masukkan panjang: ");
    // ppArray[i].panjang = sc18.nextInt();
    // System.out.print("Masukkan lebar: ");
    // ppArray[i].lebar = sc18.nextInt();

    // }
    // System.out.println("================================================================");
    // for (int i = 0; i < 3; i++) {
    // System.out.println("Persegi Panjang ke " + i);
    // System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " +
    // ppArray[i].lebar);
    // }
    // sc18.close();

    // }
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        PersegiPanjang18[][] ppArray = new PersegiPanjang18[3][3];

        for (int i = 0; i < ppArray.length; i++) {
            int j = 0;
            ppArray[i][j] = new PersegiPanjang18();
            ppArray[0][0] = new PersegiPanjang18();
            System.out.println("Persegi panjang ke " + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i][j].panjang = sc18.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i][j].lebar = sc18.nextInt();

        }
        System.out.println("================================================================");
        int j = 0;
        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke " + i);
            System.out.println("Panjang: " + ppArray[i][j].panjang + ", lebar: " + ppArray[i][j].lebar);
        }
        sc18.close();

    }

}
