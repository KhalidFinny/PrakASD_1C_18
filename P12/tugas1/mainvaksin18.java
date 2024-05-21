package P12.tugas1;

import java.util.Scanner;

public class mainvaksin18 {
    public static void main(String[] args) {
        Scanner finny18 = new Scanner(System.in);
        queuedll18 antrian = new queuedll18();
        int choice;

        do {
            System.out.println("VAKSINASI");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            choice = finny18.nextInt();
            finny18.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan nomor antrian: ");
                    int antri = finny18.nextInt();
                    finny18.nextLine();
                    System.out.print("Masukkan nama: ");
                    String nama = finny18.nextLine();
                    antrian.enqueue (antri, nama);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (choice != 4);
    }
}