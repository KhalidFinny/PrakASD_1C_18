package P7.TestSearching;

public class buku18 {
    int kodebuku;
    String judulbuku;
    int tahunterbit;
    String pengarang;
    int stock;

    public buku18(int kodebuku,  String judulbuku, int tahunterbit, String pengarang, int stock){
        this.kodebuku = kodebuku;
        this.judulbuku = judulbuku;
        this.tahunterbit = tahunterbit;
        this.pengarang = pengarang;
        this.stock = stock;
    }

    public void tampildata(){
        System.out.println("================================");
        System.out.println("Kode buku: "+kodebuku);
        System.out.println("Judul buku: "+judulbuku);
        System.out.println("Tahun terbit: "+tahunterbit);
        System.out.println("Nama pengarang: "+pengarang);
        System.out.println("Sisa stock: "+stock);
    }

}
