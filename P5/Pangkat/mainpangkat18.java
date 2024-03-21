package P5.Pangkat;

import java.util.Scanner;

public class mainpangkat18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        System.out.println("==================");
        System.out.print("Masukkan elemen yang akan dihitung: ");
        int element = sc18.nextInt();
        pangkat18[] power = new pangkat18[element];
        for (int i = 0; i < element; i++) {
            power[i] = new pangkat18(0, 0);
            System.out.print("Masukkan nilai yang akan dipangkatkan: ");
            power[i].nilai = sc18.nextInt();
            System.out.print("Masukkan pangkat: ");
            power[i].pangkat = sc18.nextInt();
        }
        System.out.println("==========================");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide Conquer");
        System.out.println("==========================");
        System.out.print("Pilih: ");
        int menu = sc18.nextInt();

        switch (menu) {
            case 1:
                System.out.println("Hasil Pangkat Brute Force: ");
                for (int i = 0; i < element; i++) {
                    System.out.println("Hasil dari " + power[i].nilai + " pangkat " + power[i].pangkat + " adalah "
                            + power[i].pangkatBF(power[i].nilai, power[i].pangkat));
                }
                break;
            case 2:
                System.out.println("Hasil Pangkat Divide and Conquer: ");
                for (int i = 0; i < element; i++) {
                    System.out.println("Hasil dari " + power[i].nilai + " pangkat " + power[i].pangkat + " adalah "
                            + power[i].pangkatDC(power[i].nilai, power[i].pangkat));
                }
                break;
            default:
                break;


        }
    }
}