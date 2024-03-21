package P5.Latihan1;

public class mobil18 {
    int[] acc;
    double[] pwr;

    public mobil18(int[] acc, double[] pwr) {
        this.acc = acc;
        this.pwr = pwr;
    }

    public int maxAcell(int[] acc) {
        return maxAcc(acc, 0, acc.length - 1);
    }

    public int maxAcc(int[] acc, int l, int r) {
        if (l == r) {
            return acc[l];
        }
            int mid = (l + r) / 2;
            int maxAccl = maxAcc(acc, l, mid);
            int maxAccr = maxAcc(acc, mid + 1, r);
            return Math.max(maxAccl, maxAccr);
    }

    public int minAcell(int[] acc) {
        return minAcc(acc, 0, acc.length - 1);
    }

    public int minAcc(int[] acc, int l, int r) {
        if (l == r) {
            return acc[l];
        }
        int mid = (l + r) / 2;
        int minAccl = minAcc(acc, l, mid);
        int minAccr = minAcc(acc, mid + 1, r);

        return Math.min(minAccl, minAccr);
    }
    public double avgpwr(double[] pwr) {
        double penjumlahan = 0;
        int pembagian = 0;
        for (int i = 0; i < pwr.length; i++) {
            penjumlahan += pwr[i];
            pembagian++;
        }
        if (pembagian != 0) {
            return penjumlahan / pembagian;
        } else {
            return 0.0;
        }
    }
}

