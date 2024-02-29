package P2.PenjualanBuku;

public class bukuMain18 {
    public static void main(String[] args) {

        buku18 bk1 = new buku18();
        bk1.judul = "Today ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

    }

}
