package P9.praktikum1;

import java.util.Scanner;

public class queuemain18 {
    public static void main(String[] args) {
        Scanner finny18 = new Scanner(System.in);

        System.out.print("Masukkan kapsitas Queue: ");
        int n = finny18.nextInt();
        queue18 q = new queue18(n);

        int pilih;
        do {
            menu();
            pilih = finny18.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan data baru: ");
                    int datamasuk = finny18.nextInt();
                    q.enqueue(datamasuk);
                    break;
                case 2:
                    int datakeluar = q.dequeue();
                    if (datakeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + datakeluar);
                        break;
                    }
                case 3:
                    q.print();
                    break;
                case 4:
                    q.peek();
                    break;
                case 5:
                    q.clear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-------------------------------");

    }
}
