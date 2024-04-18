package P8.Barang;

public class gudang18 {
    barang18[] tumpukan;
    int size;
    int top;

    public gudang18(int kapasitas){
        size = kapasitas;
        tumpukan = new barang18[size];
        top = -1;
    }
    public boolean cekkosong(){
        if (top == size - 1){
            return true;
        } else {
            return false;
        }
    }
    public boolean cekpenuh(){
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }
    public void tambahbarang(barang18 brg) {
        if (!cekpenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gedung");
        } else {
            System.out.println("Gagal! tumpukan barang digudang sudah penuh");

        }
    }
    public barang18 ambilbarang(){
        if (!cekkosong()){
            barang18 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari gudang");
            return delete;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
    public barang18 lihatbarangteratas(){
        if (!cekkosong()){
            barang18 barangteratas = tumpukan[top];
            System.out.println("Barang teratas: " + barangteratas.nama);
            return barangteratas;
        } else{
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }
    public void tampilkanbarang() {
        if (!cekkosong()){
            System.out.println("Rincian tumpukan barang di gudang: ");
            for (int i = 0; i <= top ; i++) {
                System.out.printf("Kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        }else {
            System.out.println("Tumpukan barang kosong");
        }
    }

}
