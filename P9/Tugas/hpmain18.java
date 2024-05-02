package P9.Tugas;
import java.util.Scanner;

public class hpmain18 {
        public static void main(String[] args) {
            Scanner finny18 = new Scanner(System.in);
            System.out.print("Masukkan kapsitas Queue: ");
            int sabar = finny18.nextInt();
            antripembeli18 antricoy = new antripembeli18(sabar);

            int pilih;
            do {
                menu();
                pilih = finny18.nextInt();
                switch (pilih) {
                    case 1:
                        System.out.print("Nama:  ");
                        String nama = finny18.next();
                        System.out.print("No HP: ");
                        int nohp = finny18.nextInt();
                        pembeli18 pm = new pembeli18(nama, nohp);
                        finny18.nextLine();
                        antricoy.enqueue(pm);
                        break;
                    case 2:
                        pembeli18 data = antricoy.dequeue();
                        if (!"".equals(data.nama) && data.nohp !=0) {
                            System.out.println("Antrian yang keluar: " + data.nama + " " + data.nohp);
                            break;
                        }
                    case 3:
                        antricoy.peek();
                        break;
                    case 4:
                        antricoy.print();
                        break;
                    case 5:
                        System.out.println("Antrian paling belakang: ");
                        antricoy.peekrear();
                        break;
                    case 6:
                        System.out.println("====================================");
                        System.out.println("Pencarian posisi: ");
                        System.out.print("Cari manusia: ");
                        String name = finny18.next();
                        String hasilPencarian = antricoy.peekposition(name);
                        System.out.println("Hasil pencarian anda: " + hasilPencarian);
                        break;
                    case 7:
                        antricoy.datapembeli();
                }
            } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
        }
        public static void menu() {
            System.out.println("Masukkan operasi yang diinginkan");
            System.out.println("1. Antrian baru");
            System.out.println("2. Antrian keluar");
            System.out.println("3. Antrian terdepan");
            System.out.println("4. Cek antrian");
            System.out.println("5. Cek antrian paling belakang");
            System.out.println("6. Cari posisi antrian");
            System.out.println("7. Data pembeli");
            System.out.println("-------------------------------");

        }
    }

