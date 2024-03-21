package P5.Latihan1;

public class mobilmain18 {
    public static void main(String[] args) {
       int[] acc = {6816, 3921, 4360, 4058, 6255, 3700, 4180, 4180};
       double[] pwr = {728, 575, 657, 609, 703, 553, 609, 631};

       mobil18 mobil = new mobil18(acc, pwr);
       int max = mobil.maxAcell(acc);
       int min = mobil.minAcell(acc);
       double avg = mobil.avgpwr(pwr);
        System.out.println("Akselerasi mobil tertinggi adalah: " + max);
        System.out.println("Akselerasi mobil terendah adalah: " + min);
        System.out.println("Rata-rata tenaga mobil adalah: "+ avg);
    }
}
