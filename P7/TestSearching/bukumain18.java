package P7.TestSearching;

import java.util.Scanner;

public class bukumain18 {
    public static void main(String[] args) {
        Scanner ami18 = new Scanner(System.in);
        int buku = 5;

        pencarianbuku18 data = new pencarianbuku18();
        buku18 m = new buku18(111, "Algoritma", 2019, "Wahyuni", 5);
        buku18 m1 = new buku18(123, "Big Data", 2020, "Susilo", 3);
        buku18 m2 = new buku18(125, "Desain UI", 2021, "Supriadi", 3);
        buku18 m3 = new buku18(126, "Web Programming", 2022, "Pustaka Adi", 2);
        buku18 m4 = new buku18(127, "Etika Mahasiswa", 2023, "Darmawan Adi", 2);

        data.tambah(m);
        data.tambah(m1);
        data.tambah(m2);
        data.tambah(m3);
        data.tambah(m4);

        System.out.println("==================================");
        System.out.println("Data keseluruhan buku: ");
        data.tampil();

        System.out.println("====================================");
        System.out.println("Pencarian data: ");
        System.out.print("Masukkan kode buku yang dicari: ");
        int cari = ami18.nextInt();
//        System.out.println("Menggunakan sequential search ");
//        int posisi = data.seqsearch(cari);
//        data.tampilposisi(cari, posisi);
//        data.data(cari, posisi);
//        buku18 databuku = data.findBuku(cari);
//        databuku.tampildata();
        System.out.println("=============================");
        System.out.println("Menggunakan Binary search: ");
        int posisi = data.binary(cari, 0, buku - 1);
        data.tampilposisi(cari, posisi);
        data.data(cari, posisi);


    }



}
