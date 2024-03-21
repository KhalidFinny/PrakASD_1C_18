package P5.SumArrray;

import java.util.Scanner;

public class mainsum18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program menghitung keuntungan total (satuan jutam misal5,9)");
        System.out.print("Masukkan berapa perusahaan: ");
        int jmlperusahaan = sc18.nextInt();

        int[] jmlblnPerusahaan = new int[jmlperusahaan];
        double[] totalPerusahaanBF = new double[jmlperusahaan];
        double[] totalPerusahaanDC = new double[jmlperusahaan];
        sum18 sm = null;
        System.out.println("==============================");
        for (int i = 0; i < jmlperusahaan; i++) {
            System.out.println("Perusahaan ke -" + (i + 1));
            System.out.print("Masukkan jumlah bulan: ");
            jmlblnPerusahaan[i] = sc18.nextInt();
            sm = new sum18(jmlblnPerusahaan[i]);
            for (int j = 0; j < sm.element; j++) {
                System.out.print("Masukkan untung bulan ke - " + (j + 1) + ": ");
                sm.keuntungan[j] = sc18.nextDouble();
            }
            totalPerusahaanBF[i] = sm.totalBF(sm.keuntungan);
            totalPerusahaanDC[i] = sm.totalDC(sm.keuntungan, 0, sm.element - 1);
        }
        System.out.println("=====================================");
        for (int i = 0; i < jmlperusahaan; i++) {
            System.out.println("Perusahaan ke -" + (i + 1));
            System.out.println("Algoritma Brute Force");
            System.out.println("Total keuntungan perusahaan selama " + jmlblnPerusahaan[i] + " bulan adalah: " + totalPerusahaanBF[i]);
            System.out.println("=====================================");
            System.out.println("Algoritma Divide and Conquer");
            System.out.println("Total keuntungan perusahaan selama " + jmlblnPerusahaan[i] + " bulan adalah: " + totalPerusahaanDC[i]);
            System.out.println("=====================================");
        }
    }
}
