package P6.Hotel;

import P6.Buku.buku18;

public class hotelservice18 {
    hotel18[] listhotel = new hotel18[5];
    int idx;

    public void tambah(hotel18 h) {
        if (idx < listhotel.length) {
            listhotel[idx] = h;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    void tampil(){
        for (hotel18 h : listhotel){
            h.tampildatabuku();
        }
    }
    void bubblesort(){
        for (int i = 0; i < listhotel.length - 1; i++) {
            for (int j = 0; j < listhotel.length- i - 1; j++) {
                if (listhotel[j].harga > listhotel[j+1].harga){
                    hotel18 temphotel = listhotel[j];
                    listhotel[j] = listhotel[j+1];
                    listhotel[j+1] = temphotel;

                }

            }

        }
}

}
