package P6.Buku;


public class bukumain18 {
    public static void main(String[] args) {

        buku18 m = new buku18(20215, "Algoritma", 2019, "Wahyuni", 5);
        buku18 m1 = new buku18(20214, "Big Data", 2020, "Susito", 3);
        buku18 m2 = new buku18(20212, "Desain UI", 2021, "Supriadi", 6);
        buku18 m3 = new buku18(20211, "Web Programming", 2022, "Pustaka Adi", 2);
        buku18 m4 = new buku18(20211, "Etika Mahasiswa", 2023, "Darmawan Adi", 1);

        daftarbuku18 listbk = new daftarbuku18();
        listbk.tambah(m);
        listbk.tambah(m1);
        listbk.tambah(m2);
        listbk.tambah(m3);
        listbk.tambah(m4);

        System.out.println("================");
        System.out.println("Data sebelum diurutkan");
        listbk.tampil();

        System.out.println("================");
        System.out.println("Data setelah diurutkan secara Ascending berdasarkan stok");
        listbk.bubblesort();
        listbk.tampil();

    }

}
