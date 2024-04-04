package P7.TestSearching;

import P6.Hotel.hotel18;

public class pencarianbuku18 {
    buku18 listbk[] = new buku18[5];
    int idx;

    void tambah(buku18 m) {
        if (idx < listbk.length) {
            listbk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }

    void tampil() {
        for (buku18 m : listbk) {
            m.tampildata();
        }
    }
//    public int seqsearch(int cari) {
//        int posisi = -1;
//        for (int i = 0; i < listbk.length; i++) {
//            if (listbk[i].kodebuku == cari) {
//                posisi = i;
//                break;
//            }
//        }
//        return posisi;
//    }

        public void tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data: " + x + " ditemukan pada indeks " + pos);

        } else {
            System.out.println("data: " + x + " tidak ditemukan");
        }
    }
    public void data(int x, int pos){

        if (pos != -1) {
            System.out.println("================================");
            System.out.println("Kode buku: " + x);
            System.out.println("Judul buku: " + listbk[pos].judulbuku);
            System.out.println("Tahun terbit: " + listbk[pos].tahunterbit);
            System.out.println("Nama pengarang: " + listbk[pos].pengarang);
            System.out.println("Sisa stock: " + listbk[pos].stock);
        } else {
            System.out.println("data: " + x + " tidak ditemukan");
        }
    }
//    public buku18 findBuku(int cari) {
//        for (int i = 0; i < listbk.length; i++) {
//            if (listbk[i].kodebuku == cari) {
//                return listbk[i];
//            }
//
//        }
//        return null;
//    }
public int binary(int cari, int left, int right) {
    if (right >= left) {
        int mid = left + (right - left) / 2;

        if (listbk[mid].kodebuku == cari) {
            return mid;
        }

        if (listbk[mid].kodebuku < cari) {
            return binary(cari, left, mid - 1);
        } else {
            return binary(cari, mid + 1, right);
        }
    }

    // Element not found
    return -1;
}


//    public void selectionsort() {
//        for (int i = 0; i < listbk.length - 1; i++) {
//            int idxmax = i;
//            for (int j = i + 1; j < listbk.length; j++) {
//                if (listbk[j].kodebuku > listbk[idxmax].kodebuku) {
//                    idxmax = j;
//                }
//
//            }
//            buku18 tempbuku = listbk[idxmax];
//            listbk[idxmax] = listbk[i];
//            listbk[i] = tempbuku;
//
//        }
//    }

}
