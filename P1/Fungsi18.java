package P1;

public class Fungsi18 {
    public static void main(String[] args) {
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = pendapatanCabang(i);
            System.out.println("Pendapatan RoyalGarden: ");
            System.out.println("Pendapatan " + (i + 1) + ": " + pendapatan);
        }

        int[] jumlahStock = stock();
        System.out.println("\nJumlah stock setelah bunga mati: ");
        for (int i = 0; i < jumlahStock.length; i++) {
            System.out.println("Stock bunga ke-" + (i + 1) + ": " + jumlahStock[i]);
        }
    }

    static int[][] stockBunga = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };
    static int[] hargaBunga = { 75000, 50000, 60000, 10000 };
    static int[] bungaMati = { -1, -2, 0, 5 };

    static int pendapatanCabang(int cabang) {
        int pendapatan = 0;
        for (int i = 0; i < stockBunga[cabang].length; i++) {
            pendapatan += stockBunga[cabang][i] * hargaBunga[i];
        }
        return pendapatan;
    }

    static int[] stock() {
        int[] jumlahStock = new int[stockBunga.length];
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                jumlahStock[j] += stockBunga[i][j];
            }
        }
        for (int i = 0; i < jumlahStock.length; i++) {
            jumlahStock[i] += bungaMati[i];
        }
        return jumlahStock;
    }
}
