package P9.praktikum2;

import java.util.Scanner;

public class queuemain18 {
    public static void main(String[] args) {
        Scanner finny18 = new Scanner(System.in);
        System.out.print("Masukkan kapsitas Queue: ");
        int jumlah = finny18.nextInt();
        queuenasabah18 antri = new queuenasabah18(jumlah);

        int pilih;
        do {
            menu();
            pilih = finny18.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = finny18.next();
                    System.out.print("Nama:  ");
                    String nama = finny18.next();
                    System.out.print("Alamat: ");
                    String alamat = finny18.next();
                    System.out.print("Umur: ");
                    int umur = finny18.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = finny18.nextDouble();
                    nasabah18 nb = new nasabah18(norek, nama, alamat, umur, saldo);
                    finny18.nextLine();
                    antri.enqueue(nb);
                    break;
                case 2:
                    nasabah18 data = antri.dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat)
                    && data.umur != 0 && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama
                                + " " + data.alamat + " " + data.umur + " " +data.saldo );
                    break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    System.out.println("Antrian paling belakang: ");
                    antri.peekrear();
                    break;

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Antrian terdepan");
        System.out.println("4. Cek antrian");
        System.out.println("5. Cek antrian paling belakang");
        System.out.println("-------------------------------");

    }
}
