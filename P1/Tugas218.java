package P1;

import java.util.Scanner;

public class Tugas218 {
    public static void main(String[] args) {

        Scanner finny18 = new Scanner(System.in);
        while (true) {
            System.out.println("");
            System.out.println("================================================================");
            System.out.println("Menu:");
            System.out.println("1. Kecepatan");
            System.out.println("2. Jarak");
            System.out.println("3. Waktu");
            System.out.println("4. Keluar");
            System.out.println("=================================================================");
            System.out.print("Choose a menu: ");
            int menu = finny18.nextInt();

            switch (menu) {
                case 1:
                    kecepatan();
                    break;
                case 2:
                    jarak();
                    break;
                case 3:
                    waktu();
                    break;
                case 4:
                    System.out.println("Bye bye");
                    break;
                default:
                    System.out.println("Menu tidak valid!");
            }
            break;

        }

    }

    public static void kecepatan() {
        Scanner finny18 = new Scanner(System.in);

        System.out.print("Masukkan jarak (m): ");
        double jarak = finny18.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double waktu = finny18.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan adalah " + kecepatan + " m/s");

    }

    public static void jarak() {
        Scanner finny18 = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = finny18.nextDouble();
        System.out.print("Masukkan waktu (s): ");
        double waktu = finny18.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("Jarak adalah " + jarak + " meter");

    }

    public static void waktu() {
        Scanner finny18 = new Scanner(System.in);

        System.out.print("Masukkan jarak (m): ");
        double jarak = finny18.nextDouble();
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = finny18.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu adalah " + waktu + " detik");

    }

}
