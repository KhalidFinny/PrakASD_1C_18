package P3.AOBPersegiPanjang;

import P3.ArrayBalok.segitiga18;

public class BangunMain18 {
    public static void main(String[] args) {
        segitiga18 sg1 = new segitiga18(5, 10);
        segitiga18 sg2 = new segitiga18(10, 15);
        segitiga18 sg3 = new segitiga18(15, 20);
        PersegiPanjang18 pp1 = new PersegiPanjang18(5, 10);
        PersegiPanjang18 pp2 = new PersegiPanjang18(2, 8);
        PersegiPanjang18 pp3 = new PersegiPanjang18(10, 15);

        segitiga18[] s = new segitiga18[3];
        PersegiPanjang18[] p = new PersegiPanjang18[3];

        s[0] = sg1;
        s[1] = sg2;
        s[2] = sg3;
        p[0] = pp1;
        p[1] = pp2;
        p[2] = pp3;

        BangunDatar18 bd = new BangunDatar18();
        bd.tambahsgt(s);
        bd.tambahpp(p);
        bd.tampilBangunDatar();
    }

}
