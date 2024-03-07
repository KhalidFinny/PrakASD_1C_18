package P3.ArrayBalok;

public class Balok18 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok18() {
        panjang = 0;
        lebar = 0;
        tinggi = 0;
    }

    public Balok18(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;

    }

    public Balok18(int t) {
        tinggi = t;

    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
