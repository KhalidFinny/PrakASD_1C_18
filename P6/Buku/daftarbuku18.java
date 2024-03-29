package P6.Buku;

public class daftarbuku18 {
    buku18[] listbk = new buku18[5];
    int idx;
    void tambah(buku18 m){
        if (idx < listbk.length){
            listbk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for (buku18 m : listbk){
            m.tampildatabuku();
        }
    }
//    void bubblesort(){
//        for (int i = 0; i < listbk.length - 1; i++) {
//            for (int j = 0; j < listbk.length- i - 1; j++) {
//                if (listbk[j].stok > listbk[j+1].stok){
//                    buku18 tempbk = listbk[j];
//                    listbk[j] = listbk[j+1];
//                    listbk[j+1] = tempbk;
//
//                }
//
//            }
//
//        }
//    }
//    void selectionsort(){
//        for (int i = 0; i < listbk.length - 1; i++) {
//            int idxmax = i;
//            for (int j = i + 1; j < listbk.length; j++) {
//                if (listbk[j].stok > listbk[idxmax].stok){
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
    void insertionsort(){
        for (int i = 1; i < listbk.length ; i++) {
            buku18 temp =  listbk[i];
            int j = i;
            while (j > 0 && listbk[j - 1].stok < temp.stok){
                listbk[j] = listbk[j - 1];
                j--;
            }
            listbk[j] =temp;

        }
    }
}

