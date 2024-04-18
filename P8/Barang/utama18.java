package P8.Barang;

import java.util.Scanner;

public class utama18 {
    public static void main(String[] args) {
        Scanner finny18 = new Scanner(System.in);
        gudang18 gudang = new gudang18(7);


        while (true){
            System.out.println("\nMenu: ");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = finny18.nextInt();
            finny18.nextLine();

            switch (pilihan){
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = finny18.nextInt();
                    finny18.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = finny18.nextLine();
                    System.out.print("Masukkan nama katgori: ");
                    String kategori = finny18.nextLine();
                    barang18 barangbaru = new barang18(kode, nama, kategori);
                    gudang.tambahbarang(barangbaru);
                    break;
                case 2:
                    gudang.ambilbarang();
                    break;
                case 3:
                    gudang.tampilkanbarang();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan coba lagi");
            }
        }
    }
}

