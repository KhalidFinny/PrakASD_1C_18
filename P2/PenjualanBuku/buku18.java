package P2.PenjualanBuku;

public class buku18 {

    String judul, pengarang;
    int halaman, stok, harga;
    int jmlTerjual = 0;

    public buku18() {

    }

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
        hitungHargaTotal();
        int diskon = hitungDiskon();
        int hargaBayar = hitungHargaBayar() - diskon;
        System.out.println("Harga bayar: " + hargaBayar);

    }

    void terjual(int jml) {
        if (stok > 0) {
            stok = Math.max(stok - jml, 0);
            jmlTerjual = jml;
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

    int hitungHargaTotal() {
        int hargaTotal = 0;
        hargaTotal = jmlTerjual * harga;
        return hargaTotal;
    }

    int hitungDiskon() {
        int hargaTotal = hitungHargaTotal();
        int diskon = 0;
        if (hargaTotal > 150000) {
            diskon = (int) (hargaTotal * 0.12);
        } else if (hargaTotal > 75000) {
            diskon = (int) (hargaTotal * 0.05);
        }
        return diskon;
    }

    int hitungHargaBayar() {
        int hargaTotal = hitungHargaTotal();
        return hargaTotal;
    }

}
