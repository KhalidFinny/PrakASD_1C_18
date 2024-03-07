package P3.ArrayBalok;

public class Balok18 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok18(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;

    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }
}
