package P3.Mahasiswa;

public class mahasiswa18 {
    public String nama;
    public String nim;
    public String jenisKelamin;
    public double ipk;

    public double hitungRataIPK(mahasiswa18[] mahasiswa18) {
        double totalIPK = 0;
        for (mahasiswa18 mahasiswa : mahasiswa18) {
            totalIPK += mahasiswa.ipk;
        }
        return totalIPK / mahasiswa18.length;
    }

    public mahasiswa18 mahasiswaDenganIPKTerbesar(mahasiswa18[] mahasiswa18) {
        mahasiswa18 mahasiswaTerbesar = mahasiswa18[0];
        for (mahasiswa18 mahasiswa : mahasiswa18) {
            if (mahasiswa.ipk > mahasiswaTerbesar.ipk) {
                mahasiswaTerbesar = mahasiswa;
            }
        }
        return mahasiswaTerbesar;
    }

}
