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
        if (!cekkosong()) {
            top++;
            if (top < size) {
                tumpukan[top] = brg;
                System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
            } else {
                System.out.println("Gagal! Tumpukan barang di gudang sudah penuh");
                top--;
            }
        } else {
            top = 0;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang");
        }
    }
    public barang18 ambilbarang(){
        if (!cekkosong()){
            barang18 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari gudang");
            System.out.println("Kode unik dalam biner: " + desimalbiner(delete.kode));
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
    public String desimalbiner (int kode){
        stackkonversi18 stack = new stackkonversi18();
        while (kode > 0){
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isempty()) {
            biner += stack.pop();
        }
        return biner;
    }
    public barang18 barangbawah() {
        if (top != -1) {
            barang18 barangbawah = tumpukan[0];
            System.out.println("Barang terbawah: " + barangbawah.nama);
            return barangbawah;
        } else {
            System.out.println("Tumpukan barang kosong");
            return null;
        }
    }

    public boolean caribarang(int kode) {
        for (int i = 0; i <= top; i++) {
            if (tumpukan[i].kode == kode) {
                return true;
            }
        }
        return false;
    }

}
