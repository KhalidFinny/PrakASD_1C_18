package P6.Hotel;

import P6.Buku.daftarbuku18;

public class hotelmain18 {
    public static void main(String[] args) {
        hotel18 hotel = new hotel18("Harris", "Malang", 750000,(byte)4, 10 );
        hotel18 hotel1 = new hotel18("Hilton Bali Resort", "Bali", 2200000, (byte)5, 11);
        hotel18 hotel2 = new hotel18("D'Paragon Ijen", "Malang", 162000, (byte)1, 30);
        hotel18 hotel3 = new hotel18("Sentral Cawang", "Jakarta", 450000, (byte)3, 25);
        hotel18 hotel4 = new hotel18("Sahid", "Surabaya", 250000, (byte)2, 50);

        hotelservice18 listhotel = new hotelservice18();
        listhotel.tambah(hotel);
        listhotel.tambah(hotel1);
        listhotel.tambah(hotel2);
        listhotel.tambah(hotel3);
        listhotel.tambah(hotel4);

        System.out.println("=============================");
        System.out.println("List hotel sebelum di sorting");
        listhotel.tampil();

        System.out.println("================================================================");
        System.out.println("List hotel setelah disorting secara asc harga dengan selection sort");
//        listhotel.bubblesort();
        listhotel.selectionsort();
        listhotel.tampil();
    }

}
