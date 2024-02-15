package P1;

import java.util.Scanner;

public class Pemilihan18 {

    public static void main(String[] args) {
        Scanner finny18 = new Scanner(System.in);

        String[] huruf = { "A", "B+", "B", "C+", "C", "D", "E" };
        int[] nilaiBawah = { 80, 73, 65, 60, 50, 39, 0 };
        int[] nilaiAtas = { 100, 80, 73, 65, 60, 50, 39 };
        String[] kategoriNilai = { "Sangat Baik", "Lebih dari Baik", "Baik", "Lebih dari Cukup", "Cukup", "Kurang",
                "Gagal" };

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = finny18.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double nilaiKuis = finny18.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = finny18.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = finny18.nextDouble();

        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100
                || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Maaf, nilai tidak valid!");
            return;
        }

        double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);

        int indexHuruf = 0;
        for (int i = 0; i < huruf.length; i++) {
            if (nilaiAkhir >= nilaiBawah[i] && nilaiAkhir <= nilaiAtas[i]) {
                indexHuruf = i;
                break;
            }
        }
        String keterangan = (indexHuruf >= 0 && indexHuruf <= 5) ? "LULUS" : "TIDAK LULUS";

        System.out.println("");
        System.out.println("================================================");
        System.out.println("");

        System.out.printf("Nilai akhir   : %.2f\n", nilaiAkhir);
        System.out.println("Nilai huruf   : " + huruf[indexHuruf]);
        System.out.println("Keterangan    : " + keterangan);
        System.out.println("Status        : " + kategoriNilai[indexHuruf]);
    }
}
