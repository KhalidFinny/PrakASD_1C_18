package P3.AOBPersegiPanjang;

import P3.ArrayBalok.segitiga18;

public class BangunDatar18 {
    segitiga18[] segitiga;
    PersegiPanjang18[] PersegiPanjang18;

    void tambahsgt(segitiga18[] segitiga18) {
        this.segitiga = segitiga18;
    }

    void tambahpp(PersegiPanjang18[] PersegiPanjang18) {
        this.PersegiPanjang18 = PersegiPanjang18;
    }

    void tampilBangunDatar() {
        for (int i = 0; i < PersegiPanjang18.length; i++) {
            System.out.println("persegi panjnag " + (i + 1));
            System.out.println("panjang: " + PersegiPanjang18[i].lebar);
            System.out.println("panjang: " + PersegiPanjang18[i].panjang);

        }
        System.out.println("===============================================");
        for (int j = 0; j < segitiga.length; j++) {
            System.out.println("segitiga " + (j + 1));
            System.out.println("alas " + segitiga[j].alas);
            System.out.println("tinggi " + segitiga[j].tinggi);

        }
    }

}
