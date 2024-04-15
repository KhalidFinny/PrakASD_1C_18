package P7.TestSearching;

public class pencarianbuku18 {
    buku18 listbk[] = new buku18[5];
    int jumlahBuku;

    public void tambah(buku18 data) {
        if (jumlahBuku < listbk.length) {
            listbk[jumlahBuku] = data;
            jumlahBuku++;
        } else {
            System.out.println("Array sudah penuh");
        }
    }

    void tampil() {
        for (buku18 m : listbk) {
            m.tampildata();
        }
    }

    public void seqsearch(String cari) {
        String hasil = "buku tidak ditemukan";
        for (int i = 0; i < listbk.length; i++) {
            if (listbk[i].judulbuku.equalsIgnoreCase(cari)) {
                break;
            }
        }
    }

    public void data(String cari, String pos) {
        if (!pos.equals("Judul buku tidak ditemukan.")) {
            int posisi = Integer.parseInt(pos.split(": ")[1]);
            System.out.println("================================");
            System.out.println("Kode buku: " + listbk[posisi].kodebuku);
            System.out.println("Judul buku: " + listbk[posisi].judulbuku);
            System.out.println("Tahun terbit: " + listbk[posisi].tahunterbit);
            System.out.println("Nama pengarang: " + listbk[posisi].pengarang);
            System.out.println("Sisa stock: " + listbk[posisi].stock);
        } else {
            System.out.println(pos);
        }
    }

    public String binarystring(String cari, int left, int right) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            int comparison = listbk[mid].judulbuku.compareTo(cari);
            if (comparison == 0) {
                return "Posisi: " + mid;
            }
            if (comparison < 0) {
                return binarystring(cari, mid + 1, right);
            } else {
                return binarystring(cari, left, mid - 1);
            }
        }
        return "Judul buku tidak ditemukan.";
    }

    public void tampilposisi(String cari, String pos) {
        System.out.println(pos);
    }

    public buku18 findBuku(String cari) {
        for (int i = 0; i < listbk.length; i++) {
            if (listbk[i].judulbuku.equalsIgnoreCase(cari)) {
                return listbk[i];
            }

        }
        return null;
    }

    public void selectionsort() {
        for (int i = 0; i < listbk.length - 1; i++) {
            String minjudul = listbk[i].judulbuku;
            int idx = i;
            for (int j = i + 1; j < listbk.length; j++) {
                if (listbk[j].judulbuku.compareTo(minjudul) < 0) {
                    minjudul = listbk[j].judulbuku;
                    idx = j;
                }
            }
            if (idx != i) {
                buku18 temp = listbk[i];
                listbk[i] = listbk[idx];
                listbk[idx] = temp;
            }
        }
    }
}