package P12.tugas2;

import java.util.Scanner;
public class filmmain18 {
    public static void main(String[] args) throws Exception {
        Scanner finny18 = new Scanner(System.in);
        dll18 dll = new dll18();
        int choice;

        do {
            System.out.println("DAFTAR FILM");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data index tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari id film");
            System.out.println("9. Urut data rating film - desc");
            System.out.println("10. Keluar");
            System.out.print("Pilih menu: ");
            choice = finny18.nextInt();
            finny18.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan ID: ");
                    int noid0 = finny18.nextInt();
                    finny18.nextLine();
                    System.out.print("Masukkan Judul: ");
                    String judul0 = finny18.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating0 = finny18.nextDouble();

                    film18 film = new film18(noid0, judul0, rating0);
                    dll.addfirst(film);
                    break;
                case 2:
                    System.out.print("Masukkan ID: ");
                    int noid1 = finny18.nextInt();
                    finny18.nextLine();
                    System.out.print("Masukkan Judul: ");
                    String judul1 = finny18.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating1 = finny18.nextDouble();

                    film18 film1 = new film18(noid1, judul1, rating1);
                    dll.addlast(film1);
                    break;
                case 3:
                    System.out.print("Masukkan ID: ");
                    int noid2 = finny18.nextInt();
                    finny18.nextLine();
                    System.out.print("Masukkan Judul: ");
                    String judul2 = finny18.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating2 = finny18.nextDouble();

                    film18 film2 = new film18(noid2, judul2, rating2);
                    System.out.print("Masukkan Posisi: ");
                    int posisi = finny18.nextInt();
                    dll.add(film2, posisi);
                    break;
                case 4:
                    dll.removefirst();
                    break;
                case 5:
                    dll.removelast();
                    break;
                case 6:
                    System.out.print("Hapus posisi: ");
                    int hapus = finny18.nextInt();
                    dll.remove(hapus);
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID: ");
                    int cari = finny18.nextInt();
                    film18 nemu = dll.carifilm(cari);
                    if (nemu != null) {
                        dll.printfilmnemu(nemu);
                    } else {
                        System.out.println("Film tidak ditemukan");
                    }
                    break;
                case 9:
                    dll.sortrating();
                    System.out.println("Film diurutkan berdasarkan rating.");
                    dll.print();
                    break;
                case 10:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid");
            }
        } while (choice != 10);
    }
}
