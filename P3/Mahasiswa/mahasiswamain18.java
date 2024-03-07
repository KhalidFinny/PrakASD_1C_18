package P3.Mahasiswa;

import java.util.Scanner;

public class mahasiswamain18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        mahasiswa18[] mhsArray = new mahasiswa18[3];
        for (int i = 0; i < mhsArray.length; i++) {
            mhsArray[i] = new mahasiswa18();
            System.out.println("Mahasiswa ke " + (i + 1));
            System.out.print("Masukkan nama mahasiswa: ");
            mhsArray[i].nama = sc18.next();
            System.out.print("Masukkan NIM mahasiswa: ");
            mhsArray[i].nim = sc18.next();
            System.out.print("Masukkan Jenis kelamin: ");
            mhsArray[i].jenisKelamin = sc18.next();
            System.out.print("Masukkan IPK: ");
            mhsArray[i].ipk = sc18.nextDouble();
        }
        System.out.println("============================");
        for (int i = 0; i < mhsArray.length; i++) {
            System.out.println("Mahasiswa ke " + (i + 1));
            System.out.println("Nama: " + mhsArray[i].nama);
            System.out.println("NIM: " + mhsArray[i].nim);
            System.out.println("Jenis kelamin: " + mhsArray[i].jenisKelamin);
            System.out.println("IPK: " + mhsArray[i].ipk);

        }
        int i = 0;
        double rataRataIPK = mhsArray[i].hitungRataIPK(mhsArray);
        System.out.println("Rata-rata IPK mahasiswa: " + rataRataIPK);
        mahasiswa18 mahasiswaTerbesar = mhsArray[i].mahasiswaDenganIPKTerbesar(mhsArray);
        System.out.println("Mahasiswa dengan IPK terbesar:");
        System.out.println("Nama: " + mahasiswaTerbesar.nama);
        System.out.println("NIM: " + mahasiswaTerbesar.nim);
        System.out.println("Jenis Kelamin: " + mahasiswaTerbesar.jenisKelamin);
        System.out.println("IPK: " + mahasiswaTerbesar.ipk);
        sc18.close();
    }

}
