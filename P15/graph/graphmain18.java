package P15.graph;

import java.util.Scanner;

public class graphmain18 {
    public static void main(String[] args) throws Exception {
        Scanner finny10 = new Scanner(System.in);
        graph18 gedung = new graph18(6);
        gedung.addedge(0, 1, 50, true);
        gedung.addedge(0, 2, 100, true);
        gedung.addedge(1, 3, 70, true);
        gedung.addedge(2, 3, 40, true);
        gedung.addedge(3, 4, 60, true);
        gedung.addedge(4, 5, 80, true);
        gedung.degree(0, true);
        gedung.printgraph();
        gedung.removeedge(1, 3);
        gedung.printgraph();
        System.out.print("Masukan gedung asal: ");
        int asal = finny10.nextInt();
        System.out.print("Masukan gedung tujuan: ");
        int tujuan = finny10.nextInt();
        if (gedung.berdekatan(asal, tujuan)) {
            System.out.println("Gedung " + (char)('A' + asal) + " dan " + (char)('A' + tujuan) + " bertetangga");
        } else {
            System.out.println("Gedung " + (char)('A' + asal) + " dan " + (char)('A' + tujuan) + " tidak bertetangga");
        }
    }
}
