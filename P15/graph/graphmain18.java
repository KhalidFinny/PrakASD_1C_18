package P15.graph;

import java.util.Scanner;

public class graphmain18 {
    public static void main(String[] args) throws Exception {
        Scanner finny18 = new Scanner(System.in);
        graph18 gedung = new graph18(6);
//        gedung.addedge(0, 1, 50, true);
//        gedung.addedge(0, 2, 100, true);
//        gedung.addedge(1, 3, 70, true);
//        gedung.addedge(2, 3, 40, true);
//        gedung.addedge(3, 4, 60, true);
//        gedung.addedge(4, 5, 80, true);
//        gedung.degree(0, true);
//        gedung.printgraph();
//        gedung.removeedge(1, 3);
//        gedung.printgraph();

//        graphmatriks18 gedung = new graphmatriks18(4);
//        gedung.makedege(0, 1, 50);
//        gedung.makedege(1, 0, 60);
//        gedung.makedege(1, 2, 70);
//        gedung.makedege(2, 1, 80);
//        gedung.makedege(2, 3, 40);
//        gedung.makedege(3, 0, 90);
//        gedung.printgraph();
//        System.out.println("Hasil setelah penghapusan edge: ");
//        gedung.removeedge(2, 1);
//        gedung.printgraph();
//        System.out.println("Degree dari node 1 adalah: " + gedung.degree(1));

        int pilihan;
        do {
            System.out.println("\nMenu Program:");
            System.out.println("1) Add Edge");
            System.out.println("2) Remove Edge");
            System.out.println("3) Degree");
            System.out.println("4) Print Graph");
            System.out.println("5) Cek Edge");
            System.out.println("6) Keluar");

            System.out.print("Pilih menu: ");
            pilihan = finny18.nextInt();

            switch (pilihan) {
                case 1:
                    gedung.addedge(0, 1, 50, true);
                    gedung.addedge(0, 2, 100, true);
                    gedung.addedge(1, 3, 70, true);
                    gedung.addedge(2, 3, 40, true);
                    gedung.addedge(3, 4, 60, true);
                    gedung.addedge(4, 5, 80, true);
                    System.out.println("Berhasil ditambahkan! ");
                    break;
                case 2:
                    gedung.removeedge(1, 3);
                    gedung.printgraph();
                    break;
                case 3:
                    gedung.degree(0, true);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Graf: ");
                    gedung.printgraph();
                    break;
                case 5:
                    System.out.print("Masukkan asal: ");
                    int asal = finny18.nextInt();
                    System.out.print("Masukkan tujuan: ");
                    int tujuan = finny18.nextInt();
                    if (gedung.cekedge(asal, tujuan)) {
                        System.out.println("Edge ada.");
                    } else {
                        System.out.println("Edge tidak ada.");
                    }
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");

            }
        } while (pilihan != 6);
    }
}
