package P5.Faktorial;

import java.util.Scanner;

public class mainfaktorial18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        System.out.println("=================");
        System.out.print("Masukkan jumlah elemen: ");
        int ijml = sc18.nextInt();

        faktorial18[] fk = new faktorial18[10];
        for (int i = 0; i < ijml; i++) {
            fk[i] =new faktorial18();
            System.out.println("Masukkan nilai data ke-" +(i+1)+ ": ");
            fk[i].nilai = sc18.nextInt();
        }
        System.out.println("Hasil Brute Force: ");
        for (int i = 0; i < ijml; i++) {
            System.out.println("Hasil perhitungan menggunakan Brute Force adalah: "+ fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("Hasil Divide Conquer: ");
        for (int i = 0; i < ijml; i++) {
            System.out.println("Hasil perhitungan menggunakan Divide Conquer adalah: " + fk[i].faktorialDC(fk[i].nilai));


        }

    }
}
