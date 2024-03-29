package P6.Hotel;

public class hotel18 {
    String nama, kota;
    int harga, rooms;
    byte bintang;

    public hotel18 ( String nama, String kota, int harga, byte bintang, int rooms ){
        this.nama = nama;
        this.kota = kota;
        this.harga = harga;
        this.bintang = bintang;
        this.rooms = rooms;
    }
    public void tampildatabuku(){
        System.out.println("======================");
        System.out.println("Nama hotel: " + nama);
        System.out.println("Kota : " + kota);
        System.out.println("Harga hotel: " + harga);
        System.out.println("Bintang : " + bintang);
        System.out.println("Tersedia kamar : " + rooms );


    }
}
