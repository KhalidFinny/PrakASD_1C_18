package P1;

import java.util.Scanner;

public class Perulangan18 {
    public static void main(String[] args) {
        Scanner finny18 = new Scanner(System.in);
        System.out.print("Input NIM: ");
        String nim = finny18.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        if (n < 10) {
            n += 10;
        }
        System.out.println("n: " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        finny18.close();
    }
}
