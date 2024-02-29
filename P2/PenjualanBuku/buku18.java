package P2.PenjualanBuku;

public class buku18 {

    String judul, pengarang;
    int halaman, stok, harga;

    public buku18(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Halaman: " + halaman);
        System.out.println("Stok: " + stok);
        System.out.println("Harga: " + harga);

    }

    void terjual(int jml) {
        if (stok > 0) {
            stok = Math.max(stok - jml, 0);
        } else {
            System.out.println("Habis");
        }

    }

    void restock(int jml) {
        stok += jml;

    }

    void gantiHarga(int hrg) {
        harga = hrg;

    }
}
