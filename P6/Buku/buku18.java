package P6.Buku;

public class buku18 {
    int kodebuku, tahunterbit, stok;
    String judulbuku, pengarang;

    public buku18(int kodebuku,String judulbuku, int tahunterbit, String pengarang,  int stok){
        this.kodebuku = kodebuku;
        this.judulbuku = judulbuku;
        this.tahunterbit = tahunterbit;
        this.pengarang = pengarang;
        this.stok = stok;
    }

    public void tampildatabuku(){
        System.out.println("======================");
        System.out.println("Kode Buku: " + kodebuku);
        System.out.println("Judul Buku: " + judulbuku);
        System.out.println("Tahun Terbit: " + tahunterbit);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Stok: " + stok);


    }


}
