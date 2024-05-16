package P11.Tugas;

import java.util.Scanner;

public class mainqueue18 {
    public static void main(String[] args) {
        Scanner finny18 = new Scanner(System.in);
        queuesll18 queue = new queuesll18();
        int pilihan;
        do {
            System.out.println("\nMenu Antrian Layanan Unit Kemahasiswaan:");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Hapus Antrian ");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = finny18.nextInt();
            finny18.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    while (!finny18.hasNextInt()) {
                        System.out.println("Input salah. Masukkan angka untuk NIM.");
                        finny18.next();
                        System.out.print("Masukkan NIM: ");
                    }
                    int nim = finny18.nextInt();
                    finny18.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = finny18.nextLine();
                    queue.enqueue(new tugas218(nim, nama));
                    System.out.println("Antrian berhasil ditambahkan.");
                    break;
                case 2:
                    if (queue.isempty()) {
                        System.out.println("Antrian kosong, tidak ada yang bisa dilayani.");
                    } else {
                        tugas218 dilayani = queue.dequeue();
                        System.out.println("NIM" + dilayani.nim + " Nama " + dilayani.nama + " telah selesai");
                    }
                    break;
                case 3:
                    System.out.println("Antrian saat ini:");
                    if (queue.isempty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        queue.print();
                    }
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 4);
    }
}



