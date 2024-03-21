package P5.SumArrray;

import java.util.Scanner;

public class mainsum18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program menghitung keuntungan total (satuan jutam misal5,9)");
        System.out.print("Masukkan jumlah bulan: ");
        int jmlbln = sc18.nextInt();

        sum18 sm = new sum18(jmlbln);
        System.out.println("==============================");
        for (int i = 0; i < sm.element; i++) {
            System.out.print("Masukkan untung bulan ke - " + (i+1) + ": ");
            sm.keuntungan[i] = sc18.nextDouble();
        }
        System.out.println("=====================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama "+ sm.element + " bulan adalah: "+ sm.totalBF(sm.keuntungan));
        System.out.println("=====================================");
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total keuntungan perusahaan selama "+ sm.element + " bulan adalah: "+ sm.totalDC(sm.keuntungan, 0,sm.element-1));
    }
}
